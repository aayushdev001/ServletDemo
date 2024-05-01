<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body bgcolor = "cyan">
    <%
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int c = a + b;
        System.out.println(c);
        out.println(c +" (from get)");
    %>

</body>
</html>