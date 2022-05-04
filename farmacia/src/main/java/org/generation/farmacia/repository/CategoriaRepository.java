package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByNomeCategoriaContainingIgnoreCase(@Param("nomeCategoria") String categoria);

}
