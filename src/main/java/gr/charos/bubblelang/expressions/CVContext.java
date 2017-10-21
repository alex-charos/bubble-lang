package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.ExecutionResult;

public class CVContext extends Context {

	 
	
	public CVContext(ExecutionResult model) {
		super(model);
	}

	@Override
	public ExecutionResult getModel() {
		return model;
				
	}

	 

}
