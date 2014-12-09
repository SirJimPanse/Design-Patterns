package Visitor;

import Composite.DiviOperation;
import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.PlusOperation;
import Leaf.Operand;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(PlusOperation plus) {
		System.out.print(" " + "+" + " ");
	}

	@Override
	public void visit(MinusOperation minus) {
		System.out.print(" " + "-" + " ");
		
	}

	@Override
	public void visit(MultiOperation multi) {
		System.out.print(" " + "*" + " ");
		
	}

	@Override
	public void visit(DiviOperation divi) {
		System.out.print(" " + "/" + " ");
		
	}

	@Override
	public void visit(Operand operand) {
		System.out.print(" " + operand.getNum() + " ");
	}

}
