$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 1,
  "name": "home",
  "description": "",
  "id": "home",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7996297375,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "home",
  "description": "",
  "id": "home;home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the search term \"Amazon\" into the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I can see the search results for \"Amazon\" in the search results page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I can see the following tabs:",
  "rows": [
    {
      "cells": [
        "All"
      ],
      "line": 7
    },
    {
      "cells": [
        "Shopping"
      ],
      "line": 8
    },
    {
      "cells": [
        "News"
      ],
      "line": 9
    },
    {
      "cells": [
        "Images"
      ],
      "line": 10
    },
    {
      "cells": [
        "Books"
      ],
      "line": 11
    },
    {
      "cells": [
        "More"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 365896164,
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
  "duration": 1049365341,
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
  "duration": 36026396,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsSteps.iCanSeeTheFollowingTabs(String\u003e)"
});
formatter.result({
  "duration": 624524395,
  "status": "passed"
});
formatter.before({
  "duration": 6877562340,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Go to Sign In",
  "description": "",
  "id": "home;go-to-sign-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click on Sign in",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I can see the Sign In Page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 91444319,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignIn()"
});
formatter.result({
  "duration": 4095507028,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.iCanSeeTheSignInPage()"
});
formatter.result({
  "duration": 93600121,
  "status": "passed"
});
});