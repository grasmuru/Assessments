package za.co.smartcall.assesment1;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineCounter {
	private static String HOME = System.getProperty("user.home");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Return the number of actual java lines in the file
	 * Comment start sequences that appear inside Java strings should be ignored.
	 * Empty space is ignored
	 * @param uri URI of the file analysed
	 * @return return the number of actual java lines in the file
	 * @throws IOException
	 */
	public int calculateLinesInFile(URI uri) throws IOException {
		Path path = Paths.get(uri);
		List<String> read = Files.readAllLines(path);
		
		//TODO 1 the logic to calculate the number of actual lines containing code  
		
		
		//TODO 2 the method to read in the lines above crashes with very large files how would solve this?
		
		throw new IllegalArgumentException("Not implemented yet");
	}

}
