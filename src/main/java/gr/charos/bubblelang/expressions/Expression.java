package gr.charos.bubblelang.expressions;

import gr.charos.bubblelang.model.ExecutionResult;

public interface Expression {
	public abstract ExecutionResult evaluate();
}
