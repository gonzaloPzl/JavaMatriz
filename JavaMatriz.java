class JavaMatriz {
  public static void main(String [] args) {

    int total_metros = 0;

    // int matriz[][] = new int[4][4];

    // Declaramos la matriz multidimensional
    int matriz[][] = {{5,3,7,2}, {4,2,5,8}, {7,3,2,6}, {1,4,1,8} };

    // [[5,3,7,2], [4,2,5,8],[7,3,2,6],[1,4,1,8]]

    // Sabemos que está en la esquina inferior derecha (n,n) cuando
    // No se puede mover ni a la derecha y a la izquierda
    // Primer movimiento

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {

      }
    }

    // for(int i = 0; i < matriz.length; i++) {
    //   for (int j = 0; j < matriz.length; j++) {
    //     System.out.println(matriz[i][j]);
    //   }
    // }

    System.out.println("Prueba");
    int posicion[] = {3,3};
    boolean puedeD = puedeDerecha(posicion, matriz);
    boolean puedeA = puedeAbajo(posicion, matriz);
    boolean fin = esFin(posicion, matriz);
    System.out.println(fin);
  }

  public static boolean puedeAbajo(int[] posicion, int[][] matriz) {
    // Comparamos el tamaño del arreglo con la posición del eje y para saber si
    // puede moverse a la derecha
    System.out.println(matriz.length);
    if(matriz.length - 1 > posicion[0]) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean puedeDerecha(int[] posicion, int[][] matriz) {
    // Comparamos el tamaño del arreglo con la posición del eje x para saber si
    // puede moverse a la derecha
    if(matriz[0].length - 1 > posicion[1]) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean esFin(int[] posicion, int[][] matriz) {
    // Si no se puede a la derecha ni abajo es porque es el fin
    if(!(puedeAbajo(posicion, matriz)) && !(puedeDerecha(posicion, matriz))) {
      return true;
    } else {
      return false;
    }
  }


  /*

  public static void matriz (int numero) {
    System.out.println(numero);
  }
   */
}