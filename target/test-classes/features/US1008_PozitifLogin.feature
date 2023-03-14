Feature: US1008 gecerli kullanici

  Scenario: TC12 Gecerli username ve password ile giris yapar
    Given kullanici "qdUrl" anasayfasina gider
    And cookies tiklar
    Then ilk login linkine tiklar
    And username olarak "qdGecerliUsername" girer
    And password olarak "qdGecerliPassword" girer
    And 3 saniye bekler
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
