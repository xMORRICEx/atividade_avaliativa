package atividade_avaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");
		saida.write("Olá " + request.getParameter("nome")+("&nbsp;")+("sejá bem vindo:<p>"));
		saida.write("suas informações foram gravadas... ");
	/**pegando parametros**/
		
		saida.write(""+request.getParameter("nome")+("<p>"));
		saida.write(""+request.getParameter("telefone")+("<p>"));
		saida.write(""+request.getParameter("data")+("<p>"));
		
		
		saida.write("</BODY></HTML>");
		saida.close();
	}

}
