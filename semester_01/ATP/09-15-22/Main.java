import java.util.*;

// 9. Faça um programa que leia a distância em Km e a quantidade de litros de gasolina
// consumidos por um carro em um percurso, calcule o consumo em Km/l e escreva uma
// mensagem de acordo com a tabela abaixo:

class Main {
  public static void main(String[] args) {
    float distance, liters, value;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade de quilometros: ");
    distance = input.nextFloat();

    System.out.print("Digite a quantidade de litros: ");
    liters = input.nextFloat();

    input.close();

    value = distance / liters;

    if (value < 8) {
      System.out.println("Venda o carro!");

    } else if (value <= 12) {
      System.out.println("Economico!");

    } else if (value > 12) {
      System.out.println("Super economico!");

    }
  }
}