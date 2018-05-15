<%--
  Created by IntelliJ IDEA.
  User: Zuz_zaw
  Date: 15.05.2018
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<form action="", method="post">
    <label> Imię pracownika :
    <input type="text" name="imie">
    </label><br>
    <label>Nazwisko pracownika :
    <input type="text" name="nazwisko">
    </label><br>
    <label>Dane adresowe pracownika :
    <input type="text" name="dane_adres">
    </label><br>
    <label> Telefon kontaktowy pracownika :
        <input type="text" name="tel">
    </label><br>
    <label>Dodatkowe informacje o pracowniku :
        <input type="text" name="note">
    </label><br>
    <label> Koszt roboczogodziny :
        <input type="text" name="rg">
    </label><br>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>
