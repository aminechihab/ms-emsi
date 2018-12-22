package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsEmsiApplication implements CommandLineRunner {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsEmsiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		
		
		Formation f1 = formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2 = formationRepository.save(new Formation(null,"Java",30,null));
		Formation f3 = formationRepository.save(new Formation(null,"C#",30,null));

		etudiantRepository.save(new Etudiant(null,"Hassan","Hassan", new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Mohamed","Mohamed", new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Hanane","Hanane", new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Fatima","Fatima", new Date(),f3));
	}
}
