package helper;

import api.baseUrl;
import api.data;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class requestAPI {

    api.baseUrl ip = new baseUrl();
    Response response;
    api.data data = new data();

    public String getUsername() {

        RestAssured.baseURI = ip.getReqresAPI();
        response = given()
                .header("Content-Type", "application/json")
                .body(data.createUsers().toJSONString())
                .when()
                .post("api/users")
                .then()
                .log().body()
                .statusCode(201)
                .extract().response();
        return response.getBody().path("name");
    }

}
