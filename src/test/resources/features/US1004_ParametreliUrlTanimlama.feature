Feature: US1004 kullanici parametre olarak girdigi url ye gider

@ss
  Scenario: TC08 Kullanici url yi parametre olarak girebilmeli
    Given kullanici "amazonUrl" anasayfasina gider
    Then "amazonUrl" sayfasina gittigini test eder
