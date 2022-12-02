class JavaMatriz {
  
  int total_metros = 0;
  int valor_casilla = 0;
  int posicion[] = {3,3};
  static int matriz[][] = {{5,3,7,2}, {4,2,5,8}, {7,3,2,6}, {1,4,1,8} };
  public static void main(String [] args) {
    int total = Resolucion.miResolucion(matriz, 0, 0, 0);
    System.out.println(total);
  
    
  }
  
}