<?xml version="1.0" encoding="UTF-8"?>
<%@page contentType="application/x-java-jnlp-file;charset=UTF-8"%>

<%
    String sessionId = request.getSession().getId();
%>

<jnlp spec="1.0+" codebase="file:/C:/work/dependencies/apache-tomcat-7.0.57/webapps/ROOT/">
    <information>
        <title>Web Start Test</title>
        <vendor>home</vendor>
    </information>
    <resources>
        <!-- Application Resources -->
        <j2se version="1.8+"
              href="http://java.sun.com/products/autodl/j2se"/>
        <jar href="WEB-INF/lib/frame.jar"  main="true" />
    </resources>
    <security>
        <all-permissions/>
    </security>
    <application-desc
            name="JNPL Test"
            main-class="demo.frame.WebStartExample"
            width="300"
            height="300">
        <%--passing arguments works fine--%>
        <argument><%=sessionId%></argument>
        <argument>2nd argument</argument>
        <argument>key:<%=sessionId%></argument>
    </application-desc>
    <update check="background"/>
</jnlp>