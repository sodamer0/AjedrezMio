// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
  Simulador de movimientos de piezas de ajedrez:
    Este proyecto implementa las funciones para calcular los movimientos posibles de tres piezas de ajedrez: caballo,
    alfil y torre. Cada función toma como entrada la posición inicial de la pieza en un tablero de ajedrez de 8x8 y
    devuelve un tablero con los movimientos posibles marcados. Los posibles movimientos serán marcados como 1 y los que
    no como 0. Recuerda que al crear una matrix int[8][8] todas las posiciones las inicializa a 0.
    Funciones a implementar:

    1. Movimiento del Caballo
    El caballo se mueve en forma de "L", es decir, dos casillas en una dirección (horizontal o vertical) y una casilla
    en la dirección perpendicular.

    2. Movimiento del Alfil
    El alfil se mueve en diagonal en cualquier dirección hasta el borde del tablero.

    3. Movimiento de la Torre
    La torre se mueve en línea recta, horizontal o verticalmente, hasta el borde del tablero.
 */



public class Main {
    public static void main(String[] args) {








    }


    public static int[][] movimientoCaballo(int fila, int columna) {
      int[][] tablero = new int[8][8];
      //Desplazamientos horizontales y verticales del caballo a partir de una coordenada cualquiera

      int[] despHor = {1,1,-1,-1,2,2,-2,-2,};
      int[] despVert = {2,-2,2,-2,1,-1,1,-1};

      //Comprobar que las posiciones posible no se salen del tablero:
      //Se tiene que cumplir que ni la coordenada horizontal ni la vertical sean mayores o iguales a 7 (tamaño 8)

      for (int i = 0; i < tablero.length; i++) {
        int nuevaPosHor = fila + despHor[i];
        int nuevaPosVert = columna + despVert[i];
        if (((nuevaPosHor >= 0) && (nuevaPosHor < tablero.length)) &&
            ((nuevaPosVert >= 0) && (nuevaPosVert < tablero.length))) {
          tablero[nuevaPosHor][nuevaPosVert] = 1;
        }
      }

      imprimirMatriz(tablero);

        return tablero;
    }

    public static int[][] movimientoAlfil(int fila, int columna) {
        int[][] tablero = new int[8][8];
        return tablero;
    }

    public static int[][] movimientoTorre(int fila, int columna) {
        int[][] tablero = new int[8][8];
        return tablero;
    }

    public static void imprimirMatriz(int [][] matriz) {
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.printf("%2d", matriz[i][j]);
        }
        System.out.println();
      }
      System.out.println();
    }
}