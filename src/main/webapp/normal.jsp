<%@page import="com.mycompany.onlinetest.entity.Question"%>
<%@page import="com.mycompany.onlinetest.entity.JsonToObject"%>
<%@page import="java.util.List"%>
  <%
    List<Question> qList =JsonToObject.readJson();    
int count=1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user</title>
    </head>
    <body>
        
         <%@include file="component/navbar.jsp" %>
        <% 
      for (Question question : qList) {
        
          
      %>
    
          <form action="CheckResult"  method="POST">
          Question <%=count++%> :- <label type="text" name="ques" ><%=question.getQues() %></<input><br>
              <input type="radio" name="choose" value="choice1" ><%=question.getChoice1() %><br>
          <input type="radio" name="choose" value="choice2" ><%=question.getChoice2() %><br>
          <input type="radio" name="choose" value="choice3" ><%=question.getChoice3() %><br>
          <input type="radio" name="choose" value="choice4" ><%=question.getChoice4() %><br>
         <br>
      </form><br>
      
     
                    
         <%}%>  
            <input type="submit" value="Submit Test" class="button">
			
            
        
    </body>
</html>
