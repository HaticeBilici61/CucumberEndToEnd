@Room_Create
Feature: Medunna_Room

  Scenario: Medunna_Room

    Given kullanici sayfaya "https://www.medunna.com/" gider
    When  kullanici Login olur
    And   kullanici room olusturur
    Then  kullanici olusturdugu roomun oldugunu dogrular