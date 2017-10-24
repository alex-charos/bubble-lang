package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.commands.Command;
import gr.charos.bubblelang.core.Heap;
import gr.charos.bubblelang.model.ExecutionResult;

public class ThreeWordLine extends Line {
	private Command command;
	private Context context;
	private Variable variable;
	private Heap heap;
	public ThreeWordLine(Command command, Context context, Variable variable, Heap h) {
		this.command = command;
		this.context = context;
		this.variable = variable;
		this.heap = h;
	}

	public ExecutionResult evaluate() {
		return command.execute(context, heap);
		
	}

	 
	

}
