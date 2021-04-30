import javax.swing.JOptionPane

/**
 *
 * Creado por @autor: angel
 *       El  27 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 */
class Adestrador(id: Int, nombre: String, apelido: String, idade: Int, idFederacion: String) :
    Seleccion(id, nombre, apelido, idade) {


    //segundo constructor

    // metodos (fun)
    override fun concentrarse(): String {
        val tempo = JOptionPane.showInputDialog("Introduce el tiempo de concentración")
        println("Concentrarse a seleccion durante $tempo" + " horas")
        return tempo
    }

    override fun viaxar(): String {
        val destino: String = JOptionPane.showInputDialog("Destino")
        JOptionPane.showMessageDialog(null, "Viaxan os adestradores a  $destino")
        return destino
    }

    fun dirixirPartido(): Unit {
        println("O adestrador $id $nombre $apelido está dirixindo o partido")
    }

    fun dirixirAdestramento(): Unit {
        println("O adestradir $id $nombre $apelido está dirixindo o adestramento")
    }


}