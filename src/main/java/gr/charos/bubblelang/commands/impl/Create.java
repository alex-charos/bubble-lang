package gr.charos.bubblelang.commands.impl;

import gr.charos.bubblelang.commands.Command;
import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.expressions.Context;
import gr.charos.bubblelang.model.ExecutionResult;

public class Create implements Command {

	public ExecutionResult execute(Context c, Heap h) {
		ExecutionResult er = c.getModel();
		h.add(c.getName(), er);
		return c.getModel();
	}

}
