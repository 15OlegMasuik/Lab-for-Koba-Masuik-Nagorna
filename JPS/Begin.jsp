<%@ page import="java.util.*, java.text.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>
<head>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
    <title>
        Target
		
    </title>
	
</head>
 
<body>
<table border="1px" cellpadding="8px">
   <tr><th> <h1>Table with data</h1></tr></th>
	 <tr> <th>
 <h2>VASH POL</h2>

         <form method="get">
    <input type="checkbox" name="author1" value="man">MAN
    <input type="checkbox" name="author" value="woman">WOMAN
             </th></tr>
  
              <th>  <h2>Vash ves</h2>
	
       your Weight <INPUT type="text" name="name1" size="20" maxlength="20"><BR>        
         
  
	</th>
	<tr><th> 
<h2>Your goal</h2>
  
    <input type="checkbox" name="author" value="pohudaty">pohudaty
    <input type="checkbox" name="author" value="nakachatys">nakachatys
	<input type="checkbox" name="author" value="health">helth
   
	<INPUT type="submit" name="submit" value="add"><BR>	 
  </form>
 </tr></th>
  <a href="<%= request.getRequestURI() %>">BACK</a>
  
<input type="button" name="blah" value="next" onclick="document.location.href='menu.jsp'">

    <%
  String[] authors = request.getParameterValues("author");
   if (authors != null)  {
  %>
    <h3>You have selected :</h3>
    <ul>
  <%
      for (int i = 0; i < authors.length; ++i)
  {
  %>
        <li><%= authors[i] %></li>
  <%
      }
  %>
    </ul>
  <%
  }
  %>
 <!-- 2 --> 
 <%
  String[] authors1 = request.getParameterValues("author1");
   if (authors1 != null)  {
  %> 
    <ul>
  <%
      for (int i = 0; i < authors1.length; ++i)
  {
  %>
        <li><%= authors1[i] %></li>
  <%
      }
  %>
    </ul>
  <%
  }
  %>
  <!-- 3 -->
  <%
  String[] name1 = request.getParameterValues("name1");
   if (name1 != null)  {
  %> 
    <ul>
  <%
      for (int i = 0; i < name1.length; ++i)
  {
  %>
        <li><%= name1[i] %></li>
  <%
      }
  %>
    </ul>
  <%
  }
  %>
     
    </ul>
    </table>
</body>
</html>