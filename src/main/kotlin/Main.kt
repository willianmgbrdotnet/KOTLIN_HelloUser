fun main() {
    println("Digite seu nome")
//Specifying type explicitly and changing var to val
    val nomeDaPessoa: String? = readLine()

    fun mandarOiParaPessoa(){
        println("Oi, ${nomeDaPessoa} ! Tudo bem!? ")
    }

    mandarOiParaPessoa()


}