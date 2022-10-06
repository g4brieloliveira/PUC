import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    int ex = 0;

    Scanner input = new Scanner(System.in);

    do {
      System.out.print("\033[H\033[2J");
      System.out.print("Digite o número do exercicio (1 a 9): ");
      ex = input.nextInt();
    } while (ex <= 0 || ex > 10);

    switch (ex) {
      case 1:
        double height, radius;

        System.out.print("Digite a altura do cilindro: ");
        height = input.nextDouble();

        System.out.print("Digite o raio do cilindro: ");
        radius = input.nextDouble();
        System.out.println("Volume do cilindro: " + (Ex1(height, radius)));
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        System.out.println("Esse exercício não existe kkkkk");
        break;
      case 8:
        break;
      case 9:
        break;
      case 10:
        break;
      default:
        System.out.println("Exercício não encontrado.");
    }
    input.close();

  }

  public static double Ex1(double height, double radius) {
    return (Math.PI * Math.pow(radius, 2) * height);
  }

  public static void Ex2() {

  }

  public static void Ex3() {

  }

  public static void Ex4() {

  }

  public static void Ex5() {

  }

  public static void Ex6() {

  }

  public static void Ex8() {

  }

  public static void Ex9() {

  }

  public static void Ex10() {
  }

}
