// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int = 1)

data class Modulo(val nome: String, val cursos: List<ConteudoEducacional>)

data class Formacao(val nome: String, val nivel: Nivel, val duracao: Int, val conteudos: List<Modulo>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val modulo = Modulo(
        nome = "Aprendendo Kotlin na Prática em Sua Documentação Oficial",
        cursos = listOf(
            ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", Nivel.BASICO),
            ConteudoEducacional("Introdução Prática à Linguagem de Programação Kotlin", Nivel.BASICO, 2),
            ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", Nivel.BASICO, 2),
            ConteudoEducacional("POO e Tipos de Classes na Prática com Kotlin", Nivel.BASICO, 2),
            ConteudoEducacional("O Poder das Funções em Kotlin", Nivel.BASICO, 2),
            ConteudoEducacional("Tratamento de Exceções em Kotlin", Nivel.INTERMEDIARIO, 2),
            ConteudoEducacional("Abstraindo Formações da DIO Usando POO com Kotlin", Nivel.BASICO, 2)
        )
    )

    val formacao = Formacao(
        nome = "Desenvolvimento Backend com Kotlin", nivel = Nivel.BASICO, duracao = 52,
        conteudos = listOf(modulo)
    )

    formacao.matricular(Usuario("AlunoA"))
    formacao.matricular(Usuario("AlunoB"))
    formacao.matricular(Usuario("AlunoC"))

    println(formacao)
}
