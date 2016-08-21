<!--
###############################################
#  The Following Lines are very sensitive :D  #
#  Never Try To change without my Permission  #
#      Developed By: Sanjaya Sapkota          #
#  Leapfrog Academy,Charkhal Road,DilliBazar  #
###############################################
-->
<%@include file="entity/header.jsp" %>
<!--Here you can change TItle of the page-->

<title>Contacts || Dashboard  ||</title>

<!--   Danger ! Danger !! Danger !!! -->
<%@include file="entity/sidetop.jsp"%>
<div class="row">        
    <!-- 
    #   Do not Edit The above lines   #
    ###################################
    #  Do not Change the above lines  #
    -->
    <!--
    ###################################################################
    #                                                                 #
    #  Main Content Box start,you can edit add  whatever you want :D  #
    #                                                                 #
    ###################################################################
    --> 
    <div class="col col-md-12">
        <div class="form-control">
           
<h2> Contact</h2>


<table class="table table-striped table-responsive table-hover table-bordered">
    <tr class="bg-info"><th>ID</th>                   
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Address</th>
        <th>Relation</th> 
    </tr>
    <tr><%
        ManagerDAO managerDAO = new ManagerDAOImpl();
        for (Manager m : managerDAO.getAll()) {
        %>
        <th><%=m.getId()%></th>                   
        <th><%=m.getName()%></th> 
        <th> <%=m.getEmail()%></th>                   
        <th><%=m.getPhone()%></th>
        <th><%=m.getAddress()%></th>                   
        <th><%=m.getRelation()%></th>
        <th> 
            
            
                <a href="loan_details.jsp?id=<%=m.getId()%>" class="btn btn-info center-block "  target="_blank">
                <span class="bg-info glyphicon glyphicon-eye-open"></span>View
            </a>
            
        <th>
            <a   href="edit.jsp?id=<%=m.getId()%>" target="_blank" class="btn btn-success">
                <span class="glyphicon glyphicon-pencil">Edit</span>
            </a>
            <a  href="delete.jsp?id=<%=m.getId()%>" target="_blank" class="btn btn-danger">
                <span class="glyphicon glyphicon-trash">Delete</span>
            </a>
        </th>
   </tr>
    <% }%>
</table>
            
            
            
            
            
            
        </div>
    </div>            























<!--
    ###################################################################
    #                                                                 #
    #  Main Content Box ends,now you can modify the following lines   #
    #                                                                 #
    ###################################################################
-->      
<!-- 
   #   Do not Edit The following lines   #
   #######################################
   #  Do not Change the following lines  #
-->
</div>
<%@include file="entity/footer.jsp" %>