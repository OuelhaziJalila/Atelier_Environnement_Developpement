<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Recherche Musiques</title>
</head>
<body>
    <form action="controleur" method="post">
        <input type="text" name="motCle" value="${modele.motCle}">
        <input type="submit" value="OK">
    </form>
    <table border="1" width="80%">
        <tr>
            <th>ID</th> <th>Titre</th> <th>Durée</th>
        </tr>
        <c:forEach items="${modele.musiques}" var="m">
            <tr>
                <td>${m.idMusique}</td>
                <td>${m.titre}</td>
                <td>${m.duree}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>