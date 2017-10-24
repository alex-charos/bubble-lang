package gr.charos.bubblelang.commands;

import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.expressions.Context;
import gr.charos.bubblelang.model.ExecutionResult;

public interface Command {
	public ExecutionResult execute(Context c, Heap h);
	
	

}
