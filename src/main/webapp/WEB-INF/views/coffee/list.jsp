 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>coffees</h2>

<ul>
<c:forEach items="${coffees}" var="coffee">
<c:url var="deleteUrl" value="/coffee/delete" >
  <c:param name="coffee" value="${coffee.name}" />
</c:url>
<li> <img src="${coffee.imageUrl}" width='100px' /> ${coffee.name} (${coffee.price}) 
<a href="${deleteUrl}">X</a>
</li>
</c:forEach>
</ul>