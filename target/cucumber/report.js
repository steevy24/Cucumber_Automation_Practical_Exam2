$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/WhiteBackground.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practical Exam",
  "description": "",
  "id": "automation-practical-exam",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "White Background Change;",
  "description": "",
  "id": "automation-practical-exam;white-background-change;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "\"Set SkyWhite Background\" button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the button;",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "StepDefinition.button_exists(String)"
});
formatter.result({
  "duration": 4299900000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 3174526700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 64220600,
  "status": "passed"
});
});