package br.com.softnunes.nunes.automoveis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softnunes.nunes.automoveis.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	Optional<Veiculo> findById(long id);
}
