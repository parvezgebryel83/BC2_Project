package RestAssureBcamp;
import static io.restassured.RestAssured.*;
import java.io.File;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;


public class RestAssure {
	
	
	
  @Test
  public void f() {
	  
	Response rsp =  get("https://reqres.in/api/users?page=2");
	rsp.prettyPrint();
	System.out.println(rsp.getStatusCode());
	System.out.println(rsp.getTime());
	  
	  
	  
  }
  @Test
  public void post() {
	 File file = new File("C:\\Users\\transportssa\\latestEclips\\com.bootCamp\\src\\test\\java\\RestAssureBcamp\\assure.jason");
	 Response rsp2 = given().contentType("application/json").body(file).post("https://reqres.in/api/users");
	 rsp2.prettyPrint();
	 rsp2.then().statusCode(201);
  }

  @AfterClass
  public void afterClass() {
  }

}
