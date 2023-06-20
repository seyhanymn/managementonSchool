Feature: US_10 ViceDEan
  @US_10_TC_01
  Scenario: Required yazısı görülmel
    When Kullanici managementonschools adresine gider
    Then  Kullanici UserName butonuna tiklar
    Then  Kullanici  Password butonuna tiklarr
    Then  Kullanici UserName butonunun altına,Password ButonununAltında Required yazısını gördügünü dogrular
