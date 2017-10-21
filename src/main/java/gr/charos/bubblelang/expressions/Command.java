package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.model.ExecutionResult;

public interface Command {
	public ExecutionResult execute(Context c, Heap h);
	
	

}
