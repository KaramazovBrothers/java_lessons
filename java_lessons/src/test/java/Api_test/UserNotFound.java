package Api_test;

import Utilities.TestDataGenerator;
import io.restassured.RestAssured;
import models.RegisterRequestBody;
import models.UpdateUserRequestBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserNotFound{
    String BASE_URL = "https://reqres.in";

    @BeforeClass
    public void setUpLogging() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    //Singl User
    @Test
    public void userNotFoundTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(404);
    }

    //List Users
    @Test
    public void getSecondUserPageTest() {
        given()
                .baseUri(BASE_URL)
                .queryParam("page", "2")
                .when()
                .get("/api/users")
                .then()
                .statusCode(200);
    }

    //List <Resource>
    @Test
    public void listResourceTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200);
    }

    //Single <Resource>
    @Test
    public void singleResourceTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200);
    }

    //Create
    @Test
    public void createUserTest() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateLogin())
                .job(TestDataGenerator.generateJobName())
                .build();
        given(PrepareRequestSpec.getPostSpecification())
                .body(updateUser)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }

    //Put Update
    @Test
    public void putUpdateUserTestPost() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateLogin())
                .job(TestDataGenerator.generateJobName())
                .build();
        given(PrepareRequestSpec.getPostSpecification())
                .body(updateUser)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200);
    }

    //Patch Update
    @Test
    public void patchUpdateUserTestPatch() {
        UpdateUserRequestBody updateUser = UpdateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateLogin())
                .job(TestDataGenerator.generateJobName())
                .build();
        given(PrepareRequestSpec.getPostSpecification())
                .body(updateUser)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200);
    }

    //Delete
    @Test
    public void deleteUserTest() {
        given()
                .baseUri(BASE_URL)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }

    //Register - Successful
    @Test
    public void registerUser() {
        RegisterRequestBody registerRequestBody =  RegisterRequestBody
                .builder()
                .password(TestDataGenerator.generatePassword())
                .email(TestDataGenerator.generateEmail())
                .build();
        given(PrepareRequestSpec.getPostSpecification())
                .body(registerRequestBody)
                .when()
                .patch("/api/register")
                .then()
                .statusCode(200);
    }

    //Login - Successful
    @Test
    public void LoginUser() {
        RegisterRequestBody registerRequestBody =  RegisterRequestBody
                .builder()
                .password(TestDataGenerator.generatePassword())
                .email(TestDataGenerator.generateEmail())
                .build();
        given(PrepareRequestSpec.getPostSpecification())
                .body(registerRequestBody)
                .when()
                .patch("/api/login")
                .then()
                .statusCode(200);
    }
}
