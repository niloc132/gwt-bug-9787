Sample to try to test https://github.com/gwtproject/gwt/issues/9787

1. In a terminal window, run `mvn gwt:codeserver -pl *-client -am`
2. In another terminal window, run `mvn jetty:run -pl *-server -am -Denv=dev`
3. Launch a browser and navigate to http://localhost:8080
4. Open browser dev console
5. Click the "Send" button

Expected behavior: in the browser console, the text "TEST" will be logged for each click (might only increment a counter)

Bug behavior: Assertion fails, with an error message to the browser console
