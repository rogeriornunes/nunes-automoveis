package br.com.softnunes.nunes.automoveis.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.softnunes.nunes.automoveis.application.dto.VeiculoDto;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoForm;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoUpdateCustomForm;
import br.com.softnunes.nunes.automoveis.service.VeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/veiculos")
@Api(value = "API Rest Veículos")
@CrossOrigin(origins = "*")
public class VeiculoApi {

	@Autowired
	VeiculoService veiculoService;

	@GetMapping
	@ApiOperation(value = "Retorna todos os veículos")
	public List<VeiculoDto> allVeiculos() {
		return veiculoService.findAll();
	}

	@GetMapping("/marca/{marca}/ano/{ano}/cor/{cor}")
	@ApiOperation(value = "Retorna todos os veículos de acordo com os parâmetros passados")
	public List<VeiculoDto> allVeiculos(@PathVariable(value = "marca") String marca,
					@PathVariable(value = "ano") long ano,
					@PathVariable(value = "cor") String cor) {
		return veiculoService.findAll(marca, ano, cor);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "Retorna os detalhes do veículo")
	public VeiculoDto findById(@PathVariable(value = "id") long id) {
		return veiculoService.find(id);
	}

	@PostMapping
	@ApiOperation(value = "Adiciona um novo veículo")
	public VeiculoDto save(@RequestBody @Valid VeiculoForm veiculoForm) {
		return veiculoService.save(veiculoForm);
	}

	@PutMapping("/{id}")
	@ApiOperation(value = "Atualiza os dados de um veículo")
	public VeiculoDto update(@RequestBody VeiculoForm veiculoForm, @PathVariable(value = "id") long id) {
		return veiculoService.update(veiculoForm, id);
	}

	@PatchMapping("/{id}")
	@ApiOperation(value = "Atualiza apenas alguns dados do veículo")
	public VeiculoDto updateCustomer(@RequestBody VeiculoUpdateCustomForm veiculoCustomForm, @PathVariable(value = "id") long id) {
		return veiculoService.updateCustomer(veiculoCustomForm, id);
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Apaga o veículo")
	public void delete(@PathVariable(value = "id") long id) {
		veiculoService.delete(id);
	}
}
