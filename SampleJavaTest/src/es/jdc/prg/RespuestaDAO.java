package es.jdc.prg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RespuestaDAO {

    public List<Respuesta> obtenerRespuestasPorPregunta(Long preguntaId) {
        List<Respuesta> respuestas = new ArrayList<>();

        String query = "SELECT * FROM Respuestas WHERE id_pregunta = ?";
        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setLong(1, preguntaId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Respuesta respuesta = new Respuesta();
                    respuesta.setId(resultSet.getLong("id_respuesta"));
                    respuesta.setPreguntaId(resultSet.getLong("id_pregunta"));
                    respuesta.setCuerpoRespuesta(resultSet.getString("cuerpo_respuesta"));
                    respuesta.setEsCorrecta(resultSet.getBoolean("es_correcta"));
                    respuestas.add(respuesta);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return respuestas;
    }
}
