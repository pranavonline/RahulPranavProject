$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Rahul/BDDProject/Resources/MyFirstFeature.feature");
formatter.feature({
  "id": "my-first-feature",
  "description": "",
  "name": "My First feature",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "my-first-feature;search-functionality",
  "description": "",
  "name": "Search functionality",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am on \"https://www.google.com\" page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I search for \"Testing\" keyword",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I landed to search result page for \"Testing\" keyword",
  "keyword": "Then ",
  "line": 6
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
  "duration": 5801950000,
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
  "duration": 350488000,
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
  "duration": 95774000,
  "status": "passed"
});
});