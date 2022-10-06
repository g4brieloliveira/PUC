import java.util.*;

// 7) Um número inteiro positivo x é chamado de número de n-Stolfi
// se na representação decimal de x a soma dos dígitos % n é igual ao
// dígito mais significativo. Por exemplo, 322 é um número de 4-Stolfi 
// pois (3 + 2 + 2) % 4 é igual a 3. Sua tarefa é escrever um programa 
// que, dados dois inteiros i e k, determine se o valor de i é um 
// número de k-Stolfi.

class Main {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    int num1, num2, relevant = 0, sum = 0, count = 1, stolfi = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite o i: ");
    num1 = input.nextInt();

    System.out.print("Digite o k: ");
    num2 = input.nextInt();
    input.close();

    while (num1 > 0) {
      int digit = num1 % 10;
      if (digit > relevant) {
        relevant = digit;
      }
      sum += digit;
      num1 /= 10;
    }

    do {
      if (sum % count == relevant) {
        stolfi = count;
      }
      count++;
    } while (stolfi == 0);

    if (stolfi == num2) {
      System.out.println("O número " + num2 + " é k-Stolfi");
    } else {
      System.out.println("O número " + num2 + " não é k-Stolfi, o k-Stolfi é igual a " + stolfi);
    }
  }
}