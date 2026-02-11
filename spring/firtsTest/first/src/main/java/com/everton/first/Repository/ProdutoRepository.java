package com.everton.first.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.first.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends  JpaRepository<Produto, Long > {

}
