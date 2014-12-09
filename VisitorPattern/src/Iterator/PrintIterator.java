package Iterator;

import Visitor.PrintVisitor;
import Component.Expression;

public class PrintIterator implements AbstractIterator {
	PrintVisitor printVisitor = new PrintVisitor();

	@Override
	public double handle(Expression exp) {
		if (exp.getLeft() != null) {
			System.out.print("(");
			handle(exp.getLeft());
		}
			exp.accept(printVisitor);

		if (exp.getRight() != null) {
			handle(exp.getRight());
			System.out.print(")");
		}
		return 0;
	}

}
