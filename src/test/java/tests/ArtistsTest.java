package tests;

import dataObjects.ItemDetails;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ArtistsTest {

    @Test
    public void verifyGetArtistEndpointReturnSuccessStatusCode() {
        given().
                when().
                get("https://pokeapi.co/api/v2/pokemon/ditto").
                then().
                assertThat().statusCode(200);
    }

    @Test
    public void verifyPostPokemonReturnSuccessStatusCode() {
        ItemDetails greenShirt = new ItemDetails("987654", "Green", "M");

        given().
                contentType(ContentType.JSON).
                body(greenShirt).
                log().body().
                when().
                post("https://jsonplaceholder.typicode.com/todos/1/posts").
                then().
                assertThat().statusCode(201);

    }
}
