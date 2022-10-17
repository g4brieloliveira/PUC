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
  // 5) Escreva um método que receba um número inteiro maior do que zero, retorne
  // e imprima a soma de todos os seus algarismos. Por exemplo, ao número 251
  // correspondera o valor 8 (2 + 5 + 1). Se o número lido não for maior do que
  // zero, o programa terminará com a mensagem “Número inválido”.
  public static void Ex5() {
    double height, radius;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a altura do cilindro: ");
    height = input.nextDouble();

    System.out.print("Digite o raio do cilindro: ");
    radius = input.nextDouble();
    System.out.println("Volume do cilindro: " + Math.PI * Math.pow(radius, 2) * height);
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
  public static int Divisor(int N) {
    int maior = Integer.MIN_VALUE;
    boolean ehprimo;
    for (int i = 1; i <= N; i++) {
      // verifica se é divisor
      if (N % i == 0) {
        ehprimo = verificaPrimo(i);
        if (ehprimo == true) {
          if (i > maior) {
            maior = i;
          }
        }
      }
    }
    return maior;
  }

  public static boolean verificaPrimo(int num) {
    boolean ehprimo = false;
    int cont = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        cont++;
      }
    }
    if (cont == 2) {
      ehprimo = true;
    }
    return ehprimo;
  }

  public static void Ex9() {
    int N, maiorPrimo;
    Scanner le = new Scanner(System.in);

    System.out.println("Número");
    N = le.nextInt();
    maiorPrimo = Divisor(N);
    System.out.println("Maior primo: " + maiorPrimo);
    le.close();
  }

  // Exercicio 10
  // 10) Faça um método para verificar se um número é um quadrado perfeito. Um
  // quadrado perfeito é um número inteiro não negativo que pode ser expresso como
  // o quadrado de outro número inteiro. Ex: 1, 4, 9...
  public static void Ex10() {
    double height, radius;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a altura do cilindro: ");
    height = input.nextDouble();

    System.out.print("Digite o raio do cilindro: ");
    radius = input.nextDouble();
    System.out.println("Volume do cilindro: " + Math.PI * Math.pow(radius, 2) * height);
    input.close();
  }

}
