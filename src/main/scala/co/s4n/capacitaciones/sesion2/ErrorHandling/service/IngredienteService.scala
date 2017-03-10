package co.s4n.capacitaciones.sesion2.ErrorHandling.service

import co.s4n.capacitaciones.sesion2.ErrorHandling.Ingrediente

trait IngredienteService[A <: Ingrediente] {

  def editar(ingrediente: A): Option[A]

  def editarUnIngrediente(ingrediente: A)(): Option[A]

  def crearIngrediente(a: String, b: String): A

  def filtrarIngrediente(ingrediente: A, lista: List[A]): (List[A], List[A])

  def seEdita(a: A, b: A): A

  def escribirArchivoIngrediente(titulo: String, ingrediente: A, lista: List[A]): Option[A]

  def archivoLectura(ingrediente: A): String

  def archivoEscritura(ingrediente: A): String

}