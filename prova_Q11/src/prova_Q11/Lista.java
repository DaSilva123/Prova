package prova_Q11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/lista")
public class Lista extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			PrintWriter out = resp.getWriter();
			Banco banco = new Banco();
			out.println("<body><html>");
			List<Aluno> lista = banco.getAlunos();
			out.println("</table>");
			for (Aluno aluno : lista) {
				out.println("<tr>");
				out.println("<td>" + aluno.getNome() +" "+ aluno.getCPF() +" "+ aluno.getRG() +" "+ aluno.getEndereco() + "</td>");
				out.println("</tr> <br />");
			}
			// *************************************************************
			out.println("</table>");
			out.print("</center>");
			out.println("</body></html>");
	}


}
