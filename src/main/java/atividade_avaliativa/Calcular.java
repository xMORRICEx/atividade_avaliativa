package atividade_avaliativa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calcular
 */
@WebServlet("/Calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calcular() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        float n1 = Float.parseFloat(request.getParameter("n1"));  
        float n2 = Float.parseFloat(request.getParameter("n2"));  
        String resp = "A soma é: " + (n1+n2);  
        request.setAttribute("resp", resp);
        response.sendRedirect("calculadora.jsp");
    }  
  
}
