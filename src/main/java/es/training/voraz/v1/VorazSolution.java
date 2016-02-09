package es.training.voraz.v1;

import es.training.Problem;
import es.training.voraz.v1.model.Solution;
import es.training.voraz.v1.model.SolutionCell;

public class VorazSolution implements Solution {

	private final SolutionCell[][] matrix;

	public VorazSolution(Problem problem) {
		super();
		this.matrix = new SolutionCell[problem.getNumRow()][problem.getNumColumn()];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = new SolutionCell(problem.isPainted(row, column));
			}
		}

	}

	@Override
	public boolean isCompleteSolution() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void apply(Operation operation) {
		// TODO Auto-generated method stub

	}

	public boolean hasCandidate() {
		// TODO Auto-generated method stub
		return false;
	}

}
