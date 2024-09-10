package br.com.studylist.servlet;

import java.io.IOException;

import br.com.studylist.dao.UsuarioDao;
import br.com.studylist.factory.DAOFactory;
import br.com.studylist.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/usuarios")
public class FormServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	public FormServlet() {}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("0.0.1 - servlet form");
		
		UsuarioDao usuarioDao = DAOFactory.getUsuarioDao();
		
		req.setAttribute("usuarios", usuarioDao.listar());
		
		System.out.println("0.0.2 - buscou usuarios no banco de dados");
		
		req.getRequestDispatcher("form.jsp").forward(req, resp);

	}
	
	

}

