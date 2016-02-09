package es.training.voraz.v1;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

import es.training.Problem;
import es.training.voraz.v1.model.Solution;

public class Voraz {
	private TreeSet<Operation> posibility;

	public Voraz(Comparator<Operation> opComparator) {
		super();
		this.posibility = new TreeSet<>(opComparator);
	}

	public Solution run(Problem problem) {

		posibility.addAll(tryForRow(problem));
		posibility.addAll(tryForColum(problem));

		VorazSolution potentialSolution = new VorazSolution(problem);

		while (!potentialSolution.isCompleteSolution() || !potentialSolution.hasCandidate()) {
			Operation operationCandidate = obtainBestCandidate(potentialSolution);

			potentialSolution.apply(operationCandidate);

			updatePosibility();
		}

		return potentialSolution;

	}

	private void updatePosibility() {
		// TODO Auto-generated method stub

	}

	private Operation obtainBestCandidate(VorazSolution potentialSolution) {
		// TODO Auto-generated method stub
		return null;
	}

	private Collection<? extends Operation> tryForRow(Problem problem) {
		// TODO Auto-generated method stub
		return null;
	}

	private Collection<Operation> tryForColum(Problem problem) {
		// TODO Auto-generated method stub
		return null;
	}
}
