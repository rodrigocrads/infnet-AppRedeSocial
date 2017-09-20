package dao;

import negocio.Usuario;

public class UsuarioDAO {
	
	public static boolean validar(Usuario u) {
		return ( "ze".equals(u.getLogin()) && "ze".equals(u.getSenha()) );
	}
	
}
