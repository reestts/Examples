<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>
    All Employees
</h2>

<br>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operation</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">
        <c:url var="update_button" value="/updateEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="delete_button" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td> ${emp.name} </td>
            <td> ${emp.surname} </td>
            <td> ${emp.department} </td>
            <td> ${emp.salary} </td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${update_button}'"/>
                <input type="button" value="Delete" onclick="window.location.href='${delete_button}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<br>

<input type="button" value="Add" onclick="window.location.href='addEmployee'"/>

</body>

</html>