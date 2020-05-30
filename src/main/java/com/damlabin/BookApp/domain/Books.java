package com.damlabin.BookApp.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "datePublication")
	private LocalDate datePublication;

	public Books() {}

	public Books(String nom, String description, LocalDate datePublication) {
		this.nom = nom;
		this.description = description;
		this.datePublication = datePublication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDatePublication() {
		return datePublication;
	}

	public void setDatePublication(LocalDate datePublication) {
		this.datePublication = datePublication;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", nom=" + nom + ", description=" + description + ", datePublication="
				+ datePublication + "]";
	}
}
