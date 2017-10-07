package SpiTest.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class DoSearchTest 
    extends TestCase
{
	public static void main(String[] args) {  
		for(int i=0;i<Integer.MAX_VALUE;i++){
		    ServiceLoader<Search> sl = ServiceLoader.load(Search.class);  
		    Iterator<Search> s = sl.iterator();  
		    if (s.hasNext()) {  
		      Search ss = s.next();  
		      ss.search();  
		    }  
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }  
}

