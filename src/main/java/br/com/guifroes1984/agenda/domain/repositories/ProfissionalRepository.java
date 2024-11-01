package br.com.guifroes1984.agenda.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.agenda.domain.entities.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {

}
