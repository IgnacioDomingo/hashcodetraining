package es.training.input.reader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.stream.Stream;

import es.training.Problem;

public class Reader {

	public void read(Path path) throws IOException {

		try (Stream<String> lines = Files.lines(path, Charset.defaultCharset())) {

			Iterator<String> it = lines.iterator();
			String[] firstLine = it.next().split(" ");

			Problem problem = new Problem(Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]));

			int row = 0, colum = 0;
			while (it.hasNext()) {
				String line = it.next();
				colum = 0;

				for (char cell : line.toCharArray()) {
					if (cell == '#') {
						problem.paint(row, colum);
					}
					colum++;
				}
				row++;
			}
		}
	}

}
