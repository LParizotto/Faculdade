package br.com.unipar.exemplo.database

import br.com.unipar.exemplo.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository

interface PessoaRepository : JpaRepository<Pessoa, Long>{
}