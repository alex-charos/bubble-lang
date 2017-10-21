package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.CV;
import gr.charos.bubblelang.model.ExecutionResult;

public class CVContext extends Context {

	@Override
	public ExecutionResult getModel() {
		return new CV();
	}

}
