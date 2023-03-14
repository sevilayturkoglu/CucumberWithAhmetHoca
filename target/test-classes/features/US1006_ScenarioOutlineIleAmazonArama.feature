Feature: US1006 Kullanici Scenario outline ile coklu arama yapar
@ss
  Scenario Outline: TC10 Amazon coklu urun testi

    Given kullanici "amazonUrl" anasayfasina gider
    Then amazonda "<kelimeler>" icin arama yapar
    And sonuclarin "<kelimeler>" icerdigini test eder

    Examples:
      | kelimeler |
      | Nutella   |
      | Java      |
      | Samsung   |
      | Apple     |
