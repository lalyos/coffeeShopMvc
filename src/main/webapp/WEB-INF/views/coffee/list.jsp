 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>coffees</h2>

<c:if test="${not empty msg }">
  <div style="background: green">${msg }</div>
  <c:remove var="msg"  scope="session"  />
</c:if>

<ul>
<c:forEach items="${coffees}" var="coffee">
<c:url var="deleteUrl" value="/coffee/delete" >
  <c:param name="coffee" value="${coffee.name}" />
</c:url>
<c:url var="editUrl" value="/coffee/edit" >
  <c:param name="coffee" value="${coffee.name}" />
</c:url>

<li> <img src="${coffee.imageUrl}" width='100px' /> ${coffee.name} (${coffee.price}) 
<a href="${editUrl}">Edit</a> | 
<a href="${deleteUrl}">X</a>
</li>
</c:forEach>
</ul>