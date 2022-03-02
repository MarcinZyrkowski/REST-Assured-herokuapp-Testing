package restfulbooker;

import main.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    public void healthCheckTest() {
        given()
                .when()
                .spec(spec)
                .get("/ping")
                .then()
                .assertThat()
                .statusCode(201);
    }

}
