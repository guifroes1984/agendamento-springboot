package br.com.guifroes1984.agenda.domain.entities;

import java.time.DayOfWeek;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_TRABALHO_CRONOGRAMA_ITEM")
public class TrabalhoCronogramaItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private DayOfWeek diaDaSemana; // dayOfWeek

	private LocalTime horarioInicio; // startTime

	private LocalTime horarioTermino; // endTime

	private Integer atendimentos; // slots

	private Integer duracaoAtendimentos; // slotSize

	public TrabalhoCronogramaItem() {
	}

	public TrabalhoCronogramaItem(DayOfWeek diaDaSemana, LocalTime horarioInicio, LocalTime horarioTermino,
			Integer atendimentos, Integer duracaoAtendimentos) {
		super();
		this.diaDaSemana = diaDaSemana;
		this.horarioInicio = horarioInicio;
		this.horarioTermino = horarioTermino;
		this.atendimentos = atendimentos;
		this.duracaoAtendimentos = duracaoAtendimentos;
	}

	public Integer getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(Integer atendimentos) {
		this.atendimentos = atendimentos;
	}

	public Integer getDuracaoAtendimento() {
		return duracaoAtendimentos;
	}

	public void setDuracaoAtendimento(Integer duracaoAtendimento) {
		this.duracaoAtendimentos = duracaoAtendimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DayOfWeek getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(DayOfWeek diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public LocalTime getHorarioTermino() {
		return horarioTermino;
	}

	public void setHorarioTermino(LocalTime horarioTermino) {
		this.horarioTermino = horarioTermino;
	}

}
