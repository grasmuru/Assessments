package za.co.smartcall;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;

import za.co.smartcall.CollectionUtilities.NetworkCount;
import za.co.smartcall.CollectionUtilities.NetworkName;



public class CollectionUtilitiesTest {

		
		
		private URI getFileFromResource(String fileName) throws URISyntaxException{

	        ClassLoader classLoader = getClass().getClassLoader();
	        URL resource = classLoader.getResource(fileName);
	        if (resource == null) 
	            throw new NotImplementedException("file not found! " + fileName);
	        return resource.toURI();


	    }



		@Test
		public void testParseBasicJsonParsing() throws URISyntaxException, IOException {
			URI f = getFileFromResource("SmartcallProducts.json");
		    Networks networks = CollectionUtilities.parseJsonFile(f); 
		    assertEquals(networks.networks().size(),14);
		}
		
		
		
		@Test
		public void testFilterOutVodacomProducts() throws URISyntaxException, IOException {
			URI f = getFileFromResource("SmartcallProducts.json");
		    Networks networks = CollectionUtilities.parseJsonFile(f); 
		    List<Product> products = CollectionUtilities.returnAllProductsThatAreVodacom(networks);
		    assertEquals(products.size(),138);
		}
		

		
		@Test
		public void testMapOfEachNetworkAndNumberOfProducts() throws URISyntaxException, IOException {
			URI f = getFileFromResource("SmartcallProducts.json");
		    Networks networks = CollectionUtilities.parseJsonFile(f); 
		    var productsHistogram = CollectionUtilities.returnAMapOfEachNetworkAndNumberOfProducts(networks);
		    
		    var top3NetworksWithMostProducts = productsHistogram.entrySet().stream()
		    		.sorted(Map.Entry.<NetworkName,NetworkCount> comparingByValue()
		    	    .reversed()).limit(3).toList();
		    assertEquals("The top network product count is wrong ",top3NetworksWithMostProducts.get(0).getValue().count(),438);
		    assertEquals("The 3rd network name is wrong ",top3NetworksWithMostProducts.get(2).getKey().network(),"Cell C");
		}
	
}
