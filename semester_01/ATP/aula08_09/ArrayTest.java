import java.util.*;

// 8. Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado possui
// uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). Fac.a
// um programa em que o usuário entre com o valor e o estado destino do produto e o programa
// retorne o preço final do produto acrescido do imposto do estado em que ele será vendido.
// Se o estado digitado não for válido, mostrar uma mensagem de erro.

class ArrayTest {
  public static void main(String[] args) {
    String UF;
    String[] UFs = { "MG", "SP", "RJ", "MS" };
    float value;

    Scanner input = new Scanner(System.in);
    System.out.println("\033[H\033[2J");

    System.out.print("Digite o estado desejado (MG, SP, RJ ou MS): ");
    UF = input.next().toUpperCase();
    while (Arrays.asList(UFs).contains(UF) != true) {
      System.out.println("\033[H\033[2J");
      System.out.println("Digite um estado válido!\n");
      System.out.println("Digite o estado desejado (MG, SP, RJ ou MS): ");
      UF = input.next().toUpperCase();
    }

    System.out.print("Digite o valor: ");
    value = input.nextFloat();

    input.close();

    switch (UF) {
      case "MG":
        System.out.println("O valor acrescido de imposto é igual a R$" + (value + (value * 0.07)));
        break;

      case "SP":
        System.out.println("O valor acrescido de imposto é igual a R$" + (value + (value * 0.12)));
        break;

      case "RJ":
        System.out.println("O valor acrescido de imposto é igual a R$" + (value + (value * 0.15)));
        break;

      case "MS":
        System.out.println("O valor acrescido de imposto é igual a R$" + (value + (value * 0.08)));
        break;
    }
  }
}