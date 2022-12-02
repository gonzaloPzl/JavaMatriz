import java.util.ArrayList;

public class Resolucion {
  // Declaramos un
  ArrayList<Integer> caminoArray = new ArrayList<Integer>();

  static int total_metros ;
  
  public static boolean puedeDerecha(int posX, int posY, int[][] matriz) {
    // Comparamos el tamaño del arreglo con la posición del eje y para saber si
    // puede moverse a la derecha

    if(matriz.length - 1 > posY) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean puedeAbajo(int posX, int posY, int[][] matriz) {
    // Comparamos el tamaño del arreglo con la posición del eje x para saber si
    // puede moverse a la derecha
    if(matriz[0].length - 1 > posX) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean esFin(int posX, int posY, int[][] matriz) {
    // Si no se puede a la derecha ni abajo es porque es el fin
    if(!puedeAbajo(posX, posY, matriz) && !puedeDerecha(posX, posY, matriz)) {
      return true;
    } else {
      return false;
    }
  }


  public static int miResolucion(int[][] matrizDeNumeros, int posX, int posY, int metrosRecorridos ) {

    if (esFin(posX, posY, matrizDeNumeros)) {
      System.out.print(matrizDeNumeros[posX][posY] + " | ");
      total_metros += matrizDeNumeros[posX][posY];
      return total_metros;
    }else {
      if(puedeDerecha(posX, posY, matrizDeNumeros)) {
        // System.out.print("puede derecha");
        System.out.print(matrizDeNumeros[posX][posY] + " | ");
        total_metros += matrizDeNumeros[posX][posY];
        miResolucion(matrizDeNumeros, posX , posY + 1, total_metros);
      }
      else if (puedeAbajo(posX, posY, matrizDeNumeros)) {
        // System.out.print("puede abajo");
        System.out.print(matrizDeNumeros[posX][posY] + " | ");
        total_metros += matrizDeNumeros[posX][posY];
        miResolucion(matrizDeNumeros, posX + 1, posY , total_metros);
      }

    }
    return total_metros;
  }
}
