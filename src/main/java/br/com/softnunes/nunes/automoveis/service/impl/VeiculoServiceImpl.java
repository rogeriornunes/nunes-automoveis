package br.com.softnunes.nunes.automoveis.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softnunes.nunes.automoveis.application.convert.VeiculoConverter;
import br.com.softnunes.nunes.automoveis.application.dto.VeiculoDto;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoForm;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoUpdateCustomForm;
import br.com.softnunes.nunes.automoveis.entity.Veiculo;
import br.com.softnunes.nunes.automoveis.repository.VeiculoRepository;
import br.com.softnunes.nunes.automoveis.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService {

	@Autowired
	VeiculoRepository veiculoRepository;

	@Override
	public List<VeiculoDto> findAll() {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		return VeiculoConverter.convertListToDto(veiculos);
	}

	@Override
	public List<VeiculoDto> findAll(String marcar, long ano, String cor) {
		List<Veiculo> veiculos = veiculoRepository.findAll();
		return VeiculoConverter.convertListToDto(filtrar(marcar, ano, cor, veiculos));
	}

	private List<Veiculo> filtrar(String marcar, long ano, String cor, List<Veiculo> veiculos) {
		return veiculos.stream().filter(filter -> filter.getMarca().equalsIgnoreCase(marcar)
						&& filter.getAno() == ano && filter.getCor().equalsIgnoreCase(cor))
						.collect(Collectors.toList());
	}

	@Override
	public VeiculoDto find(long id) {
		Optional<Veiculo> optional = veiculoRepository.findById(id);
		if (optional.isPresent()) {
			return VeiculoConverter.convertToDto(optional.get());
		}
		return null;
	}

	@Override
	public VeiculoDto save(VeiculoForm veiculoForm) {
		Veiculo veiculo = VeiculoConverter.convertToVeiculo(veiculoForm);
		veiculo = veiculoRepository.save(veiculo);
		return VeiculoConverter.convertToDto(veiculo);
	}

	@Override
	public void delete(long id) {
		if (veiculoRepository.existsById(id)) {
			veiculoRepository.deleteById(id);
		}
	}

	@Override
	public VeiculoDto update(VeiculoForm veiculoForm, long id) {
		Optional<Veiculo> optional = veiculoRepository.findById(id);
		if (optional.isPresent()) {
			Veiculo veiculo = optional.get();
			veiculo.atualizar(veiculoForm);
			return VeiculoConverter.convertToDto(veiculo);
		}
		return null;
	}

	@Override
	public VeiculoDto updateCustomer(VeiculoUpdateCustomForm veiculoCustomForm, long id) {
		Optional<Veiculo> optional = veiculoRepository.findById(id);
		if (optional.isPresent()) {
			Veiculo veiculo = optional.get();
			veiculo.atualizarCustom(veiculoCustomForm);
			veiculoRepository.save(veiculo);
			return VeiculoConverter.convertToDto(veiculo);
		}
		return null;
	}
}
