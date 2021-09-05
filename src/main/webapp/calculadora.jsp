<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE>
<html>  
  <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <%  
             String resp = request.getParameter("resp");  
        %>  
  </head>  
  <body>  
    <form action="Calcular" method="post">  
     <input type="text" name="n1">  
     <br/>  
     <input type="text" name="n2">  
     <input type="submit" value="Calcular">  
    </form>  
   Resposta: <% out.println(resp); %>
  </body>  
</html>   