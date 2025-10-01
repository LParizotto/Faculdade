import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet

// Classe Pessoa
data class Pessoa(
    val id: Int,
    val nome: String,
    val idade: Int
)

// Classe para lidar com banco de dados
object Database {
    private const val URL = "jdbc:postgresql://localhost:5432/trabalhoavaliativo" // troque pelo nome do seu banco
    private const val USER = "postgres"
    private const val PASSWORD = "postgres"

    // Criar conexão
    fun getConnection(): Connection {
        return DriverManager.getConnection(URL, USER, PASSWORD)
    }
}

// Função que busca pessoa(s) pelo nome
fun buscarPessoasPorNome(parteNome: String): List<Pessoa> {
    val pessoas = mutableListOf<Pessoa>()
    val sql = "SELECT id, nome, idade FROM pessoas WHERE nome LIKE ?" // tabela "pessoas"

    Database.getConnection().use { conn ->
        val stmt: PreparedStatement = conn.prepareStatement(sql)
        stmt.setString(1, "%$parteNome%")
        val rs: ResultSet = stmt.executeQuery()

        while (rs.next()) {
            val pessoa = Pessoa(
                id = rs.getInt("id"),
                nome = rs.getString("nome"),
                idade = rs.getInt("idade")
            )
            pessoas.add(pessoa)
        }
    }

    return pessoas
}

// MAIN para testar
fun main() {
    println("Digite o nome (ou parte dele) para buscar:")
    val entrada = readln()

    val resultado = buscarPessoasPorNome(entrada)

    if (resultado.isEmpty()) {
        println("Nenhuma pessoa encontrada com '$entrada'")
    } else {
        println("Pessoas encontradas:")
        resultado.forEach {
            println("ID: ${it.id}, Nome: ${it.nome}, Idade: ${it.idade}")
        }
    }
}