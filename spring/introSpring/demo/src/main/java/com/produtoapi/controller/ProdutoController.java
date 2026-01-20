package com.produtoapi.controller;
import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos") // URL BASE
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @GetMapping //GET (READ)
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }
    @PostMapping //POST (CREATE)
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
    @PutMapping("/{id}") //PUT (UPDATE)
    public Produto atualizar(@PathVariable Long id, @RequestBody
    Produto produto) {
        return produtoService.atualizar(id, produto);
    }
    @DeleteMapping("/{id}")//DELETE (DELETE)
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }
    @GetMapping("/{id}")//GET (READ)
    public Optional<Produto> findById(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @PostMapping("/salvarLista")
    public List<Produto> salvarLista(@RequestBody List<Produto>
                                             produtos) {
        return produtoService.salvarLista(produtos);
    }
}