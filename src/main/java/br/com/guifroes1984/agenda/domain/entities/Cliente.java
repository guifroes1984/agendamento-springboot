package br.com.guifroes1984.agenda.domain.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CLIENTE")
@PrimaryKeyJoinColumn(name = "PESSOA_ID")
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;

	private LocalDate dataDeNascimento;

	@OneToMany(mappedBy = "cliente")
	private List<Compromisso> compromissos = new ArrayList<>();

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(List<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}

	@Override
	public String toString() {
		return " Cliente [dataDeNascimento=" + dataDeNascimento + " " + super.toString() + "]";
	}

}
