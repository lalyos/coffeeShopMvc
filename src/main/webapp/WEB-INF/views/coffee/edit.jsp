<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags"  prefix="epam"%>

<h2>v 1.1</h2>
<c:url var="saveUrl" value="/coffee/save" />
<form:form action="${saveUrl}"  modelAttribute="coffee" >

<c:choose>
<c:when test="">
  <br/>name: ${coffee.name}
  <input name="name" type="hidden"  value="${coffee.name}"/>
</c:when>
<c:otherwise>
  <br/>name: <form:input path="name"/>
      <form:errors path="name" cssStyle="color:red;" />
</c:otherwise>
</c:choose>
	<br/>price: <form:input path="price"/>
      <form:errors path="price" cssStyle="color:red;" />
  
	<br/>imageUrl <form:input path="imageUrl"/>
      <form:errors path="imageUrl" cssStyle="color:red;" />
	<br/><input type="submit" value="save" />
</form:form>

