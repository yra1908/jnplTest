# jnplTest
To run WebStrat on tomcat Server locally
1) Add 'http://localhost:8080' to security exception site list (Java Control panel)

![Alt text](http://s018.radikal.ru/i522/1712/49/ff02c4dc70d5.png "Java control pannel")


2) after mvn build and start tomcat server place signed jar (frame.jar from target folder)
to:
   - Tomcat run configuration: deployment - artifact app:war (not exploded)
      lib folder (example C:\dev\apache-tomcat-8.5.16\webapps\ROOT\lib\frame.jar)

![Alt text](http://s013.radikal.ru/i323/1712/e2/f7f1ae69f94d.png "deployment - not exploded") 


   - Tomcat run configuration: app:war exploded  place frame.jar to app->target->lib folder
    
![Alt text](http://s019.radikal.ru/i636/1712/16/539fe5aff2f3.png "deployment - exploded") 

Some tips:

To clear JavaWS cache run command: javaws -uninstall

We need it when some changes to jar file was done.
