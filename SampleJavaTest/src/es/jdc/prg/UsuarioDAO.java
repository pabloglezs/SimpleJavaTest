package es.jdc.prg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

	private static final String SELECT_USUARIOS = "SELECT * FROM Usuarios";

	public List<Usuario> obtenerUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();

		try (Connection connection = ConexionDB.obtenerConexion();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USUARIOS);
				ResultSet resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getLong("id"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setContraseña(resultSet.getString("contraseña"));
				usuario.setPrimerApellido(resultSet.getString("primer_apellido"));
				usuario.setSegundoApellido(resultSet.getString("segundo_apellido"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setTipo(resultSet.getInt("tipo"));

				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuarios;
	}




	public Usuario getUsuario(String userName) {

		String query = " SELECT * FROM Usuarios WHERE email = ? ";
		Usuario usuario = null;

		try (Connection connection = ConexionDB.obtenerConexion()){
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				usuario = new Usuario();
				usuario.setId(resultSet.getLong("id"));
				usuario.setNombre(resultSet.getString("nombre"));
				usuario.setContraseña(resultSet.getString("contraseña"));
				usuario.setPrimerApellido(resultSet.getString("primer_apellido"));
				usuario.setSegundoApellido(resultSet.getString("segundo_apellido"));
				usuario.setEmail(resultSet.getString("email"));
				usuario.setTipo(resultSet.getInt("tipo"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}
}
