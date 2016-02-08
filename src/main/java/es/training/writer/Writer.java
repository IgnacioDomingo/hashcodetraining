package es.training.writer;

public class Writer {
	private static final String	PINTADA	= "#";

	private static final String	BLANCO	= ".";

	private int					altura;
	private int					anchura;
	private String[][]			painting;

	public Writer(int altura, int anchura) {
		super();
		this.altura = altura;
		this.anchura = anchura;
		this.painting = initPainting();
	}

	public String[][] executeFile(String body) {

		String[] splittedBody = body.split("\n");
		Integer numberOfCommands = Integer.parseInt(splittedBody[0]);
		if (numberOfCommands >= splittedBody.length) {
			throw new IllegalArgumentException("No hay suficientes comandos");
		}
		for (int i = 1; i < numberOfCommands; i++) {
			String command = splittedBody[i];
			painting = executaCommand(command);

		}

		return painting;
	}

	private String[][] initPainting() {
		String[][] painting = new String[altura][anchura];
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < anchura; j++) {
				painting[i][j] = BLANCO;
			}
		}
		return painting;
	}

	private String[][] executaCommand(String command) {
		String[] splittedCommand = command.split(" ");
		String function = splittedCommand[0];
		if (function.equals("PAINT_SQUARE")) {
			Integer row = Integer.parseInt(splittedCommand[1]);
			Integer col = Integer.parseInt(splittedCommand[2]);
			Integer square = Integer.parseInt(splittedCommand[3]);

			paintSquare(row, col, square);
		} else if (function.equals("PAINT_LINE")) {
			Integer row1 = Integer.parseInt(splittedCommand[1]);
			Integer col1 = Integer.parseInt(splittedCommand[2]);
			Integer row2 = Integer.parseInt(splittedCommand[3]);
			Integer col2 = Integer.parseInt(splittedCommand[4]);

			paintLine(row1, col1, row2, col2);

		} else if (function.equals("ERASE_CELL")) {
			Integer row = Integer.parseInt(splittedCommand[1]);
			Integer col = Integer.parseInt(splittedCommand[2]);

			eraseCell(row, col);

		} else {
			throw new RuntimeException();
		}

		return painting;
	}

	private void paintSquare(Integer row, Integer col, Integer square) {
		if (row - square < 0 || row + square >= altura || col - square < 0 || col + square >= anchura) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < square; i++) {
			for (int j = 0; j < square; j++) {
				painting[row + i][col + j] = PINTADA;
			}
		}

		for (int i = 0; i < square; i++) {
			for (int j = 0; j < square; j++) {
				painting[row - i][col - j] = PINTADA;
			}
		}

	}

	private void paintLine(Integer row1, Integer col1, Integer row2, Integer col2) {
		for (int i = row1; i <= row2; i++) {
			for (int j = col1; j <= col2; j++) {
				painting[i][j] = PINTADA;
			}
		}
	}

	private void eraseCell(Integer row, Integer col) {
		painting[row][col] = BLANCO;

	}
}
