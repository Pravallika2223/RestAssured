package NewPack;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matcher.*;

public class CRUDoperation {
  
 
  @Test
  public void f() {
	 
	  //Get call API
	/*  Response res = given().log().all()
			  .queryParam("","2")
			  .header("Content-Type","application/json")
			  .when().get("https://reqres.in/api/users/2")
			  .then().log().all().statusCode(200).extract().response(); */
	  
	  //post call API
	/*  Response res1=given().log().all()
			  .header("Content-Type","application/json")
			  .body("{\n"
			  		+ "    \"name\": \"morpheus\",\n"
			  		+ "    \"job\": \"leader\"\n"
			  		+ "}")
			  .when().post("https://reqres.in/api/users")
			  .then().log().all().statusCode(201).extract().response();*/
	  
	 //put API 
	  
	/*  Response resput=(Response)given().log().all()
			  .queryParam("","2")
			  .header("Content-Type","application/json")
			  .body("{\n"
			  		+ "    \"name\": \"morpheus\",\n"
			  		+ "    \"job\": \"zion resident\"\n"
			  		+ "}")
			  .when().put("https://reqres.in/api/users/2")
			  .then().assertThat().log().all().statusCode(200).extract().response(); */
	  
	  //delete API 
	  Response res = given().log().all()
			  .queryParam("","2")
			  .header("Content-Type","application/json")
			  .when().delete("https://reqres.in/api/users/2")
			  .then().log().all().statusCode(204).extract().response();
	  
  }
 

}
