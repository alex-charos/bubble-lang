package gr.charos.bubblelang.core;

import gr.charos.bubblelang.model.ExecutionResult;

public interface Heap {
	
	public ExecutionResult add(String name,ExecutionResult er);
	public ExecutionResult remove(String name);
	public ExecutionResult get(String name);

}
