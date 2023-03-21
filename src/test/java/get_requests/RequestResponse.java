package get_requests;
import io.restassured.response.Response;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RequestResponse {
/*
1-Postman = Manuel API testi icin kullanilir
2-API Otomasyonu icin Rest Assured Library kullanacagiz
3-Otomasyon kodlarinin yazimi icin su adimlari izliyoruz
    a) Gereksinimleri anlama
    b) Test case'i yazma;
        - Test case yazmak icin "Gerkin Language" kullaniyoruz
        x) Given: On Kosullar --> Endpoint Body
        y) When : Islemler --> Get, Put, Delete .. .
        z) Then : Donutler --> Assert
        t) And  : Coklu islemlerin art arda yazilacagi yerlerde kullanilir
    c) Test kodunu yazarken su adimlari izleriz:
        i)   Set the URL
        ii)  Set the expected data
        iii) Send the request and get the response
        iv)  Do assertions
 */
public static void main(String[] args) {
    //Get request nasil yapilir
   String url = "https://restful-booker.herokuapp.com/booking/55";
   Response response = given().when().get(url);
    response.prettyPrint();// prettyPrint() methodu response detayi yazdirir

    // status code yazdirma
    System.out.println("status code " + response.statusCode());
    // content type yazdirma
    System.out.println("content type " + response.contentType());
    // status lina yazdirma
    System.out.println("status line " + response.getStatusLine());
    // header yazdirma
    System.out.println(response.header("Connection"));
    // headers yazdirma
    System.out.println(response.headers());
    // time yazdirma
    System.out.println("time " + response.getTime());

}
}
