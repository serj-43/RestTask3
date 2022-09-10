import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

public class PostmanEchoTest {
    @Test
    void shouldPostSomeDate() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some text value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("sometextvalue"))
        ;
    }
}
