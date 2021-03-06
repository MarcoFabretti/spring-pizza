package org.generation.italy.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Pizza {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //id netifica che la chiave primaria Ã¨ autoincrementale
	private Integer id;
	
	@NotNull
	private String nome;
	
	@Lob
	private String descrizione;
	
	@NotNull
	private Double prezzo;

	
	@ManyToMany 
	private List<Ingrediente> ingredienti;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
}
