package interfaces;

import model.TblUsuariocl3;

public interface IUsuario {

	//registramos crud
	public void ValidarUsuario (TblUsuariocl3 usuario);
	boolean UsuarioValido(String nombre, String contrasena);
}
