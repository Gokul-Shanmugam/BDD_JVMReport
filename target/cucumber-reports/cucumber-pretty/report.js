$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "BDD Scenario_1",
  "description": "",
  "id": "bdd-scenario-1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tst"
    },
    {
      "line": 1,
      "name": "@reg"
    },
    {
      "line": 1,
      "name": "@sasnity"
    },
    {
      "line": 1,
      "name": "@US123456"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "BDD Test case_2",
  "description": "",
  "id": "bdd-scenario-1;bdd-test-case-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User launch demo automation in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "verify title of login page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user click on skip sign in demo automation site",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enter \"Gokul\" and \"S\" in register page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition2.user_already_on_login_page()"
});
formatter.result({
  "duration": 16715983900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition2.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 32723600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition2.Click_Skipsignin()"
});
formatter.result({
  "duration": 4275435800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gokul",
      "offset": 12
    },
    {
      "val": "S",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition2.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 10743767400,
  "status": "passed"
});
});