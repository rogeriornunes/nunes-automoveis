package br.com.softnunes.nunes.automoveis.service;

import java.util.List;

import br.com.softnunes.nunes.automoveis.application.dto.VeiculoDto;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoForm;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoUpdateCustomForm;



public interface VeiculoService {

	List<VeiculoDto> findAll();

	List<VeiculoDto> findAll(String marcar, long ano, String cor);
	
	VeiculoDto find(long id);

	VeiculoDto save(VeiculoForm veiculo);

	void delete(long id);

	VeiculoDto update(VeiculoForm veiculoForm, long id);
	
	VeiculoDto updateCustomer(VeiculoUpdateCustomForm veiculoCustomForm, long id);
}
