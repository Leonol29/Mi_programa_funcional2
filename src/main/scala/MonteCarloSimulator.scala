/**
 * Proyecto: Simulador de Probabilidad (Metodo Monte Carlo)
 * Curso: MCA 1 2026-1 FCiencias
 * Tema: Programación funcional en Scala con intellij - Paso de funciones como parámetros
 *
 * Autor: José Angel De León Olivares
 * Fecha: 6 Nov 2025
 *
 *
 * Fuentes:
 *  https://youtu.be/01sD2RDFT58?si=zyoGjSbgVoQmwNDs
 *  https://youtu.be/LEJ1kGHSXdA?si=8KmlRk0TEn4a4ksP
 *  https://www.youtube.com/watch?v=pJGnAAoZzKM
 */



import scala.util.Random

object MonteCarloSimulator extends App {

  // Función que recibe otra función como parámetro
  def estimarProbabilidad(experimento: () => Boolean, repeticiones: Int): Double = {
    val exitos = (1 to repeticiones).count(_ => experimento())
    exitos.toDouble / repeticiones
  }

  // Generador aleatorio
  private val r = new Random()

  // Ejemplo 1: probabilidad de que la suma de dos dados sea mayor a 9
  private val sumaMayorANueve = () => (r.nextInt(6) + 1) + (r.nextInt(6) + 1) > 9

  // Ejemplo 2: estimación de PI con el metodo de Monte Carlo
  private val puntoEnCirculo = () => {
    val x = r.nextDouble()
    val y = r.nextDouble()
    x * x + y * y <= 1
  }

  val probSuma = estimarProbabilidad(sumaMayorANueve, 100000)
  val piEstimado = 4 * estimarProbabilidad(puntoEnCirculo, 1000000)

  println(f"Probabilidad de suma > 9: ${probSuma * 100}%.2f%%")
  println(f"Estimación de π: $piEstimado%.6f")
}
