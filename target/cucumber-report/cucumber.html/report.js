$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page functionality",
  "description": "",
  "id": "home-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2593156100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verifying age of a person",
  "description": "",
  "id": "home-page-functionality;verifying-age-of-a-person",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify the text on the Home page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter User Name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter the Date of Birth",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Submit",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 57132100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iVerifyTheTextOnTheHomePage()"
});
formatter.result({
  "duration": 62917100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iEnterUserName()"
});
formatter.result({
  "duration": 92877900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iEnterTheDateOfBirth()"
});
formatter.result({
  "duration": 59062300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnSubmit()"
});
formatter.result({
  "duration": 48705100,
  "status": "passed"
});
formatter.after({
  "duration": 656217800,
  "status": "passed"
});
formatter.uri("ResultPage.feature");
formatter.feature({
  "line": 1,
  "name": "Result Page Functionality",
  "description": "\r\nAs a user I want to check if it print the correct entered name and print the age of the person",
  "id": "result-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1683682600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "I want to verify the the name and age",
  "description": "",
  "id": "result-page-functionality;i-want-to-verify-the-the-name-and-age",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the Result Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify the text Hello name!",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify the age of the person",
  "keyword": "Then "
});
formatter.match({
  "location": "ResultPageSteps.iAmOnTheResultPage()"
});
formatter.result({
  "duration": 213874300,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageSteps.iVerifyTheTextHelloName()"
});
formatter.result({
  "duration": 336802700,
  "status": "passed"
});
formatter.match({
  "location": "ResultPageSteps.iVerifyTheAgeOfThePerson()"
});
formatter.result({
  "duration": 31869400,
  "status": "passed"
});
formatter.after({
  "duration": 622367300,
  "status": "passed"
});
});