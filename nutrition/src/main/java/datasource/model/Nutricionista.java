package datasource.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nutricionista")
public class Nutricionista implements Serializable {

	private static final long serialVersionUID = -7482206891690801087L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private LocalDate idade;

	@Column(name = "codigoRegistro")
	private String codigoRegistro;

	@Column(name = "idPaciente")
	private Long idPaciente;

	public Nutricionista(Long id, String nome, LocalDate idade, String codigoRegistro, Long idPaciente) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.codigoRegistro = codigoRegistro;
		this.idPaciente = idPaciente;
	}

	
	public Nutricionista() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getIdade() {
		return idade;
	}

	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

}
