import java.util.*;

// 3. Escreva um programa que encontre o quinto número maior que 1000, cuja divisão por 11
// tenha resto 5.

class Main {
  public static void main(String[] args) {
    int cont = 1;

    for (int i = 1000; (i % 11 == 5); i++) {
      System.out.println("cont: " + cont);

      // if (cont == 5) {
      // System.out.print("Valor: " + i);
      // }
      cont += 1;

    }

  }
}