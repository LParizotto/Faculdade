package br.com.unipar.exemplo.controller

import br.com.unipar.exemplo.database.PessoaRepository
import br.com.unipar.exemplo.model.Pessoa
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

//a anotação RestController não pode usar VIEW, para construir APIs
//a anotação Controller permite ter VIEW, para construir Web Applications
@RestController
@RequestMapping("/pessoa")
class PessoaController (
    private val pessoaRepository: PessoaRepository
    /**
     * uma injecao de dependencia e necessaria quando usamos uma classe externa,
     * essa injecao (variavel) deve ser privada, por uma questao de seguranca
     * */
){
    @PostMapping
    fun cadastrasPessoa(@RequestBody pessoa: Pessoa)
    : ResponseEntity<Pessoa> {
        return ResponseEntity.ok(
            pessoaRepository.save(pessoa))
    }
    @GetMapping
    fun listarPessoa(): List<Pessoa>{
        return pessoaRepository.findAll()
    }

}