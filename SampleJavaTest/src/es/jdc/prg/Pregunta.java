package es.jdc.prg;

public class Pregunta {
	private Long id;
	private String cuerpoPregunta;
	private Long temaId;

	// Getters y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCuerpoPregunta() {
		return cuerpoPregunta;
	}
	public void setCuerpoPregunta(String cuerpoPregunta) {
		this.cuerpoPregunta = cuerpoPregunta;
	}
	public Long getTemaId() {
		return temaId;
	}
	public void setTemaId(Long temaId) {
		this.temaId = temaId;
	}



	public String toString() {
		return this.cuerpoPregunta;
	}
}
