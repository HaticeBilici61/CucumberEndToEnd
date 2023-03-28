package base_urls;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void medunnaSetUp(){

        spec = new RequestSpecBuilder().addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaF95dXp1YyIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjgwMTE2NzI2fQ.mAUM5LIeO3Kyk5uMr49g3xjSTyQ7I0ixr61YBr4pFTEnOVHTRFKh7gTj3niWwFAVuE83MYFSEi02fj4i3PuFVg").
        setContentType(ContentType.JSON).
                setBaseUri("https://medunna.com").build();

    }
}