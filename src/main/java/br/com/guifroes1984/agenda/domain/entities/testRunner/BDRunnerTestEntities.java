package br.com.guifroes1984.agenda.domain.entities.testRunner;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.guifroes1984.agenda.domain.entities.Area;
import br.com.guifroes1984.agenda.domain.entities.Cliente;
import br.com.guifroes1984.agenda.domain.entities.Compromisso;
import br.com.guifroes1984.agenda.domain.entities.CompromissoTipo;
import br.com.guifroes1984.agenda.domain.entities.Profissional;
import br.com.guifroes1984.agenda.domain.repositories.AreaRepository;
import br.com.guifroes1984.agenda.domain.repositories.ClienteRepository;
import br.com.guifroes1984.agenda.domain.repositories.CompromissoRepository;
import br.com.guifroes1984.agenda.domain.repositories.CompromissoTipoRepository;
import br.com.guifroes1984.agenda.domain.repositories.ProfissionalRepository;

@Component
@Profile("runner")
public class BDRunnerTestEntities implements ApplicationRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@Autowired
	private AreaRepository areaRepository;
	
	@Autowired
	private CompromissoTipoRepository compromissoTipoRepository;
	
	@Autowired
	private CompromissoRepository compromissoRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Cliente c1 = clienteRepository.findById(1L).get();
		System.out.println(c1);
		
		Profissional p1 = profissionalRepository.findById(4L).get();
		System.out.println(p1);
		
		Area a1 = areaRepository.findById(1).get();
		System.out.println(a1);
		
		CompromissoTipo ct1 = compromissoTipoRepository.findById(1).get();
		System.out.println(ct1);
		
		Compromisso compromisso = new Compromisso();
		compromisso.setCliente(c1);
		compromisso.setProfissional(p1);
		compromisso.setArea(a1);
		compromisso.setCompromissoTipo(ct1);
		compromisso.setData(LocalDate.now());
		compromisso.setHorarioInicio(LocalTime.parse("08:00:00"));
		compromisso.setHorarioTermino(LocalTime.parse("08:00:00"));
		compromisso.setComentarios("Teste do runner");
		
		compromissoRepository.save(compromisso);
		
	}

}
