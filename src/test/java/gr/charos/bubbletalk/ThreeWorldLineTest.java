package gr.charos.bubbletalk;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.core.ListHeap;
import gr.charos.bubblelang.expressions.CVContext;
import gr.charos.bubblelang.expressions.Command;
import gr.charos.bubblelang.expressions.Context;
import gr.charos.bubblelang.expressions.Create;
import gr.charos.bubblelang.expressions.Expression;
import gr.charos.bubblelang.expressions.ThreeWordLine;
import gr.charos.bubblelang.expressions.Variable;
import gr.charos.bubblelang.model.CV;
import gr.charos.bubblelang.model.ExecutionResult;

public class ThreeWorldLineTest {
	
	@Test
	public void givenEmptyHeapACreateCommandShouldAddToIt() {
		ExecutionResult cv = new CV();
		
		
		Command create = new Create();
		Context c = new CVContext(cv);
		
		Variable va = new Variable();
		Heap h = new ListHeap();
		
		
		Expression e = new ThreeWordLine(create, c, va, h);
		e.evaluate();
		assertTrue(h.get(cv)!=null);
		
	}

}
