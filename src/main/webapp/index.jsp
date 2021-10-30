<%-- 
    Document   : index
    Created on : Oct 29, 2021, 9:41:27 AM
    Author     : a
--%>

<%@page import="com.mycompany.onlinetest.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: "https://www.google.com/url?sa=i&url=https%3A%2F%2Fscholarshipfellow.com%2Fhow-to-prepare-for-online-scholarship-exam%2F&psig=AOvVaw340SyhZTR275z04Amq1nVv&ust=1635568099244000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiNi5bk7vMCFQAAAAAdAAAAABAD";

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Test-Home</title>
        <%@include file="component/common_css_js.jsp" %>
    </head>
    <body>
       <%@include file="component/navbar.jsp" %>
          <div class="bg"></div>
        
    </body>
</html>
