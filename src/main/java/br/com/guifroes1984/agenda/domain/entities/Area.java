package br.com.guifroes1984.agenda.domain.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_AREA")
public class Area implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@ManyToMany
	@JoinTable(name = "TBL_AREA_PROFISSIONAL", 
				joinColumns = @JoinColumn(name = "AREA_ID"), 
				inverseJoinColumns = @JoinColumn(name = "PROFISSIONAL_ID"))
	private Set<Profissional> profissionais = new HashSet<>();
	
	@OneToMany(mappedBy = "area")
	private List<Compromisso> compromissos = new ArrayList<>();

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

	public Set<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(Set<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		return Objects.equals(id, other.id);
	}

}
