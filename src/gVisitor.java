// Generated from C:/Users/Josh/IdeaProjects/CMPILER PE1\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(gParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(gParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(gParser.AContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(gParser.DContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(gParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(gParser.GContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#h}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(gParser.HContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ(gParser.JContext ctx);
}