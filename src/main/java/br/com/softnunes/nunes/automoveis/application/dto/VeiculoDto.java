package br.com.softnunes.nunes.automoveis.application.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.softnunes.nunes.automoveis.entity.Veiculo;

public class VeiculoDto {
	
	private long id;
	private String veiculo;
	private String marca;
	private String cor;
	private Integer ano;
	private String descricao;
	private boolean vendido;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate created;
	  @JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate updated;
	
	  public VeiculoDto() {
		  
	  }
	  
	public VeiculoDto(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.veiculo = veiculo.getVeiculo();
		this.marca = veiculo.getMarca();
		this.cor = veiculo.getCor();
		this.ano = veiculo.getAno();
		this.descricao = veiculo.getDescricao();
		this.vendido = veiculo.isVendido();
		this.created = veiculo.getCreated();
		this.updated = veiculo.getUpdated();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}
}
