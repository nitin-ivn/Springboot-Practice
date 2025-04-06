<%@page language = "java" %>
<html>
    <head>
        <link rel = "stylesheet" type="text/css" href = "style.css" >
    </head>
    <body>
        <h2>Result Is: <%= session.getAttribute("result") %> </h2>
        <p> ${alien} </p>
        <p>Welcome to the ${course} World</p>
    </body>
</html>