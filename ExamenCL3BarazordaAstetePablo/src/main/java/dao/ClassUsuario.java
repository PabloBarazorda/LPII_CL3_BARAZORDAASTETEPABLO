package dao;

import interfaces.IUsuario;
import model.TblUsuariocl3;

public class ClassUsuario implements IUsuario {

	@Override
	public void ValidarUsuario(TblUsuariocl3 usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean UsuarioValido(String nombre, String contrasena) {
		if (nombre.equals("admin") && contrasena.equals("12345")) {
            return true;
        } else {
            return false;
        }
	}

} // fin de la clase usuario
