package br.com.studylist.factory;

import br.com.studylist.dao.UsuarioDao;

public class DAOFactory {
	public static UsuarioDao getUsuarioDao( ) {
		return new UsuarioDao();
	}
}
