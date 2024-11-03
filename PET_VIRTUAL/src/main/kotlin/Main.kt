var nome = "Ursula do Victor"
var fome = 0
var felicidade = 10
var cansaço = 0
var idade = 0

fun main() {
    var opcao: Int
    do {
        println("\nO que você quer fazer com a $nome?")
        println("1. Alimentar")
        println("2. Brincar")
        println("3. Verificar status")
        println("4. Descansar")
        println("5. Passar o tempo")
        println("6. Sair")

        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> {
                println("Quanto de comida quer dar? (Cuidado para não exagerar!)")
                val quantidade = readLine()?.toIntOrNull() ?: 0
                alimentar(quantidade)
            }
            2 -> {
                println("Quanto tempo quer brincar com a $nome? (Ela adora brincar!)")
                val quantidade = readLine()?.toIntOrNull() ?: 0
                brincar(quantidade)
            }
            3 -> verificarStatus()
            4 -> {
                println("Quanto tempo você quer que a $nome descanse? (Um cochilo faz bem!)")
                val quantidade = readLine()?.toIntOrNull() ?: 0
                descansar(quantidade)
            }
            5 -> passarTempo()
            6 -> println("Até a próxima! A $nome já está com saudades!")
            else -> println("Ops! Escolha uma opção válida.")
        }
    } while (opcao != 6)
}

fun alimentar(quantidade: Int) {
    fome -= quantidade
    if (fome < 0) fome = 0
    println("Delícia! A $nome adorou a refeição! Fome agora: $fome")
}

fun brincar(quantidade: Int) {
    felicidade += quantidade
    cansaço += quantidade
    println("Que diversão! A $nome está super feliz! Felicidade: $felicidade, Cansaço: $cansaço")
}

fun verificarStatus() {
    println("Status da $nome:")
    println("Nome: $nome")
    println("Fome: $fome")
    println("Felicidade: $felicidade")
    println("Cansaço: $cansaço")
    println("Idade: $idade")
}

fun descansar(quantidade: Int) {
    cansaço -= quantidade
    if (cansaço < 0) cansaço = 0
    println("A $nome tirou uma soneca revigorante! Cansaço agora: $cansaço")
}

fun passarTempo() {
    fome += 1
    idade += 1
    println("O tempo passou... A $nome está um pouco mais velha e com mais fome. Fome: $fome, Idade: $idade")
}
