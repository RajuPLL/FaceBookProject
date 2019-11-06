$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to facebook with correct credentials",
  "description": "",
  "id": "facebook-login-feature;login-to-facebook-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Facebook Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"karmakar9177@gmail.com\" as email and \"8768949899\" as password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user successfuly logs into Facebook Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginStepDefination.user_is_already_on_Facebook_Login_page()"
});
formatter.result({
  "duration": 39935454017,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefination.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 92163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karmakar9177@gmail.com",
      "offset": 12
    },
    {
      "val": "8768949899",
      "offset": 50
    }
  ],
  "location": "FacebookLoginStepDefination.user_enter_karmakar_gmail_com_as_email_and_as_password(String,String)"
});
formatter.result({
  "duration": 133402301639,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginStepDefination.user_successfuly_logs_into_Facebook_Home_Page()"
});
formatter.result({
  "duration": 11013374491,
  "status": "passed"
});
});