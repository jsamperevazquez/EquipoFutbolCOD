/**
 *
 * Creado por @autor: angel
 *       El  30 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
open  class Seleccion{
    var id: Int
    var nombre: String
    var apelido: String
    var idade: Int

    constructor(id: Int, nombre: String, apelido: String, idade: Int) {
        this.id = id
        this.nombre = nombre
        this.apelido = apelido
        this.idade = idade
    }


    open fun concentrarse () : Float=0.0f
    open fun viaxar() : String = "Viaxa a Seleccion"

    override fun toString(): String {
        return "Seleccion(id=$id, nombre='$nombre', apelido='$apelido', idade=$idade)"
    }


}