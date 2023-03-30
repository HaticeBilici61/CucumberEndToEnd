package base_urls;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.AuthenticationMedunna.generateToken;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void medunnaSetUp(){

        spec = new RequestSpecBuilder().
                 addHeader("Authorization","Bearer "+generateToken()).
                 setContentType(ContentType.JSON).
                 setBaseUri("https://medunna.com").build();

    }
}