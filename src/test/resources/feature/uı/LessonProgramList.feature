Feature: US_11
  @US_11_TC_01
  Scenario: Olusturulan ders Listede Gorulebilmeli
    When Kullanici managementonschools adresine gider
    Then  Kullanici UserName butonuna tiklar
    Then  Kullanici gecerli  UserName girer
    Then  Kullanici  Password butonuna tiklarr
    Then  Kullanici gecerli  Password girer
    Then  Kullanici login butonuna tıklar
    Then   Kullanici Lesson Program butonuna tiklar
    Then   Kullnici Choose Lessons Butonuna tiklar bir ders ,Dönem, Gün Start Time ,Stop Time secer
    Then   Kullnici submit butonuna tiklar
    Then   Listede Olusturulan ders gorulur

