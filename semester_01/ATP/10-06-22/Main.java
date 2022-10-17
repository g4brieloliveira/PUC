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
        System.out.println("Esse exercício não existe kkkkk");
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
  public static double calcVol(double height, double radius) {
    return Math.PI * Math.pow(radius, 2) * height;
  }

  public static void Ex1() {
    double height, radius;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a altura do cilindro: ");
    height = input.nextDouble();

    System.out.print("Digite o raio do cilindro: ");
    radius = input.nextDouble();
    System.out.println("Volume do cilindro: " + calcVol(height, radius));
    input.close();
  }

  // Exercicio 2
  public static void getHigher(int h1, int h2, int h3, int h4) {
    if (h1 > h2 && h1 > h3 && h1 > h4) {
      System.out.println("Vencedor, cavalo 1 na posição: " + h1);

    } else if (h2 > h1 && h2 > h3 && h1 > h4) {
      System.out.println("Vencedor, cavalo 2 na posição: " + h1);

    } else if (h3 > h1 && h3 > h2 && h3 > h4) {
      System.out.println("Vencedor, cavalo 3 na posição: " + h1);

    } else {
      System.out.println("Vencedor, cavalo 4 na posição: " + h1);

    }
  }

  public static void sort(int h1, int h2, int h3, int h4) {
    Random rd = new Random();
    for (int i = 1; i <= 10; i++) {
      h1 += rd.nextInt(0, 6);
      h2 += rd.nextInt(0, 6);
      h3 += rd.nextInt(0, 6);
      h4 += rd.nextInt(0, 6);
    }

    getHigher(h1, h2, h3, h4);
  }

  public static void Ex2() {
    int h1 = 0, h2 = 0, h3 = 0, h4 = 0;
    sort(h1, h2, h3, h4);
  }

  // Exercicio 3
  public static int calcMult(int num, int mult) {
    int value = 0;

    for (int i = 1; i <= mult; i++) {
      value += num;
    }

    return value;
  }

  public static void Ex3() {
    int num, mult;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o número: ");
    num = input.nextInt();

    System.out.print("Digite o multiplicador: ");
    mult = input.nextInt();
    System.out.println("Resultado: " + calcMult(num, mult));
    input.close();
  }

  // Exercicio 4
  public static int calcDigits(int num) {
    int cont = 0;
    do {
      cont++;
      num = num / 10;
    } while (num != 0);
    return cont;
  }

  public static void Ex4() {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    num = input.nextInt();
    input.close();

    System.out.println("O número " + num + " possui " + calcDigits(num) + " dígitos");
  }

  // Exercicio 5
  public static int sumDigits(int num) {
    int sum = 0;
    System.out.print("A soma dos dígitos ");

    while (num > 0) {
      System.out.print(num % 10 + " ");
      sum += (num % 10);
      num = (num / 10);
    }
    System.out.print("é igual a: ");

    return sum;
  }

  public static void Ex5() {
    int num;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número maior que 0: ");
    num = input.nextInt();

    if (num > 0) {
      System.out.println(sumDigits(num));
    } else {
      System.out.println("Número inválido!");

    }

    input.close();

  }

  // Exercicio 6
  public static int calcIntersection(int num1, int num2) {
    int value = 0;

    for (int i = (num1 + 1); i < num2; i++) {
      value += i;
    }

    return value;
  }

  public static void Ex6() {
    int num1, num2, higher, smaller;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primero número: ");
    num1 = input.nextInt();

    System.out.print("Digite o segundo número: ");
    num2 = input.nextInt();

    if (num1 > num2) {
      higher = num1;
      smaller = num2;
    } else {
      higher = num2;
      smaller = num1;
    }

    System.out
        .println("A soma dos números entre " + smaller + " e " + higher + " é: " + calcIntersection(smaller, higher));
    input.close();
  }

  // Exercicio 8
  public static int calcExp(int num, int exp) {
    int value = 1;

    for (int i = 1; i <= exp; i++) {
      value *= num;
    }

    return value;
  }

  public static void Ex8() {
    int num, exp;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite o número: ");
    num = input.nextInt();

    System.out.print("Digite o expoente: ");
    exp = input.nextInt();
    System.out.println("Resultado: " + calcExp(num, exp));
    input.close();
  }

  // Exercicio 9
  public static int div(int num) {
    int maior = Integer.MIN_VALUE;
    boolean primo;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        primo = verificaPrimo(i);
        if (primo == true) {
          if (i > maior) {
            maior = i;
          }
        }
      }
    }
    return maior;
  }

  public static boolean verificaPrimo(int num) {
    boolean primo = false;
    int cont = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        cont++;
      }
    }
    if (cont == 2) {
      primo = true;
    }
    return primo;
  }

  public static void Ex9() {
    int num, maiorPrimo;
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    num = input.nextInt();
    maiorPrimo = div(num);
    System.out.println("Maior primo: " + maiorPrimo);
    input.close();
  }

  // Exercicio 10
  static boolean varificaQuadradoPerfeito(int num) {
    if (num >= 0) {
      int raiz = (int) Math.sqrt(num);
      return ((raiz * raiz) == num);
    }
    return false;
  }

  public static void Ex10() {
    int num;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    num = input.nextInt();
    input.close();

    if (varificaQuadradoPerfeito(num))
      System.out.println("O número " + num + " é um quadrado perfeito.");
    else
      System.out.println("O número " + num + " não é um quadrado perfeito.");

  }
}
