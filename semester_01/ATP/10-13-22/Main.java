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
      case 7:
        Ex7();
        break;
      case 8:
        Ex8();
        break;
      case 9:
        Ex9();
        break;
      case 10:
        Ex10();
        break;
      default:
        System.out.println("Exercício não encontrado.");
    }
    input.close();

  }

  // Exercicio 1
  public static void Ex1() {
    int[] nums = new int[20];
    int num = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < nums.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      num = input.nextInt();

      nums[i] = num;
    }
    ;
    System.out.print("\n[");
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 60) {

        System.out.print(nums[i] + ", ");
      }
    }
    ;
    System.out.println("]");

    input.close();
  }

  // Exercicio 2
  public static void Ex2() {
    int[] nums = new int[30];
    int count = 0, num = 50;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i <= nums.length - 1; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      num = input.nextInt();

      nums[i] = num;
    }
    ;
    count = 0;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] == 10) {
        count++;
      }
    }
    ;
    System.out.println("O número 10 se repetiu " + count + " vezes");

    input.close();
  }

  // Exercicio 3
  public static void Ex3() {
    int[] nums = new int[100];
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    for (int i = 0; i <= nums.length - 1; i++) {
      nums[i] = random.nextInt(0, 100);
    }
    ;
    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] == 0) {
        System.out.println("0 na posição " + i);

      }
    }
    ;

    input.close();
  }

  // Exercicio 4
  public static void Ex4() {
  }

  // Exercicio 5
  public static void Ex5() {
  }

  // Exercicio 6
  public static void Ex6() {
  }

  // Exercicio 7
  public static void Ex7() {
  }

  // Exercicio 8
  public static void Ex8() {
  }

  // Exercicio 9
  public static void Ex9() {
  }

  // Exercicio 10
  public static void Ex10() {
  }
}
