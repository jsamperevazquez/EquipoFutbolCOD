// Clase main
fun main(args: Array<String>) {
    //Instancio objeto de subclase Xogador
    val xogador1 = Xogador(1, "Marco", "Van Basten", 39, "Delantero", 9)
    // Instancio objeto de subclase Adestrador
    val adestrador1 = Adestrador(1, "Juan", "Perez", 41, "ad213K")

    //Hago llamamiento a métodos concentrarse de las subclases (Cada método es diferente en función del objeto que lo llame)
    xogador1.concentrarse()
    adestrador1.concentrarse()

    //Hago llamamiento a métodos viaxar de las subclases (Cada método es diferente en función del objeto que lo llame)
    xogador1.viaxar()
    adestrador1.viaxar()

    // Demás métodos
    xogador1.entrenar()
    adestrador1.dirixirAdestramento()
    adestrador1.dirixirPartido()
    xogador1.xogarPartido()


}