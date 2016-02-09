package es.training.voraz.v1.model;

import es.training.voraz.v1.Operation;

public interface Solution {
	public boolean isCompleteSolution();

	public void apply(Operation operation);
}
