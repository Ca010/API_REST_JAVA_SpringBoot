package service;

import org.springframework.beans.factory.annotation.Autowired;

import datasource.model.Nutricionista;
import repository.NutricionistaRepository;

public class CadastroNutricionista {
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	public void cadastro(Nutricionista nutricionista) {
	nutricionistaRepository.saveAndFlush(nutricionista);		
	}

}
			