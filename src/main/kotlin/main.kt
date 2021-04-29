fun main(args: Array<String>) {
    val xogador1 = Xogador(1, "Angel", "Sampere", 39, "Delantero", 9)
    val adestrador1= Adestrador(1,"Juan","Perez",41,"ad213K")
    val seleccionador= Seleccion(1,"Jose","Villar",54)
    xogador1.concentrarse()
    adestrador1.concentrarse()
    xogador1.viaxar()
    adestrador1.viaxar()
    xogador1.entrenar()
    adestrador1.dirixirAdestramento()
    seleccionador.concentrarse()
}