<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<h2>Information</h2>
<form method="post" action="/Registration/add/person">
   <table>
    <tr>
        <td>First Name</td>
        <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
        <td>Last Name</td>
        <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
        <td>DOB</td>
        <td><input type="date" name="DOB" /></td>
    </tr>
    <tr>
        <td>City</td>
        <td><input type="text" name="city" /></td>
    </tr>
     <tr>
        <td>State</td>
        <td><input type="text" name="state" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form>
</body>
</html>