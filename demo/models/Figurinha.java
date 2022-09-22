package figurinhas.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Figurinha {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nomeJogador;
	private String selecaoJogador;
	private Long idDono;
	
	
	public Figurinha(Long id, String nomeJogador, String selecaoJogador, Long idDono) {
		super();
		this.id = id;
		this.nomeJogador = nomeJogador;
		this.selecaoJogador = selecaoJogador;
		this.idDono = idDono;
	}

	public Figurinha() {
		super();
	}


	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public String getSelecaoJogador() {
		return selecaoJogador;
	}
	public void setSelecaoJogador(String selecaoJogador) {
		this.selecaoJogador = selecaoJogador;
	}
	public Long getIdDono() {
		return idDono;
	}
	public void setIdDono(Long idDono) {
		this.idDono = idDono;
	}
	
	
}
