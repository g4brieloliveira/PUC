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
        Ex1();
        break;
      case 2:
        Ex2();
        break;
      case 3:
        Ex3();
        break;
      case 4:
        Ex4();
        break;
      case 5:
        Ex5();
        break;
      case 6:
        Ex6();
        break;
      default:
        System.out.println("Exercício não encontrado.");
    }
    input.close();

  }

  // Exercicio 1
  public static double calcTravelTime(double distance, double vel) {
    double travelTime;

    travelTime = distance / vel;

    return travelTime;
  }

  public static void Ex1() {
    double distance, vel;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a distancia: ");
    distance = input.nextDouble();

    System.out.print("Digite a velocidade: ");
    vel = input.nextDouble();
    System.out.println("O tempo para percorrer esse caminho é " + calcTravelTime(distance, vel)
        + " e a velocidade em m/s é " + vel / 3.6);
    input.close();
  }

  // Exercicio 2
  public static void Ex2() {
    int smaller, higher, num;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o limite inferior: ");
    smaller = input.nextInt();

    System.out.print("Digite o limite superior: ");
    higher = input.nextInt();

    System.out.print("Digite o numero do multiplo: ");
    num = input.nextInt();

    for (int i = smaller + 1; i < higher; i++) {
      if (i % num == 0) {
        System.out.println(i);
      }
    }

    input.close();
  }

  // Exercicio 3
  public static void Ex3() {

  }

  // Exercicio 4
  public static void Ex4() {
    for (int i = 10; i < 100; i++) {
      if (i % 10 != 0) {
        if (i % (i / 10) == 0) {
          System.out.println(i);
        }
      }
    }
  }

  // Exercicio 5
  public static void Ex5() {
    int num, count = 1;
    int[] arr = new int[99];

    Scanner input = new Scanner(System.in);

    do {
      System.out.print("Digite um número: ");
      num = input.nextInt();

      if (num % count == 0) {
        arr[count - 1] = num;
      }
      count++;
    } while (num != 0);

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        System.out.println(arr[i]);
      }
    }

    input.close();
  }

  // Exercicio 6
  public static void Ex6() {

  }
}
