<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP with Java Example</title>
    <script type="text/javascript">
        // JavaScript function to reload the page every second
        setInterval(function(){
            location.reload();
        }, 1000); // 1000 milliseconds = 1 second
    </script>
</head>
<body>
    <h1>Hello, World! This is a JSP with Java Example.</h1>
    
    <%
        // Java code within a JSP scriptlet
        java.util.Date currentDate = new java.util.Date();
        String formattedDate = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(currentDate);
    %>
    
    <p>Current Date and Time: <%= formattedDate %></p>
</body>
</html>