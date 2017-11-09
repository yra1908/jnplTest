<?xml version="1.0" encoding="UTF-8"?>
<jnlp spec="1.0+" codebase=""
      href="dynamictree_webstart.jnlp">
    <information>
        <title>Web Start Test</title>
        <vendor>41X</vendor>
    </information>
    <resources>
        <!-- Application Resources -->
        <j2se version="1.8+"
              href="http://java.sun.com/products/autodl/j2se"/>
        <jar href="demo-0.0.1-SNAPSHOT.jar"  main="true" />
    </resources>
    <application-desc
            name="JNPL Test"
            main-class="com.example.demo.frame.WebStartExample"
            width="300"
            height="300">
    </application-desc>
    <update check="background"/>
</jnlp>
