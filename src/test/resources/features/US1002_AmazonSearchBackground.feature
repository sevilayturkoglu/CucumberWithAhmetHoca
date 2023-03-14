@ss
Feature: US1002 Kullanici Background olusturarak Amazonda arama yapar

  Background:
    Given kullanici Amazon ana sayfasina gider


  Scenario:TC01 Kullanici Amazonda Nutella arar
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutellla icerdigini test eder



  Scenario: TC02 kullanici Amazonda Java aratir
    When arama kutusuna Java yazar ve enter tusuna basar
    Then arama sonuclarinin Java icerdigini test eder


  Scenario: TC03 kullanici Amazonda Java aratir
    When arama kutusuna Apple yazar ve enter tusuna basar
    Then arama sonuclarinin Apple icerdigini test eder
