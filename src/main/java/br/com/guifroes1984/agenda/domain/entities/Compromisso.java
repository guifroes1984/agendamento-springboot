package br.com.guifroes1984.agenda.domain.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_COMPROMISSO")
public class Compromisso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
	private LocalDate data;

	@Column(columnDefinition = "TIME WITH TIME ZONE")
	private LocalTime horarioInicio;

	@Column(columnDefinition = "TIME WITH TIME ZONE")
	private LocalTime horarioTermino;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private CompromissoStatus status = CompromissoStatus.ABERTO;

	@Column(length = 1024)
	private String comentarios;

	@ManyToOne
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "PROFISSIONAL_ID")
	private Profissional profissional;

	@ManyToOne
	@JoinColumn(name = "AREA_ID")
	private Area area;

	@ManyToOne
	@JoinColumn(name = "COMPROMISSO_TIPO_ID")
	private CompromissoTipo compromissoTipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
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

	public CompromissoStatus getStatus() {
		return status;
	}

	public void setStatus(CompromissoStatus status) {
		this.status = status;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public CompromissoTipo getCompromissoTipo() {
		return compromissoTipo;
	}

	public void setCompromissoTipo(CompromissoTipo compromissoTipo) {
		this.compromissoTipo = compromissoTipo;
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
		Compromisso other = (Compromisso) obj;
		return Objects.equals(id, other.id);
	}

}
