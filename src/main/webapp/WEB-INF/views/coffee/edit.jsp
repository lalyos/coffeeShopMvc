<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url var="saveUrl" value="/coffee/save" />
<form action="${saveUrl}" method="post">
<c:choose>
<c:when test="">
  <br/>name: ${coffee.name}
  <input name="name" type="hidden"  value="${coffee.name}"/>
</c:when>
<c:otherwise>
  <br/>name: <input name="name" type="text"  value="${coffee.name}"/>
</c:otherwise>
</c:choose>
	<br/>price: <input name="price"  type="text"   value="${coffee.price}"/>
	<br/>imageUrl <input name="imageUrl" type="text"   value="${coffee.imageUrl}"/>
	<br/><input type="submit" value="save" />
</form>
