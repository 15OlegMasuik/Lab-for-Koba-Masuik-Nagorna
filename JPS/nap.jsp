<%@ page import="java.io.*,java.util.*" %>
<html>
<title>
Напоминания
</title>
<body>
<body
bgcolor=green>
</body>
<H1>
<FONT color=red> 
<B> <font size="+4"> Напоминание </font> </B>
</FONT> 
</H1>
<Hr>
<table border="1">
<caption align=top>Напоминаем:</caption>
<tr><th>Его положение</th><th>Название продуктов</th>
<tr><td>Продукты,что испортились</td><td>Масло</td>
<tr><td>Продукты,что уже закончились</td><td>Сыр,молоко</td>
<tr><td>Продукты,что завтра испортятся</td><td>Сетана,творог,банан</td>
</table>

 <div id="content">
			<section id="main_section">
				<form method="POST" action="registration.php">
					<fieldset style="width:650px">
					<table width="650" style="text-indent:0;">
					
						<tr>
							<td><input type="submit" value="Отложить"></td>
							<td><input type="reset" value="на 10 мин"></td>
						</tr>
                                                   <tr>
							<td><input type="submit" value="Добавить в список покупок"></td>
							
						</tr>
					</table>
					</fieldset>
					</form>
			</section>
			<section id="side_section">
				
			</section>
			<div style="clear:both"></div>
      </div>

   </tr>
  
  </table>

</body>
<html>