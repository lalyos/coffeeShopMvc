<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="saveUrl" value="/coffee/save" />
<form action="${saveUrl}" method="POST">
	<br/>name: <input name="name" type="text" disabled  value="${coffee.name}"/>
	<br/>price: <input name="price"  type="text"   value="${coffee.price}"/>
	<br/>imageUrl <input name="imageUrl" type="text"   value="${coffee.imageUrl}"/>
	<br/><input type="submit" value="save" />
</form>
