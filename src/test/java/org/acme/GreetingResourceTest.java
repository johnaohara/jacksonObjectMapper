package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.wildfly.common.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testTimedMsgEndpoint() {
        TimedMsg timedMsg = given()
                .when().get("/hello/john")
                .then()
                .statusCode(200)
                .extract().body().as(TimedMsg.class);
        assertNotNull(timedMsg);
        assertNotNull(timedMsg.timestamp);
    }

}