$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/RetailPage.feature");
formatter.feature({
  "line": 2,
  "name": "Retail Website Features",
  "description": "",
  "id": "retail-website-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@assignment"
    }
  ]
});
formatter.before({
  "duration": 2849001100,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Every feature file starts with Feature: \u003cName of feature file\u003e"
    },
    {
      "line": 5,
      "value": "#Every Scenario starts with Scenario: \u003cName of Test case we want to automate\u003e"
    },
    {
      "line": 6,
      "value": "#Gherkin keywords are Given When Then"
    },
    {
      "line": 7,
      "value": "#Given is precondition"
    },
    {
      "line": 8,
      "value": "#When is an Action taken"
    },
    {
      "line": 9,
      "value": "#Then is an expected result (usually we write validation)"
    },
    {
      "line": 10,
      "value": "#And is repeating an action or can be used following Given keyword as well"
    },
    {
      "line": 11,
      "value": "#But is used for negative scenarios verification"
    }
  ],
  "line": 13,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 14,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4113389500,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d88.0.4324.190)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027LAPTOP-FFQF3J62\u0027, ip: \u002710.0.0.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\12408\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55729}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2fb099e80dede0a7b89f05906921a5a4\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:657)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:328)\r\n\tat pageObjects.LoginPageObj.getPageTitle(LoginPageObj.java:71)\r\n\tat stepDefinitions.LoginTestStepDefinition.user_is_on_Retail_website(LoginTestStepDefinition.java:25)\r\n\tat ✽.Given User is on Retail website(Features/RetailPage.feature:14)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "Search functionality Test case",
  "description": "",
  "id": "retail-website-features;search-functionality-test-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User search for \u0027iphone\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should see Iphone image",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 17
    }
  ],
  "location": "RetailPageTestStepDefinitions.user_search_for_iphone(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageTestStepDefinitions.user_should_see_Iphone_image()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4104461700,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d88.0.4324.190)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027LAPTOP-FFQF3J62\u0027, ip: \u002710.0.0.42\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\12408\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55729}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2fb099e80dede0a7b89f05906921a5a4\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:657)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:486)\r\n\tat core.Base.tearDown(Base.java:104)\r\n\tat stepDefinitions.Initializer.afterHooks(Initializer.java:65)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 22,
      "value": "# In scenario Outline we can run same scenario with multiple set of data"
    },
    {
      "line": 23,
      "value": "# we will use examples keyword to pass different data"
    },
    {
      "line": 24,
      "value": "# Every Scenario outline follows with Examples keyword"
    },
    {
      "line": 25,
      "value": "# Under examples keyword we placed data inside the pipes | and we can separate"
    },
    {
      "line": 26,
      "value": "# columns with pipes"
    },
    {
      "line": 27,
      "value": "# in this examples each row represent one time of execution"
    }
  ],
  "line": 30,
  "name": "Test Search Funtionality with multiple set of Data",
  "description": "",
  "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@TestSmokee"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User search for \u0027\u003citemName\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "User click on search button",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data;",
  "rows": [
    {
      "cells": [
        "itemName"
      ],
      "line": 37,
      "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data;;1"
    },
    {
      "cells": [
        "iphone"
      ],
      "line": 38,
      "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data;;2"
    },
    {
      "cells": [
        "mac book"
      ],
      "line": 39,
      "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data;;3"
    },
    {
      "cells": [
        "Canon"
      ],
      "line": 40,
      "id": "retail-website-features;test-search-funtionality-with-multiple-set-of-data;;4"
    }
  ],
  "keyword": "Examples"
});
