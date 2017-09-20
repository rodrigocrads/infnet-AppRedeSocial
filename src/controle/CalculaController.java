package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Usuario;


public class CalculaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	List <Usuario> list;

    public CalculaController() {
        super();
        list = new ArrayList<Usuario>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("usuarios", list);
		request.getRequestDispatcher("calcula.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int anoNascimento = Integer.valueOf(request.getParameter("anoNascimento"));
		float salario = Float.valueOf(request.getParameter("salario"));
		int mesesTrabalhados = Integer.valueOf(request.getParameter("mesesTrabalhados"));
		
		Usuario u = new Usuario();
		u.setNome(nome);
		u.setAnoNascimento(anoNascimento);
		u.setSalario(salario);
		u.setMesesTrabalhados(mesesTrabalhados);
		
		this.list.add(u);
		
		request.setAttribute("usuario", u);
		request.getRequestDispatcher("mensagem.jsp").forward(request, response);
	}
	
}
