<%@ page import="java.io.*,java.util.*" %>
<html>
<title>
Список покупок
</title>
<body>
<body
bgcolor=yellow>
</body>
<H1>
<FONT color=red> 
<B> <font size="+4"> Список покупок </font> </B>
</FONT> 
</H1>
<Hr>
<table border="1">
<caption align=top>Вам нужно купить:</caption>
<tr><th>Название</th><th>Количество</th>
<tr><td>Молоко</td><td>1 л</td>
<tr><td>Яйца</td><td>10 шт.</td>
<tr><td>Клубника</td><td>1 кг</td>
</table>

 <div id="content">
			<section id="main_section">
				<form method="POST" action="registration.php">
					<fieldset style="width:650px">
					<table width="650" style="text-indent:0;">
					
						<tr>
							<td><input type="submit" value="Добавить в список"></td>
							
						</tr>
                                                   <tr>
							<td><input type="submit" value="Очистить список"></td>
							
						</tr>

						<tr>
							<td><input type="submit" value="Отложить"></td>
							
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