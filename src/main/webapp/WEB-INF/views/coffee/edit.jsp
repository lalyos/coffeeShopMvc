<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="saveUrl" value="/coffee/save" />
<form action="${saveUrl}" method="POST">
	<br/>name: <input type="text" disabled  value="${coffee.name}"/>
	<br/>price: <input type="text"   value="${coffee.price}"/>
	<br/>imageUrl <input type="text"   value="${coffee.imageUrl}"/>
	<br/><input type="submit" value="save" />
</form>
