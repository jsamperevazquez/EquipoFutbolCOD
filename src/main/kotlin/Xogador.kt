import javax.swing.JOptionPane

/**
 *
 * Creado por @autor: angel
 *       El  27 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
class Xogador {
    var id: Int
    var nombre: String
    var apelido: String
    var idade: Int
    var demarcacion: String

    // Segundo constructor
    constructor(id: Int, nombre: String, apelido: String, idade: Int, demarcacion: String) {
        this.id = id
        this.nombre = nombre
        this.apelido = apelido
        this.idade = idade
        this.demarcacion = demarcacion
    }
    // Función concentrarse con el tiempo pedido por teclado
    fun concentrarse () : Float {
        val tempo= JOptionPane.showInputDialog("Introduce el tiempo de concentración").toFloat()
        println("Concentrarse a selección durante $tempo")
        return tempo
    }

    fun viajar(): String {
        val destino:String=JOptionPane.showInputDialog("Destino")
        JOptionPane.showMessageDialog(null,"Viaxa a selección $destino" )
        return  destino
    }
}