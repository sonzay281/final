<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.leapfrog.eventmanager.dao.impl.UserDAOImpl"%>
<%@page import="com.leapfrog.eventmanager.entity.User"%>
<%@page import="com.leapfrog.eventmanager.dao.UserDAO"%>
<%
    if (!request.getMethod().equalsIgnoreCase("post")) {
        out.println("<h1>Oh hero,Your father is here.Go to hell.</h1>");
    } else {
        try {
            UserDAO userDAO = new UserDAOImpl();
            User u = new User();
            u.setName(request.getParameter("org_name"));
            u.setPhone(request.getParameter("phone"));
            u.setEmail(request.getParameter("email"));
            u.setAddress(request.getParameter("address"));
            u.setRelation(request.getParameter("relation"));
            userDAO.insertContact(u);
            response.sendRedirect("index.jsp?saved");
            out.println(u);
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }


%>