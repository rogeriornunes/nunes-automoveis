package br.com.softnunes.nunes.automoveis.application.convert;

import java.util.List;
import java.util.stream.Collectors;

import br.com.softnunes.nunes.automoveis.application.dto.VeiculoDto;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoForm;
import br.com.softnunes.nunes.automoveis.entity.Veiculo;

public class VeiculoConverter {

	
	public static Veiculo convertToVeiculo(VeiculoForm veiculoForm) {
		Veiculo veiculo = new Veiculo();
		veiculo.setVeiculo(veiculoForm.getVeiculo());
		veiculo.setMarca(veiculoForm.getMarca());
		veiculo.setCor(veiculoForm.getCor());
		veiculo.setAno(veiculoForm.getAno());
		veiculo.setDescricao(veiculoForm.getDescricao());
		veiculo.setVendido(veiculoForm.isVendido());
		veiculo.setCreated(veiculoForm.getCreated());
		veiculo.setUpdated(veiculoForm.getUpdated());
		return veiculo;
	}
	
	public static VeiculoDto convertToDto(Veiculo veiculo) {
		VeiculoDto veiculoDto = new VeiculoDto();
		veiculoDto.setId(veiculo.getId());
		veiculoDto.setVeiculo(veiculo.getVeiculo());
		veiculoDto.setMarca(veiculo.getMarca());
		veiculoDto.setCor(veiculo.getCor());
		veiculoDto.setAno(veiculo.getAno());
		veiculoDto.setDescricao(veiculo.getDescricao());
		veiculoDto.setVendido(veiculo.isVendido());
		veiculoDto.setCreated(veiculo.getCreated());
		veiculoDto.setUpdated(veiculo.getUpdated());
		return veiculoDto;
	}
	
	 public static List<VeiculoDto> convertListToDto(List<Veiculo> veiculo) {
	        return veiculo.stream().map(VeiculoDto::new).collect(Collectors.toList());
	    }
}
