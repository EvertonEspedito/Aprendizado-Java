package com.everton.first.service;

import com.everton.first.model.Produto;
import com.everton.first.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //Listar todos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
    //Buscar por id
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    //Salvar produto
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    //Deletar
    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}
