# jnplTest
To run WebStrat on tomcat Server locally
1) Add 'http://localhost:8080' to security exception site list (Java Control panel)
![Alt text](https://drive.google.com/file/d/14r85IN-4N2szqOuOhbVTADhs_Mu5YaJQ/view?usp=sharing "Java control pannel")
2) Tomcat run configuration: deployment - artifact app:war (not exploded)
3) after mvn build and start tomcat server place signed jar (frame.jar from target folder)
to lib folder (example C:\dev\apache-tomcat-8.5.16\webapps\ROOT\lib\frame.jar)
![Alt text](https://drive.google.com/file/d/1vvkemAjPWIP3FVjNATQkPxW5lokj1yyG/view?usp=sharing "deployment - not exploded") 

if deployment app:war exploded  place frame.jar to app->target->lib folder
![Alt text](https://drive.google.com/file/d/1WbTNUiy1HQqfGRUJapIVRu0dAIS2K9LK/view?usp=sharing "deployment - exploded") 