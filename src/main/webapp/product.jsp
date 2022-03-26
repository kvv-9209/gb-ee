<%@ page import="ru.gb.model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Valentin
  Date: 23.03.2022
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Product</h1>
<p>Category: ${product.title}</p>
<hr>
<ul>
    <%if (((Product) request.getAttribute("product")).getTitle() != null) %>
    <% for (Product value : (List<Product>) ((Product) request.getAttribute("product")).getChildren()) { %>
    <li>
        <%=value.getId()%>. <%=value.getTitle()%> =  <%=value.getCoast()%> rubles
    </li>
    <% } %>
</ul>
</body>
</html>
