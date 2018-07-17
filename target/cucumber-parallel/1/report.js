$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chris/dev/seleniumdocker/JavaCucumberFramework/src/test/resources/features/home.feature");
formatter.feature({
  "line": 1,
  "name": "home",
  "description": "As a user\nI want to be able to search for items through the home page and access sign\nSo that I can find things and access my email",
  "id": "home",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15317536473,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "home",
  "description": "",
  "id": "home;home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the search term \"Amazon\" into the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can see the search results for \"Amazon\" in the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I can see the following tabs:",
  "rows": [
    {
      "cells": [
        "Settings"
      ],
      "line": 10
    },
    {
      "cells": [
        "Tools"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 947867579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 25
    }
  ],
  "location": "MyStepdefs.iEnterTheSearchTermIntoTheSearchBar(String)"
});
formatter.result({
  "duration": 4752560389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 34
    }
  ],
  "location": "SearchResultsSteps.iCanSeeTheSearchResultsForInTheSearchResultsPage(String)"
});
formatter.result({
  "duration": 209376819,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsSteps.iCanSeeTheFollowingTabs(String\u003e)"
});
formatter.result({
  "duration": 373134054,
  "status": "passed"
});
formatter.after({
  "duration": 167115812,
  "status": "passed"
});
