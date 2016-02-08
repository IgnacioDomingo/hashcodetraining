package es.training.input.writer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class WriterTest {

	@Test
	public void testCuadrados() throws IOException, URISyntaxException {
		Writer writer = new Writer(10, 10);
		String text = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("/pintada_cuadrados.txt").toURI())), StandardCharsets.UTF_8);
		String[][] painting = writer.executeFile(text);
		writer.printPainting();
	}

	@Test
	public void testLineas() throws IOException, URISyntaxException {
		Writer writer = new Writer(10, 10);
		String text = new String(Files.readAllBytes(Paths.get(this.getClass().getResource("/pintada_lineas.txt").toURI())), StandardCharsets.UTF_8);
		String[][] painting = writer.executeFile(text);
		writer.printPainting();
	}
}
