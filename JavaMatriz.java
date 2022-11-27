class JavaMatriz {
  public static void main(String [] args) {

    // int matriz[][] = new int[4][4];


    // Declaramos la matriz multidimensional
    int matriz[][] = {{5,3,7,2}, {4,2,5,8}, {7,3,2,6}, {1,4,1,8} };

    // [[5,3,7,2], [4,2,5,8],[7,3,2,6],[1,4,1,8]]

    for(int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.println(matriz[i][j]);
      }
    }
    System.out.println("Prueba");
  }

  /*

  public static void matriz (int numero) {
    System.out.println(numero);
  }
   */
}