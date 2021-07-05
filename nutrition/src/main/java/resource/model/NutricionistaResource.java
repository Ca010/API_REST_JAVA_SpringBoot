package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	
	@JsonProperty("nome_nutricionista")
	private String nome;
	
	@JsonProperty("idPaciente")
	private String idPaciente;
	
	public NutricionistaResource(String nome, String idPaciente) {
		super();
		this.nome = nome;
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	
}
