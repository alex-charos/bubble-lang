package gr.charos.bubblelang.core;

import gr.charos.bubblelang.model.ExecutionResult;

public interface Heap {
	
	public ExecutionResult add(ExecutionResult er);
	public ExecutionResult remove(ExecutionResult er);
	public ExecutionResult get(ExecutionResult er);

}
