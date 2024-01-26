package es.jdc.prg;

public class Respuesta {
    private Long id;
    private Long preguntaId;
    private String cuerpoRespuesta;
    private boolean esCorrecta;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPreguntaId() {
		return preguntaId;
	}
	public void setPreguntaId(Long preguntaId) {
		this.preguntaId = preguntaId;
	}
	public String getCuerpoRespuesta() {
		return cuerpoRespuesta;
	}
	public void setCuerpoRespuesta(String cuerpoRespuesta) {
		this.cuerpoRespuesta = cuerpoRespuesta;
	}
	public boolean isEsCorrecta() {
		return esCorrecta;
	}
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}

    // Getters y Setters
    

	public String toString() {
		return cuerpoRespuesta;
	}
    
}

