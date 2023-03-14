Feature:US1007 Scenario outline coklu negatif login test
@wip
  Scenario Outline:TC11 kullanici verilen listedeki kullanici isimlele giris yapamamali
    Given kullanici "qdUrl" anasayfasina gider
    Then cookies tiklar
    Then ilk login linkine tiklar
    And username olarak examples dan "<username>" girer
    And password olarak examples dan"<password>" girer
    Then login butonuna basar
    Then giris yapilamadigini test eder


    Examples:
      |username|password|
      |Hasan   |12344   |
      |Said    |645363  |
      |Eyup    |jskdbvk |
      |Fidan   |ytefv86 |