package gr.charos.bubbletalk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gr.charos.bubblelang.commands.Command;
import gr.charos.bubblelang.commands.impl.Create;
import gr.charos.bubblelang.commands.impl.Show;
import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.core.MapHeap;
import gr.charos.bubblelang.expressions.CVContext;
import gr.charos.bubblelang.expressions.Context;
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
		Context c = new CVContext("my-cv", cv);
		Variable va = new Variable();
		Heap h = new MapHeap();
		
		
		Expression e = new ThreeWordLine(create, c, va, h);
		e.evaluate();
		
		
		assertTrue(h.get("my-cv")!=null);
		assertEquals(cv, h.get("my-cv"));
	}
	
	@Test
	public void givenAnItemInTheHeapItShouldReturnIt() {
		ExecutionResult cv = new CV();
		Command create = new Create();
		Context c = new CVContext("my-cv", cv);
		Variable va = new Variable();
		Heap h = new MapHeap();
		Expression e = new ThreeWordLine(create, c, va, h);
		e.evaluate();
		
		Command show = new Show();
		Context c1 = new CVContext("my-cv", null);
		
		
		Expression e1 = new ThreeWordLine(show, c1, null, h);
		ExecutionResult er = e1.evaluate();
		
		
		assertNotNull(er);
		assertEquals(cv, er);
	}


}
