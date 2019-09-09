<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer confirmation form</title>
</head>
<body>
	Customer confirmed: ${customer.firstName} ${customer.lastName}
	
	<br><br>
	Free passes: ${customer.freePasses}
	
	<br><br>
	Postal code: ${customer.postalCode}
</body>
</html>