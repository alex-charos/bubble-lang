package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.ExecutionResult;

public abstract class Context {
	String name;
	ExecutionResult model;
	
	public Context(String name, ExecutionResult model) {
		this.name = name;
		this.model = model;
	}
	
	

	public abstract ExecutionResult getModel();
	public abstract String getName();
	
	

}
