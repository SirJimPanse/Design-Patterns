package Visitor;

import java.util.Stack;

import Composite.DiviOperation;
import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.PlusOperation;
import Leaf.Operand;

public class EvaluateVisitor implements Visitor {
	Stack<Double> stack = new Stack<Double>();
	double value = 0;

	@Override
	public void visit(PlusOperation plus) {
		value = stack.pop() + stack.pop();
		stack.push(value);
	}

	@Override
	public void visit(MinusOperation minus) {
		value = stack.pop() - stack.pop();
		stack.push(value);
	}

	@Override
	public void visit(MultiOperation multi) {
		value = stack.pop() * stack.pop();
		stack.push(value);
	}

	@Override
	public void visit(DiviOperation divi) {
		value = stack.pop() / stack.pop();
		stack.push(value);
	}

	@Override
	public void visit(Operand operand) {
		stack.push(operand.getNum());
	}

	public double getResult() {
		return value;

	}

}
