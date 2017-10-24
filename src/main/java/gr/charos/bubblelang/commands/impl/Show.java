package gr.charos.bubblelang.commands.impl;

import gr.charos.bubblelang.commands.Command;
import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.expressions.Context;
import gr.charos.bubblelang.model.ExecutionResult;

public class Show implements Command {

	@Override
	public ExecutionResult execute(Context c, Heap h) {
		
		return h.get(c.getName());
	}

}
