package jaxwsExample.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
/**
 * 
 * @author Nikhil
 *  service implemetation
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
@Path("/codetest")
public class CodeTestimpl implements CodeTest{

	@GET
	@Produces("text/html")
	public String checkMyCode() {
		
		int count = 1;//fetch this value from database to store count of hits.  
		count++;
		System.out.println("timestamp:" + System.currentTimeMillis());
		System.out.println("calls" + count);
		return "{timestamp : " + System.currentTimeMillis()+" calls : " + count +"}";
	}


}
