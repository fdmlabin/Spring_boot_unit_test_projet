package com.damlabin.BookApp.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="authors")
public class Authors {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "tel")
	private Integer tel;
	
	@Column(name = "birthdate")
	private LocalDate birthdate;

	public Authors() {
		super();
	}

	public Authors(String nom, Integer tel, LocalDate birthdate) {
		this.nom = nom;
		this.tel = tel;
		this.birthdate = birthdate;
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

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Authors [id=" + id + ", nom=" + nom + ", tel=" + tel + ", birthdate=" + birthdate + "]";
	}
}
