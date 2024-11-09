package br.com.guifroes1984.agenda.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.guifroes1984.agenda.domain.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value = "SELECT * FROM TBL_CLIENTE  AS C JOIN TBL_PESSOA AS P ON C.PESSOA_ID = P.ID", nativeQuery = true)
	public List<Cliente> buscarTodos();
	
	
	@Query(value = "SELECT * FROM TBL_CLIENTE  AS C JOIN TBL_PESSOA AS P ON C.PESSOA_ID = P.ID WHERE UPPER(P.NOME) LIKE %:nome%", nativeQuery = true)
	public List<Cliente> buscarTodos(@Param("nome") String nome);
	
}
