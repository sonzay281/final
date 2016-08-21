<%
    if (!request.getMethod().equalsIgnoreCase("post")) {
        response.sendRedirect("login.jsp?login First");
    } else {
       //if (email = 123@gmail.com && password == 123) {

            response.sendRedirect("dashboard.jsp");
       // } else {
       //     response.sendRedirect("login.jsp?error");
      //  }
   }

%>