import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Test_Post {
	
	@Test
 public void Test_1_Post () {
		
		Map<String, Object>map = new HashMap<String, Object>();
	
		map.put("name", "Rachel");
		map.put("job", "Pilot");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
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
    public void testing3get() {

        when().
                get ("https://reqres.in/api/users/2").
        then().
            statusCode(200).log().all();
 }
    
    @Test
    public void testing4delete() {

        when().
                delete ("https://reqres.in/api/users/2").
        then().
            statusCode(204).log().all();

    }
}
