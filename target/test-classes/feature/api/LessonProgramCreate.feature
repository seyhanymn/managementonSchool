@apiTesti1
Feature: US_10
  Scenario Outline: Lesson program olusturma
    Given  Kullanici getRequest gonderir by "<lessonProgramId>" response alir
    Then Kullanici ExpectedData olusturur  startTime="<startTime>" stopTime="<stopTime>"lessonId="<lessonId>"lessonName="<lessonName>"creditScore="<creditScore>"compulsory="<compulsory>"

    Examples:

      | lessonProgramId | startTime | stopTime | lessonId | lessonName | creditScore | compulsory |
      | 2               | 10:00:00  | 12:00:00 | 2        | CALCULUS   | 6           | false      |

