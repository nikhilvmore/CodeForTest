package jaxwsExample.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * 
 * @author Nikhil
 *  service implemetation
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class CodeTest{

	
	public String checkMyCode(String name) {
		
		int count = 1;//fetch this value from database to store count of hits.  
		count++;
		System.out.println("timestamp:" + System.currentTimeMillis());
		System.out.println("calls" + count);
		return "{timestamp : " + System.currentTimeMillis()+" calls : " + count +"}";
	}


}
