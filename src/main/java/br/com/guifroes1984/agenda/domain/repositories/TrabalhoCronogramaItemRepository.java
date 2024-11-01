package br.com.guifroes1984.agenda.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guifroes1984.agenda.domain.entities.TrabalhoCronogramaItem;

public interface TrabalhoCronogramaItemRepository extends JpaRepository<TrabalhoCronogramaItem, Long> {

}
