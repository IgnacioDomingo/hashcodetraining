package es.training;

public class Problem {

	private final int[][] pantalla;

	public Problem(int maxRow, int maxColum) {
		pantalla = new int[maxRow][maxColum];
		for (int i = 1; i < maxRow; i++)
			for (int j = 1; j < maxColum; j++)
				pantalla[i][j] = 0;

	}

	public void paint(int row, int colum) {
		pantalla[row][colum] = 1;
	}

}
