package es.training.input.reader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.Test;

public class ReaderTest {

	@Test
	public void readLogo() throws IOException, URISyntaxException {

		new Reader().read(Paths.get(ReaderTest.class.getResource("/logo.in").toURI()));

	}

	@Test
	public void readlearn_and_teach() throws IOException, URISyntaxException {

		new Reader().read(Paths.get(ReaderTest.class.getResource("/learn_and_teach.in").toURI()));

	}
}
