# autotestmentoring


Run test using the following command:

mvn clean test -Dtest=CucumberTestRunner -Dbrowser=chrome

To run with Saucelabs use the following command:
mvn clean test -Dhost=saucelabs -Dtest=CucumberTestRunner -Dbrowser=<browserName>
