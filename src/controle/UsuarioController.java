package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Usuario;
import dao.UsuarioDAO;

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Usuario usuario;

	public UsuarioController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		switch (request.getParameter("tela")) {
			case "cadastro":
				String tipoCurso = request.getParameter("tipoCurso");
				usuario.setTipoCurso(tipoCurso);
				request.getRequestDispatcher("complemento.html").
					forward(request, response);
			break;
			case "complemento":
				out.println("<html><head><title>Tela Principal</title></head><body>"
						+ "<h2>Usuário "+ usuario.getLogin() +" cadastrado!</h2>"
						+ "<form action='principal.html' method='get'>"
						+ "<input type='submit' value='Voltar'><hr>"
						+ "</form></body></html>");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		usuario = new Usuario(login, senha);

		if (UsuarioDAO.validar(usuario)) {
			request.getRequestDispatcher("cadastro.html").forward(request, response);
		} else {
			out.println("<html>" + "<head>" + "<title>Tela Principal</title>" + "</head>" + "<body>"
					+ "<h2>Usuário não cadastrado!</h2>" + "<form action='principal.html' method='get'>"
					+ "<input type='submit' value='Voltar'>" + "<hr>" + "</body>" + "</html>");

		}
	}

}
