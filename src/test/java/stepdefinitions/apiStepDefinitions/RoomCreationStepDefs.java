package stepdefinitions.apiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.Room;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class RoomCreationStepDefs {
    Response response;
    @Given("user sends post request for room data")
    public void user_sends_post_request_for_room_data() {
        //Set the url
        spec.pathParams("first","api","second","rooms");

        //Set the expected data
        Room expectedData=new Room("Api'dan yeni oda",234,745326,"TWIN",true);

        //send to request and get to response
      response=  given(spec).body(expectedData).post("/{first}/{second}");
      response.prettyPrint();


    }
    @Then("user gets the room data and assert")
    public void user_gets_the_room_data_and_assert() {

    }

}