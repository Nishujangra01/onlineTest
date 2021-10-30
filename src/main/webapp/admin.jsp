

<%
    
    User user=(User)session.getAttribute("current-user");

    if (user==null) {
            session.setAttribute("message","You are not logged in !! First login please");
            response.sendRedirect("login.jsp");
            return;
        }
        else{
    
        if (user.getUserType().equalsIgnoreCase("normal")) {
                session.setAttribute("message", "You are not Admin !! Donot access please");
                 response.sendRedirect("login.jsp");
            return;
            }
    }
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
          <%@include file="component/common_css_js.jsp" %>
    </head>
    <body>
         <%@include file="component/navbar.jsp" %>
        
         <div class="container" >
             <div class="row">
                 <!--                 first                  -->
                <p>Click on the "Choose File" button to upload a JSON file:   </p><br>

                <form action="UploadServlet" method="post" enctype="multipart/form-data">
   
  <input type="file" id="myFile" name="file1"><br>
  <input type="submit" value="upload">
</form>

                  
                 </div>
               
                
    </body>
</html>
