package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.model.ExecutionResult;

public class Create implements Command {

	public ExecutionResult execute(Context c, Heap h) {
		ExecutionResult er = c.getModel();
		h.add(er);
		return c.getModel();
	}

}
