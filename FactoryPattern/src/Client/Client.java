package Client;

//main - visitor - iterator - composite
import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.Operation;
import Composite.PlusOperation;
import Factory.IteratorFactory;
import Iterator.AbstractIterator;
import Iterator.PostOrderIterator;
import Iterator.InOrderIterator;
import Leaf.Operand;

public class Client {

	public static void main(String[] args) {
		Operand varA = new Operand("a", 3);
		Operand varB = new Operand("b", 7);
		Operand varC = new Operand("c", 12);
		Operand varD = new Operand("d", 2);

		Operation root = new PlusOperation(new MultiOperation(
				new PlusOperation(varA, varB), new MinusOperation(varA, varC)),
				new MinusOperation(new MultiOperation(varB, varD), varA));
		
		IteratorFactory iteratorFactory = new IteratorFactory();
		
		AbstractIterator print = iteratorFactory.getIterator("InOrderIterator");
		
		AbstractIterator evaluate = iteratorFactory.getIterator("PostOrderIterator");
		
		AbstractIterator polishNotation = iteratorFactory.getIterator("PreOrderIterator");
		
		print.handle(root);
		
		System.out.print(" = " + evaluate.handle(root) + "\n");
		
		polishNotation.handle(root);
		
		

	}

}
