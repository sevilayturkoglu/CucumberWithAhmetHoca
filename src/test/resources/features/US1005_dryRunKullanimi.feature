Feature:US1005 Kullanici amazonda urun aratip 2.urun detaylari test eder

  @ilk
  Scenario: TC09 Kullanici arama sonuclarinda istedigi urunu test edebilmeli

    Given kullanici "amazonUrl" anasayfasina gider
    When amazonda "Nutella" icin arama yapar
    And 3 saniye bekler
    And 2.urune gider
    Then urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir