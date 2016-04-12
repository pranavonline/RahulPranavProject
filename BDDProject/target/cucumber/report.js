$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFirstFeature.feature");
formatter.feature({
  "line": 1,
  "name": "My First feature",
  "description": "",
  "id": "my-first-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search functionality",
  "description": "",
  "id": "my-first-feature;search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on \"https://www.google.com\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for \"Testing\" keyword",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I landed to search result page for \"Testing\" keyword",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com",
      "offset": 9
    }
  ],
  "location": "MyFirstStepDefinition.navigateTo(String)"
});
formatter.result({
  "duration": 10105010487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 14
    }
  ],
  "location": "MyFirstStepDefinition.i_search_for_keyword(String)"
});
formatter.result({
  "duration": 633779399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 36
    }
  ],
  "location": "MyFirstStepDefinition.i_landed_to_search_result_page_for_keyword(String)"
});
formatter.result({
  "duration": 134403643,
  "status": "passed"
});
});