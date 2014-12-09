package Client;

//main - visitor - iterator - composite
import Composite.MinusOperation;
import Composite.MultiOperation;
import Composite.Operation;
import Composite.PlusOperation;
import Iterator.EvaluateIterator;
import Iterator.PrintIterator;
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

		PrintIterator printIterator = new PrintIterator();
		printIterator.handle(root);

		EvaluateIterator evaluateIterator = new EvaluateIterator();
		System.out.print(" = " + evaluateIterator.handle(root));

	}

}
