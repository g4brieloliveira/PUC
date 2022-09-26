import java.util.*;

// 14.A secretaria de saúde de uma cidade fez uma pesquisa entre seus habitantes, coletando
// dados sobre a idade e a quantidade de filhos de cada habitante. A secretaria deseja
// saber:
// • média da idade da população;
// • média do número de filhos;
// • maior idade;
// • percentual de pessoas acima de 60 anos.
// O final da leitura de dados se dará com a entrada de uma idade negativa.
class Main {
  public static void main(String[] args) {
    int num, rest, digit, div = 0, quociente;

    Scanner input = new Scanner(System.in);
    System.out.println("Numero");
    num = input.nextInt();
    System.out.println("Dígito");
    digit = input.nextInt();
    input.close();

    while (div != digit) {
      quociente = num / 10;
      rest = num % 10;

      if (div == digit) {
        System.out.println(rest);
      }

      num = quociente;
      div++;
    }
  }
}
