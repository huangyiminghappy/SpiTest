package SpiTest.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class DoSearch {  
	  public static void main(String[] args) {  
		for(int i=0;i<10;i++){
		    ServiceLoader<Search> sl = ServiceLoader.load(Search.class);  
		    Iterator<Search> s = sl.iterator();  
		    if (s.hasNext()) {  
		      Search ss = s.next();  
		      ss.search();  
		    }  
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	  }  
	}  
