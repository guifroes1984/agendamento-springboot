package br.com.guifroes1984.agenda.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.agenda.domain.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
