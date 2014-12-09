package Visitor;

import Composite.DiviOperation;
import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.PlusOperation;
import Leaf.Operand;

public interface Visitor {
	
	public void visit(PlusOperation plus);
	
	public void visit(MinusOperation minus);
	
	public void visit(MultiOperation multi);
	
	public void visit(DiviOperation divi);
	
	public void visit(Operand numeric);

}
