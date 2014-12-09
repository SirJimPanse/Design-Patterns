package Iterator;

import Component.Expression;
import Visitor.PrintVisitor;

public class PreOrderIterator implements AbstractIterator {
	PrintVisitor printVisitor = new PrintVisitor();

	@Override
	public double handle(Expression exp) {
		exp.accept(printVisitor);
		if (exp.getLeft() != null) {
			handle(exp.getLeft());
		}
		if (exp.getRight() != null) {
			handle(exp.getRight());
		}
		
		return 0;
	}

}
