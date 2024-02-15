package ch.phipu;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class MyTestControllerTest {

    @Test
    void testMultipart() {
        given().multiPart("firstParam", "{\"id\":\"myId\",\"name\":\"myName\"}", "application/json")
                .when()
                .post("/api/test")
                .then()
                .statusCode(200);
    }
}
