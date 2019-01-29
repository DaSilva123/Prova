package prova_Q09;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

@WebServlet(urlPatterns = "/farmacia")
public class Farmacia extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();

		String nome = req.getParameter("nome");

		Banco banco = new Banco();
		
		Medicamento e1 = new Medicamento();
				e1.setNome("dipirona");
				e1.setSintomaIndicado("dor");
				e1.setValorMedicamento("10.00");

				List<Medicamento> listab = banco.getMedicamentos();
				listab.add(e1);
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		for (Medicamento medicamento : listab) {
			if (medicamento.getNome().contains(nome)) {
				out.println("<h1>O medicamento " + nome + " serve para " + medicamento.getSintomaIndicado() + " e custa R$"
						+ medicamento.getValorMedicamento() + "</h1>");
				out.println("</body>");
				out.println("</html>");
				return;
			}else {
				out.println("<h1>medicamento não encontrado</h1>");
				out.println("</body>");
				out.println("</html>");
				return;
				
			}

		}
		

	}

}
