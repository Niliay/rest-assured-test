# RestAssured API Test Projesi

Bu proje, **Rest Assured** kütüphanesi kullanılarak hazırlanmış gelişmiş API testlerini içerir.
Proje, **JUnit4** test framework'ü ile **Maven** tabanlı olarak yapılandırılmıştır.

## Test Sınıfı

* `AlternativeApiTests.java`: GET ve POST istekleri için geliştirilmiş test senaryoları içerir.

## Test Senaryoları

* ✅ **GET Kullanıcı Bilgisi Sorgulama:**

  * HTTP 200 durum kodu kontrolü
  * JSON içerik doğrulaması (username, name, city)
  * Header ve performans doğrulaması

* ✅ **POST Yeni Gönderi Oluşturma:**

  * HTTP 201 durum kodu kontrolü
  * Body verisi doğrulaması
  * Yeni ID üretimi kontrolü
  * Header ve süre kontrolü

## Test Edilen API URL'leri

* **GET:**
  `https://jsonplaceholder.typicode.com/users/1`

* **POST:**
  `https://jsonplaceholder.typicode.com/posts`

## Kullanılan Teknolojiler

* Java 8
* Maven
* Rest Assured 5.3.0
* JUnit 4.13.2

## Projeyi Çalıştırma

1. Projeyi Eclipse veya IntelliJ gibi bir IDE ile açın.
2. `src/test/java/com/test/api/AlternativeApiTests.java` içindeki testleri çalıştırın.
