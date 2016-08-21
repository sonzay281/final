<%@include file="entity/header.jsp" %>
<title>User Dashboard || Edit Event</title>
<%@include file="entity/sidetop.jsp" %>
        <div class="row">
                <!-- 
    #   Do not Edit The above lines   #
    ###################################
    #  Do not Change the above lines  #
    -->
    <!--
    ###################################################################
    #                                                                 #
    # Main Content Box start,you can edit delete whatever you want :D #
    #                                                                 #
    ###################################################################
    --> 
    
            <div class="form-group"><h3><label>Edit Event</label></h3>
                <form method="post" action="update-event.jsp">
                    <div class="form-group">
                        <label>Title</label>
                        <input type="text"  class="form-control" required="required" name="title" placeholder="Enter event title" />   
                    </div>
                    <div class="form-group">
                        <label>Date</label>
                        <input type="datetime-local"  class="form-control" required="required" name="date"/>
                    </div>
                    <div class="form-group">
                        <label>Venue</label>
                        <input type="text"   class="form-control" required="required" name="venue" placeholder="Enter address" />
                    </div>
                    <div class="form-group">
                        <label>Phone</label>
                        <input type="text"   class="form-control" required="required" name="phone" placeholder="Enter Contact No."/>  
                    </div>
                    <div class="form-group">
                        <label>Organizer's Name</label>
                        <input type="text" class="form-control" required="required" name="org_name" placeholder="Enter organizer's Name"/>
                    </div>
                     <div class="form-group">
                        <label>Description</label>
                        <textarea   class="form-control" required="required" name="phone" placeholder="Description" rows="5"> </textarea>>
                    </div>
                     <div class="form-group">
                        
                         <label> Browse Image:</label><input type="file" name="img"/>
                    </div>
                    <div class="pull-right">
                        <button type="submit" class="btn btn-success "><span class="glyphicon glyphicon-floppy-save"></span>Update</button>
                        <a class="btn btn-warning " href="dashboard.jsp?cancel"><span class="glyphicon glyphicon-remove"></span>Cancel</a> 
                    </div>    
                </form>
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
       