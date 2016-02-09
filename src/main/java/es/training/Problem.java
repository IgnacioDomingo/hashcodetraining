package es.training;

public class Problem {

	private static final int	PAINTED	= 1;
	private static final int	CLEAR	= 0;
	private final int[][]		pantalla;
	private final int			numColumn;
	private final int			numRow;

	public Problem(int maxRow, int maxColum) {

		this.numColumn = maxColum;
		this.numRow = maxRow;
		pantalla = new int[maxRow][maxColum];
		clear();

	}

	public void paint(int row, int colum) {
		pantalla[row][colum] = PAINTED;
	}

	public int getNumRow() {
		return numRow;
	}

	public int getNumColumn() {
		return numColumn;
	}

	private void clear() {
		for (int row = 1; row < numRow; row++)
			for (int column = 1; column < numColumn; column++)
				pantalla[row][column] = CLEAR;
	}

	public boolean isPainted(int row, int column) {
		return pantalla[row][column] == PAINTED;
	}

}
