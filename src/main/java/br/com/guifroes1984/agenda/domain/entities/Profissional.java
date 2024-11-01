package br.com.guifroes1984.agenda.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PROFISSIONAL")
@PrimaryKeyJoinColumn(name = "PESSOA_ID")
public class Profissional extends Pessoa {

	private boolean ativo;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
