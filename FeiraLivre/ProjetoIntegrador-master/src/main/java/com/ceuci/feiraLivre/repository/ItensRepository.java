package com.ceuci.feiraLivre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceuci.feiraLivre.model.ItensModel;

public interface ItensRepository extends JpaRepository<ItensModel, Long> {

}
