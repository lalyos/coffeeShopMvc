<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<h2>v 1.1</h2>
<c:url var="saveUrl" value="/coffee/save" />
<form:form action="${saveUrl}"  modelAttribute="coffee" >

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
      <form:errors path="price" cssStyle="color:red;" />
  
	<br/>imageUrl <input name="imageUrl" type="text"   value="${coffee.imageUrl}"/>
	<br/><input type="submit" value="save" />
</form:form>