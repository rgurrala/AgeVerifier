language - selenium with JAVA
framework dependencies - cucumber, Gherkin, Junit and maven
framework structure-
src-> main
src-> test

src-> main -> Java -> Pages
  -> Payload
  -> Support

src -> main -> Java ->Pages
 AppPage: has method to launch the app
 MainPage: has methods to perform actions on app
 RestService: has method to perform POST action for the API

src -> main -> Java -> Payload
-this has a .json file for POST.

src -> main -> JAVA -> Support
Utils: this has methods for getting payload & accessing CMD to start the appium server


src -> test -> Java -> StepDefs
   -> RnnerTest

src -> test -> Java -> StepDefs
-has stedDefs for API and APP feature files

src -> test -> Java -> RunnerTest
-Junit test runner class
-creates html reports under target file


src -> test -> Java ->resources ->FeatureFiles
-holds feature files for API and App tests

App tests-
each app test starts off by opening Appium server via CMD
there is an @AfterAll method in the step defs. This tears down the appium server.
