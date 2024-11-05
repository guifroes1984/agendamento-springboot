package br.com.guifroes1984.agenda.domain.services.exceptions;

public class DataBaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataBaseException(String message) {
		super(message);
	}

}
