import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_Post {
	
	@Test
 public void Test_1_Post () {
		
		JSONObject request = new JSONObject();
		request.put("name", "Rachel");
		request.put("job", "Pilot");
		
		 System.out.println(request);
		 System.out.println(request.toJSONString());
		 
		 given().
		 	body(request.toJSONString()).
		 when().
		 	post("https://reqres.in/api/users") .
		 then().
		 	statusCode(201);
		 
}
	@Test
	public void test2_Put() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Rachel");
		request.put("job", "Farmer");
		
		 System.out.println(request);
		 System.out.println(request.toJSONString());
		 
		 given().
		 	body(request.toJSONString()).
		 when().
		 	post("https://reqres.in/api/users") .
		 then().
		 	statusCode(200);
	}
	
	@Test
	public void test3_Patch() {
		JSONObject request = new JSONObject();
		request.put("name", "Rachel");
		request.put("job", "Accountant");
		
		 System.out.println(request);
		 System.out.println(request.toJSONString());
		 
		 given().
		 	body(request.toJSONString()).
		 when().
		 	post("https://reqres.in/api/users") .
		 then().
		 	statusCode(200);
}
	
	@Test
    public void test4_Get() {

		System.out.println("Getting");
		when().
		get("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
 }
	
    
    @Test
    public void test5_Delete() {

    	System.out.println("Deleting");
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();;
    }
}
