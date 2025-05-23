package com.test.api;


import io.restassured.response.Response;
import org.junit.Test;

import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class ApiTests {
	//----------------Test1: GET
	@Test
    public void testGetUser() {
        Response response =
            given()                          // -> isteğe özel ayarlar yapılabilir (burada boş)
            .when()
            .get("https://jsonplaceholder.typicode.com/users/1") // → API çağrısı yapılır
            .then()
            .extract().response();          // -> gelen yanıtı saklıyoruz

        // Status code kontrolü
        assertEquals(200, response.statusCode());

        // JSON içinden username alanını çekip kontrol etme
        String username = response.jsonPath().getString("username");
        assertEquals("Bret", username);

        // Cevap süresi kontrolü
        assertTrue(response.getTime() < 1000); // ->1000 milisaniyeden kısa sürede geldi mi????
    }

//-----------------TEST2: POST ile APIye veri gönderme 
@Test
public void testCreatePost() {
    // Göndereceğimiz JSON verisi
    String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": 1\n" +
            "}";

    Response response =
        given()
            .header("Content-type", "application/json") // JSON olduğunu belirtiyoruz
            .and()
            .body(requestBody)                         // Göndereceğimiz veri
        .when()
            .post("https://jsonplaceholder.typicode.com/posts") // POST isteği
        .then()
            .extract().response();

    // Status code 201 olmalıııı
    assertEquals(201, response.statusCode());

    // Cevap içeriğinde gönderdiğimiz veriler var mı kontrol edelim
    String title = response.jsonPath().getString("title");
    String body = response.jsonPath().getString("body");
    int userId = response.jsonPath().getInt("userId");

    assertEquals("foo", title);
    assertEquals("bar", body);
    assertEquals(1, userId);

    //1 saniyeden kısa sürede dönmeli
    assertTrue(response.getTime() < 1000);
} 

}
