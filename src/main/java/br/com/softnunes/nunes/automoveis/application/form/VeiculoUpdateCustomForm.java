package br.com.softnunes.nunes.automoveis.application.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VeiculoUpdateCustomForm {

    @NotBlank(message = "Cor do veículo não pode estar em vazio")
	private String cor;

    @NotBlank(message = "Nome não pode estar em branco")
	private String descricao;

    @NotNull(message = "Status do veículo não pode ser nulo")
	private boolean vendido;
    
	  @JsonFormat(pattern = "dd/MM/yyyy")
	  @NotNull(message = "Data atualização não pode ser nula")
	private LocalDate updated;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}	 
}
