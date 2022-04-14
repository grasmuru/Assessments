package za.co.smartcall.assesment1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.lang3.NotImplementedException;
import static org.junit.Assert.*;
import org.junit.Test;




public class LineCounterTest {
	
	
	private URI getFileFromResource(String fileName) throws URISyntaxException{

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) 
            throw new NotImplementedException("file not found! " + fileName);
        return resource.toURI();


    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testBadContentPassed() throws URISyntaxException, IOException {
			URI f = new URI("junk");
		   	LineCounter counter = new LineCounter();
			counter.calculateLinesInFile(f);
	}

	@Test
	public void testFile1() throws URISyntaxException, IOException {
			URI f = getFileFromResource("Test1.java");
			LineCounter counter = new LineCounter();
			assertEquals("Number of lines calculated incorrect", 5,counter.calculateLinesInFile(f));
	}
	
	@Test
	public void testFile2() throws URISyntaxException, IOException {
			URI f = getFileFromResource("Test2.java");
			LineCounter counter = new LineCounter();
			assertEquals("Number of lines calculated incorrect", 3,counter.calculateLinesInFile(f));
	}
	
	@Test
	public void testFile3() throws URISyntaxException, IOException {
			URI f = getFileFromResource("Test3.java");
			LineCounter counter = new LineCounter();
			assertEquals("Number of lines calculated incorrect", 9,counter.calculateLinesInFile(f));
	}

}
