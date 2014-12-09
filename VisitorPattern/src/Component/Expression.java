package Component;

import Visitor.Visitor;

public interface Expression {
	
	public Expression getLeft();
	
	public Expression getRight();
	
	public void accept(Visitor visitor);
}
