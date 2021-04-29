import javax.swing.JOptionPane

/**
 *
 * Creado por @autor: angel
 *       El  27 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
class Xogador(id: Int,nombre: String,apelido: String,idade: Int,demarcacion:String,dorsal:Int) : Seleccion(id,nombre,apelido,idade)  {


    // Función concentrarse con el tiempo pedido por teclado
    override fun concentrarse () : Float {
        val tempo= JOptionPane.showInputDialog("Introduce el tiempo de concentración").toFloat()
        println("Concentrarse a selección durante $tempo" + " horas")
        return tempo
    }

    override fun viaxar(): String {
        val destino:String=JOptionPane.showInputDialog("Destino")
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores a  $destino" )
        return  destino
    }
    fun xogarPartido(): Unit {
        println("O xogador $id $nombre $apelido está convocado a xogar o partido")
    }
    fun entrenar(): Unit {
        println("O xogador  $id $nombre $apelido  ten pendiente un entreno")
    }


}