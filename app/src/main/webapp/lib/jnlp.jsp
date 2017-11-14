<?xml version="1.0" encoding="UTF-8"?>
<%@page contentType="application/x-java-jnlp-file;charset=UTF-8"%>

<%
    final String jspFileName = "jnlp.jsp";
    final String jarName = "frame.jar";

    String sessionId = request.getSession().getId();
    String url = request.getRequestURL().toString();
    String codebase = url.replaceAll(jspFileName, "");
%>

<jnlp spec="1.0+" codebase="<%=codebase%>">
    <information>
        <title>Web Start Test</title>
        <vendor>home</vendor>
    </information>
    <resources>
        <!-- Application Resources -->
        <j2se version="1.8+"
              href="http://java.sun.com/products/autodl/j2se"/>
        <jar href="<%=jarName%>"  main="true" />
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
