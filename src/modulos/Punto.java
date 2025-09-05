package src.modulos;
import java.lang.Math;
/**
* Clase que representa un punto en el plano cartesiano con coordenadas X y Y.
* Permite crear puntos con valores por defecto (0,0) o con coordenadas personalizadas,
* además de consultar y modificar sus valores.
*
* @author  Cristopher Escamilla
* @version 1.0
*/
public class Punto{
  // Coordenada X del punto
  private double x;
  // Coordenada Y del punto
  private double y;
  /**
  * Constructor por omision.
  * Inicializa el punto en el origen (0,0).
  */
  public Punto(){
    x = 0.0;
    y = 0.0;
  }
  /**
  * Constructor con parámetros.
  *
  * @param xIni Coordenada inicial en el eje X.
  * @param yIni Coordenada inicial en el eje Y.
  */
  public Punto(double xIni, double yIni){
    x=xIni;
    y=yIni;
  }
  /**
  * Obtiene la coordenada X del punto.
  *
  * @return La coordenada X.
  */
  public double getX (){
    return x;
  }
  /**
  * Obtiene la coordenada Y del punto.
  *
  * @return La coordenada Y.
  */
  public double getY (){
    return y;
  }
  /**
  * Modifica la coordenada X del punto.
  *
  * @param x1 Nuevo valor para la coordenada X.
  */
  public void setX(double x1){
    x=x1;
  }
  /**
  * Modifica la coordenada Y del punto.
  *
  * @param y1 Nuevo valor para la coordenada Y.
  */
  public void setY(double y1){
    y=y1;
  }
}
