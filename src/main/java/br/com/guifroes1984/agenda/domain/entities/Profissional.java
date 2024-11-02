package br.com.guifroes1984.agenda.domain.entities;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany
	@JoinColumn(name = "PROFISSIONAL_ID")
	private List<TrabalhoCronogramaItem> trabalhoCronogramaItens = new ArrayList<>();
	
	@OneToMany(mappedBy = "profissional")
	private List<Compromisso> compromissos = new ArrayList<>();
	
	public void adicionaTrabalhoCronogramaItem(DayOfWeek diaDaSemana, LocalTime horarioInicio, LocalTime horarioTermino, int atendimentos, int duracaoAtendimentos) {
		TrabalhoCronogramaItem tci = new TrabalhoCronogramaItem(diaDaSemana, horarioInicio, horarioTermino, atendimentos, duracaoAtendimentos);
		trabalhoCronogramaItens.add(tci);
	}

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
