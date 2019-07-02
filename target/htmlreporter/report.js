$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sample3.feature");
formatter.feature({
  "name": "Signup",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "sign up with different users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens sign up page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters fn as \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters ln as \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters dob as \"\u003cdob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters password as \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the login successful",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "dob",
        "pass"
      ]
    },
    {
      "cells": [
        "aishu",
        "saran",
        "15/11/1997",
        "aihsaran"
      ]
    },
    {
      "cells": [
        "aparna",
        "sivarajan",
        "03/03/1997",
        "appusiva"
      ]
    },
    {
      "cells": [
        "diviya",
        "murugesan",
        "29/09/1997",
        "diviyaaaa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "sign up with different users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample3cucumber.user_opens_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn as \"aishu\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln as \"saran\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob as \"15/11/1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"aihsaran\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample3cucumber.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the login successful",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.verify_the_login_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "sign up with different users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample3cucumber.user_opens_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn as \"aparna\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln as \"sivarajan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob as \"03/03/1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"appusiva\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample3cucumber.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the login successful",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.verify_the_login_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "sign up with different users",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sample3cucumber.user_opens_sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters fn as \"diviya\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_fn_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ln as \"murugesan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_ln_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters dob as \"29/09/1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"diviyaaaa\"",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample3cucumber.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the login successful",
  "keyword": "And "
});
formatter.match({
  "location": "Sample3cucumber.verify_the_login_successful()"
});
formatter.result({
  "status": "passed"
});
});