<html>
<body>
<h2>Hello Hanane!</h2>
<h4>le calcule !!</h4>
<%
     = request.getAttribute("MESSAGE")
%>
<br/>
<%
    out.println("le resultat = "+request.getAttribute("attribut") );
%>
</body>
</html>
