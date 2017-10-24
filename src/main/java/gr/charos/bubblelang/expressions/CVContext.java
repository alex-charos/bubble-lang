package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.ExecutionResult;

public class CVContext extends Context {

	 
	
	public CVContext(String name, ExecutionResult model) {
		super(name, model);
	}

	@Override
	public ExecutionResult getModel() {
		return model;
				
	}

	@Override
	public String getName() {
		
		return name ;
	}

	 

}
