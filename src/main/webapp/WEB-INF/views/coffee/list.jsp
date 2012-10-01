 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>coffees</h2>

<ul>
<c:forEach items="${coffees}" var="coffee">
<li> <img src="${coffee.imageUrl}" width='100px' /> ${coffee.name} (${coffee.price})</li>
</c:forEach>
</ul>