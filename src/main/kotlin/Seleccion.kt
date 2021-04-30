/**
 *
 * Creado por @autor: angel
 *       El  30 de abr. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 */
// Clase abstracta con open (Va a extender a otras clases)
open abstract class Seleccion {

    // atributos
    var id: Int
    var nombre: String
    var apelido: String
    var idade: Int

    // Método  segundo constructor
    constructor(id: Int, nombre: String, apelido: String, idade: Int) {
        this.id = id
        this.nombre = nombre
        this.apelido = apelido
        this.idade = idade
    }

    // Método abstracto
    abstract fun concentrarse(): String

    // Método open(se va a sobreescribir según necesidad)
    open fun viaxar(): String = "Viaxa a Seleccion"

    // Método toString()
    override fun toString(): String {
        return "Seleccion(id=$id, nombre='$nombre', apelido='$apelido', idade=$idade)"
    }


}