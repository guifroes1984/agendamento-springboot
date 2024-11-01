package br.com.guifroes1984.agenda.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PROFISSIONAL")
@PrimaryKeyJoinColumn(name = "PESSOA_ID")
public class Profissional extends Pessoa {

	private boolean ativo;
	
	@ManyToMany
	@JoinTable(name = "TBL_AREA_PROFISSIONAL", 
				joinColumns = @JoinColumn(name = "PROFISSIONAL_ID"), 
				inverseJoinColumns = @JoinColumn(name = "AREA_ID"))
	private Set<Area> areas = new HashSet<>();

	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
