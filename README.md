# jnplTest
To run WebStrat on tomcat Server locally
1) Add 'http://localhost:8080' to security exception site list (Java Control panel)

![Alt text](https://lh5.googleusercontent.com/muNNf7WkYLPrjkm-ai_qoqSMJ0WI4s8CTaori2WWSfAZEpkewH9ZZeLkCLdu9eKnyOjOe9p67uHpOvhS8TCR=w1920-h947 "Java control pannel")


2) after mvn build and start tomcat server place signed jar (frame.jar from target folder)
to:
    - Tomcat run configuration: deployment - artifact app:war (not exploded)
      lib folder (example C:\dev\apache-tomcat-8.5.16\webapps\ROOT\lib\frame.jar)

![Alt text](https://lh5.googleusercontent.com/p560GJs278mqUuVkR-ADTRCQJLN3NtmPAar81s_TtVPb_nzjvedXqS5Y2jo_cA4JEipQeigo4dQBSN0rASEE=w1920-h947 "deployment - not exploded") 

    - Tomcat run configuration: app:war exploded  place frame.jar to app->target->lib folder
    
![Alt text](https://lh5.googleusercontent.com/hno3JBqm6BfGCoJ2ReNVc4ZpSAkDOtfFgKvFDgmkAR1hag0Ep7-4xv6GUF35n7Sp_JbVPfGUYCmHPj_ipKrJ=w1920-h947 "deployment - exploded") 

Some tips:

To clear JavaWS cache run command: javaws -uninstall

We need it when some changes to jar file was done.
