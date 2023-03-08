Feature:US1001 Kullanici Amazon syfasinda arama yapar

  Scenario:TC01 Kullanici Amazonda Nutella arar
    Given  ullanici Amazon ana sayfasina fider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutellla icerdigini test eder
    And sayfayi kapatir
    Then yaptim

