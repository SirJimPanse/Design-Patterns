package Iterator;

import Visitor.EvaluateVisitor;
import Component.Expression;

public class EvaluateIterator implements AbstractIterator {
	EvaluateVisitor evaluateVisitor = new EvaluateVisitor();

	@Override
	public double handle(Expression next) {
		if (next.getLeft() != null) {
			handle(next.getLeft());
		}
		if (next.getRight() != null) {
			handle(next.getRight());
		}
		
		next.accept(evaluateVisitor);
		
		return evaluateVisitor.getResult();
	}
}
