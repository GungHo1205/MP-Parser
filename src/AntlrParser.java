import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class AntlrParser {

    public static void main(String[] args) throws IOException{
        int x = 1;
        ArrayList<String> strings = new ArrayList<>();
        try {
            String src = "test.txt";
            Scanner sc = new Scanner(new File(src));
            while (sc.hasNextLine()) {
                String input = sc.nextLine();
                CharStream cs = fromString(input);
                gLexer lexer = new gLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                gParser parser = new gParser(tokens);
                ParseTree tree = parser.prule();
                boolean checkString = checkMatch(cs, tree.getText());

                boolean acceptOrReject = true;
                if (parser.getNumberOfSyntaxErrors() > 0) {
                    acceptOrReject = false;
                }

                if (acceptOrReject && checkString) {
//                    System.out.println("input = " + input);
                    strings.add(x + " | ACCEPT");
                } else {
//                    System.out.println("input = " + input);
                    strings.add(x + " | REJECT");
                }
                x++;
            }
            for (String s : strings) {
                System.out.println(s);
            }
        }
        catch (IOException e){
        }
    }

    public static boolean checkMatch(CharStream input, String tree){
        if(input.toString().equals(tree)){
            return true;
        }else{
            return false;
        }

    }

}
