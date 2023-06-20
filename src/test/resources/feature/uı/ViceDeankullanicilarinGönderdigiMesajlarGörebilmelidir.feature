@US_16
Feature:Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir

  Background: Ortak
    When Kullanici managementonschools adresine gider
    Then  Kullanici UserName butonuna tiklar
    Then  Kullanici gecerli  UserName girer
    Then  Kullanici  Password butonuna tiklarr
    Then  Kullanici gecerli  Password girer
    Then  Kullanici login butonuna tıklar
    Then  Kullnanici menu butonuna tiklar
    Then  Kullanici Contact Get All butonuna tiklar
    And  Contact message sayfasinda oldugunu dogrular

    Scenario: Mesajlari listeleyebilmeli
      Then Kullanici Name altinda  Massage yazarlari Listeler
      Then  Kullanici Contact   Massage altinda  email adresleri Listeler
      Then  Kullanici  Contact   Massage altinda  Dateleri Listeler
      Then Kullanici  Contact   Massage altinda  Subjet Listeler
      And  Kullanici Contact   Massage altinda gönderilen messagelerListeler