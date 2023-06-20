Feature: US_10 ViceDEan

  Background: Ortak Adimlar
    When Kullanici managementonschools adresine gider
    Then  Kullanici UserName butonuna tiklar
    Then  Kullanici gecerli  UserName girer
    Then  Kullanici  Password butonuna tiklarr
    Then  Kullanici gecerli  Password girer
    Then  Kullanici login butonuna tıklar

  @US_10_TC_03
  Scenario:Add Lesson Program sayfasi görülür ve Leeson create edilir
    Then   Kullanici Lesson Program butonuna tiklar
    Then   Kullnici Choose Lessons Butonuna tiklar bir ders ,Dönem, Gün Start Time ,Stop Time secer
    Then   Kullnici submit butonuna tiklar
    And    Kullnici Created Lesson Program yazisinin görüldügünü dogrular




