import javax.swing.JOptionPane

/**
 *
 * Creado por @autor: angel
 *       El  27 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 */
class Xogador(id: Int, nombre: String, apelido: String, idade: Int, demarcacion: String, dorsal: Int) :
    Seleccion(id, nombre, apelido, idade) {


    // Función concentrarse con el tiempo pedido por teclado
    override fun concentrarse(): String {
        val tempo = JOptionPane.showInputDialog("Introduce el tiempo de concentración")
        println("Concentrarse a selección durante $tempo" + " horas")
        return tempo
    }

    // Función que sobreescribe el método de la superClase (override) para adaptarse
    override fun viaxar(): String {
        val destino: String = JOptionPane.showInputDialog("Destino")
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores a  $destino")
        return destino
    }

    // Funciones que no devuelve nada (Unit)
    fun xogarPartido(): Unit {
        println("O xogador $id $nombre $apelido está convocado a xogar o partido")
    }

    fun entrenar(): Unit {
        println("O xogador  $id $nombre $apelido  ten pendiente un entreno")
    }


}