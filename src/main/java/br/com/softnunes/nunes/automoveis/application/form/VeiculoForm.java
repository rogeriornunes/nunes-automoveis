package br.com.softnunes.nunes.automoveis.application.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VeiculoForm {

    @NotBlank(message = "Nome do veículo não pode estar vazio")
	private String veiculo;

    @NotBlank(message = "Marca do veículo não pode estar vazio")
	private String marca;

    @NotBlank(message = "Cor do veículo não pode estar em vazio")
	private String cor;

    @NotNull(message = "Ano do veículo não pode ser nulo")
	private Integer ano;

    @NotBlank(message = "Nome não pode estar em branco")
	private String descricao;

    @NotNull(message = "Status do veículo não pode ser nulo")
	private boolean vendido;
    
    @NotNull(message = "Data de criação não pode ser nula")
	  @JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate created;
    
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  @NotNull(message = "Data atualização não pode ser nula")
	private LocalDate updated;	

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
