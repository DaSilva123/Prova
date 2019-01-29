package prova_Q11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns = "/novoAluno")
public class novoAluno extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		String nome = req.getParameter("nome");
		String RG = req.getParameter("RG");
		String CPF = req.getParameter("CPF");
		String endereco = req.getParameter("endereco");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		Banco b = new Banco();	
		
		Aluno e1 = new Aluno();
		
		e1.setNome(nome);
		e1.setRG(RG);
		e1.setCPF(CPF);
		e1.setEndereco(endereco);

		b.adiciona(e1);
		out.println("<h1>O aluno " + nome +" foi cadastrado com sucesso<h1>");
		out.println(
				"<button><a href=http://localhost:8080/prova_Q11/lista>lista</a></button>");
		out.println("</body>");
		out.println("</html>");
	}
}
