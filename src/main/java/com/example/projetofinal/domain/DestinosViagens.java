package com.example.projetofinal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DestinosViagens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String localDestino;
	
	private String paisDestino;
	
	private float valorViagem;
	
	public DestinosViagens() {
		
	}
	
	public DestinosViagens(Long id, String localDestino, String paisDestino, float valorViagem) {
		super();
		this.setId(id);
		this.setLocalDestino(localDestino);
		this.setPaisDestino(paisDestino);
		this.setValorViagem(valorViagem);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public float getValorViagem() {
		return valorViagem;
	}

	public void setValorViagem(float valorViagem) {
		this.valorViagem = valorViagem;
	}
}
