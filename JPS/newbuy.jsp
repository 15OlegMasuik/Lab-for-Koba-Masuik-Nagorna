<%@ page import="java.io.*,java.util.*" %>
<html>
   <head>
        <title>HTML цвет текста</title>
                
   </head>
<head>
  
  <title>font-size</title>
  <style>
hr {
    border: none; /* Убираем границу */
    background-color: #339999; /* Цвет линии */
    color: #339999; /* Цвет линии для IE6-7 */
    height: 2px; /* Толщина линии */
   }
   h1 {
    font-family: 'Chiller', Times, serif; /* Гарнитура текста */ 
    font-size: 300%; /* Размер шрифта в процентах */ 
   } 
  </style>
 </head>
 <body>
 <h1 style="color:#006666" align="left">New buy</h1>
<hr>
<style>
body { 
    background: #CCFFFF; /* Цвет фона */
    color: #003366; /* Цвет текста */
   } </style>
 <tr>
<body>
<td>
<h3><p><img src=" banana.jpg" align="left" width = "200"></p></h3>
 </td>
</tr>
    </body>
</html>
<html>
   <head>
        <title>Main page</title>		
 </head>
   <body>  
 <table  border="0" cellspacing="5" cellpadding="5">
   <caption>Caregories</caption>
   <caption>Fruit</caption>
   <tr>
    <td align="right" valign="top">Name</td>
    <td><input type="text" name="name" size="25" required></td>
   </tr>
   <tr>
    <td align="right" valign="top">How much</td>
    <td><input type="text" name="Кількість" size="25" required></td>
   </tr>
   <tr>
    <td align="right" valign="top" >Date</td>
    <td>
     <input type="Дата покупки" name="Дата покупки" size="25" required >
    </td>
   </tr>
   <tr>
    <td align="right" valign="top" >Srok hodnosti</td>
    <td>
     <input type="Срок придатності" name="Срок придатності" size="25" required>
    </td> 
    </td>
   </tr>
<tr>
    <td align="right" valign="top" >Kalorii 100 gr</td>
    <td>
     <input type="Калорії на 100гр" name="Калорії на 100гр" size="25" required>
    </td>       
    </td>
   </tr>
   <tr>
    <td align="right" colspan="2">
     <input type="button" name="blah" value="next" value="save" onclick="document.location.href='racio.jsp'">
	  <a href="<%= request.getRequestURI() %>"><input type="reset" name="reset" value="Cancel"></a>
    </td>
   </tr>
</form>
 </table>
   </body>
</html>
