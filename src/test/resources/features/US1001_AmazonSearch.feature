@wip
Feature:US1001 Kullanici Amazon syfasinda arama yapar

  Scenario:TC01 Kullanici Amazonda Nutella arar
    Given  kullanici Amazon ana sayfasina gider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutellla icerdigini test eder



    Scenario: TC02 kullanici Amazonda Java aratir
      Given kullanici Amazon ana sayfasina gider
      When arama kutusuna Java yazar ve enter tusuna basar
      Then arama sonuclarinin Java icerdigini test eder


  Scenario: TC03 kullanici Amazonda Java aratir
    Given kullanici Amazon ana sayfasina gider
    When arama kutusuna Apple yazar ve enter tusuna basar
    Then arama sonuclarinin Apple icerdigini test eder

