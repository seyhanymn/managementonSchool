@apiTesti2
Feature: US_16
  Scenario Outline: Lesson program olusturma
    Given  Kullanici getRequest gonderir by  response alir
    Then Kullanici ExpectedData olusturur  name="<name>" email="<email>"subject="<subject>"message="<message>"date="<date>"



   Examples:
     | name  | email            | subject                                       | message                                    | date       |
     | Keren | Mathew@gmail.com | O! she doth teach the torches to burn bright. | To be, or not to be: that is the question. | 2023-05-05 |