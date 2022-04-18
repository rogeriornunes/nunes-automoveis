package br.com.softnunes.nunes.automoveis.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.softnunes.nunes.automoveis.application.form.VeiculoForm;
import br.com.softnunes.nunes.automoveis.application.form.VeiculoUpdateCustomForm;

@Entity
@Table(name = "TB_VEICULO")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @JsonIgnore
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	private long id;

	@NotNull
	private String veiculo;

	@NotNull
	private String marca;
	
	@NotNull
	private String cor;

	@NotNull
	private Integer ano;

	@NotNull
	private String descricao;

	@NotNull
	private boolean vendido;

	@NotNull
	private LocalDate created;

	@NotNull
	private LocalDate updated;

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
	
	public void atualizar(VeiculoForm veiculoForm) {
		this.veiculo = veiculoForm.getVeiculo();
		this.marca = veiculoForm.getMarca();
		this.cor = veiculoForm.getCor();
		this.descricao = veiculoForm.getDescricao();
		this.vendido = veiculoForm.isVendido();
		this.created = veiculoForm.getCreated();
		this.updated = veiculoForm.getUpdated();
	}
	
	public void atualizarCustom(VeiculoUpdateCustomForm veiculoCustomForm) {
		this.cor = veiculoCustomForm.getCor();
		this.descricao = veiculoCustomForm.getDescricao();
		this.updated = veiculoCustomForm.getUpdated();
		this.vendido = veiculoCustomForm.isVendido();
	}
}
