<?xml version="1.0" encoding="UTF-8"?>
<jnlp spec="1.0+" href="test.jnlp">
    <information>
        <title>Web Start Test</title>
        <vendor>home</vendor>
    </information>
    <resources>
        <!-- Application Resources -->
        <j2se version="1.8+"
              href="http://java.sun.com/products/autodl/j2se"/>
        <jar href="frame.jar"  main="true" />
    </resources>
    <security>
        <all-permissions/>
    </security>
    <application-desc
            name="JNPL Test"
            main-class="demo.frame.WebStartExample"
            width="300"
            height="300">
    </application-desc>
    <update check="background"/>
</jnlp>