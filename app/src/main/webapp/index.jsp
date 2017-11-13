<html>
<body>
<h2>Hello World!</h2>

<%
    String sessionId = request.getSession().getId();
%>
<h2>Session Id <%=sessionId%></h2>

<h2>Link to static jnlp</h2>
<a href="lib/test.jnlp">static</a>
<h2>Link to dynamic jnlp</h2>
<a href="lib/jnlp.jsp">dynamic</a>
</body>

</html>
