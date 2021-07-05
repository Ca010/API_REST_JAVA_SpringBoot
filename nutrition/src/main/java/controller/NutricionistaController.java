package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import datasource.model.Nutricionista;
import repository.NutricionistaRepository;

@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {

	@Autowired
	private NutricionistaRepository nutricionistaRepository;

	@GetMapping(path = "/nutricionista")
	public List<Nutricionista> buscarNutricionistaPorId() {

		return nutricionistaRepository.findAll();

	}
}
