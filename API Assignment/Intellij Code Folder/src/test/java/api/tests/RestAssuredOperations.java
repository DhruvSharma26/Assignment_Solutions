package api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class RestAssuredOperations {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://reqres.in/api";

        // GET Request
        Response getResponse = given()
                .header("x-api-key","reqres-free-v1")
                .when()
                .get("/users/2")
                .then()
                .assertThat().statusCode(200)
                .extract().response();

        // Verify first_name
        String firstName = getResponse.jsonPath().getString("data.first_name");
        System.out.println("First Name: " + firstName);
        Assert.assertEquals(firstName, "Dhruv");

        // Extract email
        String email = getResponse.jsonPath().getString("data.email");
        System.out.println("Email: " + email);

        // POST Request
        String postBody = "{ \"name\": \"Dhruv\", \"email\": \"" + email + "\", \"job\": \"Engineer\" }";

        Response postResponse = given()
                .header("Content-Type", "application/json")
                .header("x-api-key","reqres-free-v1")
                .body(postBody)
                .when()
                .post("/users")
                .then()
                .assertThat().statusCode(201)
                .extract().response();

        System.out.println("POST Response: " + postResponse.asString());

        // PUT Request
        String putBody = "{ \"name\": \"Dhruv Sharma\", \"job\": \"Senior Engineer\" }";

        given()
                .header("Content-Type", "application/json")
                .header("x-api-key","reqres-free-v1")
                .body(putBody)
                .when()
                .put("/users/2")
                .then()
                .assertThat().statusCode(200);

        //  PATCH Request
        String patchBody = "{ \"name\": \"Patched Name\" }";

        given()
                .header("Content-Type", "application/json")
                .header("x-api-key","reqres-free-v1")
                .body(patchBody)
                .when()
                .patch("/users/2")
                .then()
                .assertThat().statusCode(200);

        // DELETE Request
        given()
                .header("x-api-key","reqres-free-v1")
                .when()
                .delete("/users/2")
                .then()
                .assertThat().statusCode(204);

        //  Function to verify presence of 'message' in response
        String dummyResponse = "{ \"message\": \"Success\" }";
        verifyMessagePresence(dummyResponse);
    }

    public static void verifyMessagePresence(String responseBody) {
        Assert.assertTrue(responseBody.contains("message"), "Response does not contain 'message'");
        System.out.println("'message' found in response body!");
    }
}
