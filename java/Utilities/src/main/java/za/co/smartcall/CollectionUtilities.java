package za.co.smartcall;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;





public class CollectionUtilities {
	
	record NetworkCount(long count) implements Comparable<NetworkCount>{

		@Override
		public int compareTo(NetworkCount o) {
			return Long.compare(this.count,o.count);
		}
		
	}
	
	
    record NetworkName(String network) {
		
	}
    
	
	/**
	 * Parse the json content from the URI into the Network, Product and ProductTypes
	 * Please dont modify the records. We have left a libraries in the maven file for when we did it 
	 * Try use Functional paradigms if possible to keep code simple
	 * @param uri
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static Networks parseJsonFile(URI uri) throws FileNotFoundException, IOException {
		//TODO 1
		return null;
	}
	

	
	/**
	 * Histogram of Network and the occurrence of Products
	 * @param networks class
	 * @return a Map of network name and associated count as record
	 * Hint: Credit is given to candidates using Collectors groupingBy in the stream API
	 */
	public static Map<NetworkName,NetworkCount> returnAMapOfEachNetworkAndNumberOfProducts(Networks networks){
	     //TODO 2
		return null;
	}

	/**
	 * Return only products for vodacom
	 * @param networks
	 * @return
	 * Hint: To get started, try use streams with flatMaps
	 */
	public static List<Product> returnAllProductsThatAreVodacom(Networks networks){
		//TODO 3
		return null;
	}
	
}
