package com.mycompany.practicaprogramadai;

public class PracticaProgramadaI {

    public static void main(String[] args) {

        String cadena = "11001110";
        int i = cadena.length() - 1;

        contadorBitsEncendidos(cadena, i, 0);

        int[] arregloDeNumeros = {1, 2, 3, 4, 5, 6, 8};

        encontrarNumerosPares(arregloDeNumeros, 0);

    }

    //Ejercicio #1
    public int contadorBitsEncendidos(String cadena, int i, int contador) {
        if (cadena.charAt(i).equals("1")) {
            return contador + 1;
        } else {
            return contador;
        }

        if (cadena.charAt(i).equals("1")) {
            contador++;
        }

        return contadorBitsEncendidos(cadena, i - 1, contador);
    }

    //Ejercicio #2
    public int encontrarNumerosPares(int[] arregloDeNumeros, int contador) {
        for (int i = 0; i < arregloDeNumeros.length; i++) {
            if (arregloDeNumeros[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    //Ejercicio #3
    // LA RESOUESTA ES 7
}
