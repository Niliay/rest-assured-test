# RestAssured API Test Projesi

Bu proje, Rest Assured kütüphanesi kullanılarak hazırlanmış örnek API testlerini içerir.  
JUnit4 framework ile Maven projesi olarak yapılandırılmıştır.

## Testler

- GET isteği ile kullanıcı bilgisi sorgulama testi  
- POST isteği ile yeni gönderi oluşturma testi

## Test Edilen API URL'leri

- **GET Kullanıcı Bilgisi:**  
  `https://jsonplaceholder.typicode.com/users/1`

- **POST Yeni Gönderi Oluşturma:**  
  `https://jsonplaceholder.typicode.com/posts`

## Kullanılan Teknolojiler

- Java 8  
- Maven  
- Rest Assured 5.3.0  
- JUnit 4.13.2

## Çalıştırma

Projeyi Eclipse veya başka bir IDE ile açabilirsiniz.  
Test sınıfı `ApiTests` içinde test metotları bulunmaktadır.  
Testleri çalıştırmak için:

```bash
mvn test
