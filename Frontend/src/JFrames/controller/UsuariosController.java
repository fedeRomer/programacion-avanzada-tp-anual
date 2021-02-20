package JFrames.controller;

import java.awt.event.ActionEvent;

import com.bll.UsuarioBLL;
import com.dao.daoFactories.UsuarioDAOFactory;
import com.dao.daoInterfaces.UsuarioDAO;
import com.domain.Usuario;

import JFrames.pantallas.login.Loginprincipal;

public class UsuariosController {

	private Loginprincipal viewLogin;
	private UsuarioDAO usuarioDAO;

	public void runLogin() {
		// modify para ejecutar pantalla login
		viewLogin = new Loginprincipal();
		viewLogin.setVisible(true);
		usuarioDAO = UsuarioDAOFactory.getUsuarioDAOimpl();
	}

	public void actionListener(ActionEvent o) {

		UsuarioBLL userBLL = new UsuarioBLL();

		// de acuerdo con el action event a designar:
		// 1) login
		// 2) registrar

		switch (o.getActionCommand()) {
		case "Login":
			// generar pantalla login
			// obtener string user, string password
			String user = "";
			String password = "";

			Usuario usuario = usuarioDAO.getUsuario(user, password);

			if (usuario.getTipoUser() != null) {
				/*
				 * verificamos que el usuario existe ya que deberia popular el campo tipo de
				 * usuario, que solo se obtiene de la db
				 */
				// se popula el usuario y se procede con login
			} else {
				// error usuario no existe
			}
			break;

		case "Registro":
			// generar pantalla registro
			// obtener:
			/*
			 * user password tipoUser
			 */
			String userRegistro = "";
			String passwordRegistro = "";
			String tipoUserRegistro = "";

			Usuario newUserRegistro = new Usuario();

			newUserRegistro.setUsername(userRegistro);
			newUserRegistro.setPassword(passwordRegistro);
			newUserRegistro.setTipoUser(tipoUserRegistro);

			Boolean flag = usuarioDAO.addUsuario(newUserRegistro);

			if (flag.equals(true)) {
				// registro exitoso
			} else {
				// registro fail
			}
			break;
		}
	}

}
