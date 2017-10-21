package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.ExecutionResult;

public abstract class Context {
	
	public Context(ExecutionResult model) {
		this.model = model;
	}
	
	protected ExecutionResult model;

	public abstract ExecutionResult getModel();
	
	

}
