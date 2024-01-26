package es.jdc.prg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreguntaDAO {

	public List<Pregunta> getPreguntas() {
		List<Pregunta> preguntas = new ArrayList<>();

		String query = "SELECT * FROM Preguntas";
		try (Connection connection = ConexionDB.obtenerConexion();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					Pregunta pregunta = new Pregunta();
					pregunta.setId(resultSet.getLong("id_pregunta"));
					pregunta.setCuerpoPregunta(resultSet.getString("cuerpo_pregunta"));
					pregunta.setTemaId(resultSet.getLong("tema_id"));
					preguntas.add(pregunta);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return preguntas;
	}
	
	
}
