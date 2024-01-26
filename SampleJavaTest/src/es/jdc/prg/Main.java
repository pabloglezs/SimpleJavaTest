package es.jdc.prg;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HttpServer server = null;

        try {
        	
        	System.out.println("ñ");
        	
            // Imprimir en consola los usuarios de la base de datos
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

            System.out.println("Usuarios en la base de datos:");
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getId());
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Contraseña: " + usuario.getContraseña());
                System.out.println("Primer Apellido: " + usuario.getPrimerApellido());
                System.out.println("Segundo Apellido: " + usuario.getSegundoApellido());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Tipo: " + usuario.getTipo());
                System.out.println("------------------------------");
            }

            // Mantener la aplicación en ejecución
            System.out.println("Presiona Enter para detener el servidor...");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                server.stop(0);
            }
        }
    }
}

