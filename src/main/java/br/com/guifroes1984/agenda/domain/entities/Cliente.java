package br.com.guifroes1984.agenda.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_CLIENTE")
@PrimaryKeyJoinColumn(name = "PESSOA_ID")
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private LocalDate dataDeNascimento;

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
