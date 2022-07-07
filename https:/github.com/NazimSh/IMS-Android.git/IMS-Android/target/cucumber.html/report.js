$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/IMSFeatureFiles/IMSPreLoginDetails.feature");
formatter.feature({
  "name": "IMS Pre-login page details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Android IMS Pre-login page details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Auto"
    },
    {
      "name": "@IMDPreLoginDetails"
    }
  ]
});
formatter.step({
  "name": "Launch IMS App",
  "keyword": "Given "
});
formatter.step({
  "name": "Verify Wonder logo W",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Inventory Management System",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify Please log in to access your Wonder IMS account",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Log In Button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify App Environemnt",
  "keyword": "And "
});
formatter.step({
  "name": "Verify App version",
  "keyword": "And "
});
formatter.step({
  "name": "Verify App Bundle Id",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserID",
        "Password"
      ]
    },
    {
      "cells": [
        "nazim@wonder.com",
        "abcd1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Android IMS Pre-login page details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Auto"
    },
    {
      "name": "@IMDPreLoginDetails"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch IMS App",
  "keyword": "Given "
});
formatter.match({
  "location": "IMSStepDefinitions.Launch_Envoy_Restaurant_Portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Wonder logo W",
  "keyword": "When "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_Wonder_logo_W()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Inventory Management System",
  "keyword": "Then "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_Inventory_Management_System()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Please log in to access your Wonder IMS account",
  "keyword": "And "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_Please_log_in_to_access_your_Wonder_IMS_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Log In Button",
  "keyword": "And "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_Log_In_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify App Environemnt",
  "keyword": "And "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_App_Environemnt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify App version",
  "keyword": "And "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_App_version()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify App Bundle Id",
  "keyword": "And "
});
formatter.match({
  "location": "IMSStepDefinitions.Verify_App_Bundle_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});