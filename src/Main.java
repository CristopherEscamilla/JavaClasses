package src;

import src.modulos.Punto;
import src.modulos.Carro;
/**
 * Clase principal que ejecuta el programa.
 * Demuestra el uso de las clases {@link Punto} y {@link Carro}:
 * Compilación y ejecución:
 * Posicionados en la carpeta raiz (cd JavaClasses)
 * Compilar todas las clases indicando la carpeta de salida(out):
 *
 * javac -d out src/*.java src/modulos/*.java
 *
 * Otra forma más genérica (busca todos los .java recursivamente):
 * javac -d out $(find . -name "*.java")
 *
 * Ejecutar el programa indicando el classpath y la clase principal:
 * java -cp out src.Main
 * Explicación:
 * -d out</code> → Le dice a javac que coloque los .class en la carpeta out/,
 *       respetando los paquetes (por eso crea out/src/modulos/
 * -cp out → Al ejecutar, Java necesita saber dónde están los .class,
 *       por eso se indica la carpeta de salida como classpath.
 * El nombre src.Main → Es el nombre completo del paquete + clase,
 *       porque en el código Main está en el paquete src
 *
 * @author  Cristopher Escamilla
 * @version 1.0
 */
public class Main{
  public static void main(String[] args) {
    // Crear puntos
    Punto punto1 = new Punto();
    Punto punto2 = new Punto(5.5,10);

    // Crear carros
    Carro carro = new Carro("Rojo","F200");
    Carro carro2 = new Carro();

    // Obtener colores de los carros
    String carro1Color = carro.getColor();
    String carro2Color = carro2.getColor();
    // Mostrar coordenadas iniciales de punto1
    double x = punto1.getX();
    double y = punto1.getY();

    System.out.println("Punto 1, coordenada x = " + x +", coordenada y = " + y);
    System.out.println("Cambiando coordenadas........");

    // Cambiar coordenadas de punto1
    punto1.setX(20);
    punto1.setY(15);

    // Mostrar nuevas coordenadas
    x=punto1.getX();
    y=punto1.getY();
    System.out.println("Punto 1 , coordenada x = " + x +", coordenada y = " + y);

    // Mostrar información de carros
    System.out.println("color carro1 " + carro1Color);
    System.out.println("color carro2 " + carro2Color);
    System.out.println("ruedas: " + carro2.getRueditas());
  }

}
