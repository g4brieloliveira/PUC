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
      default:
        System.out.println("Exercício não encontrado.");
    }
    input.close();

  }

  public static void printArray(int[][] Arr) {
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        System.out.print(Arr[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  // Exercicio 1
  public static void Ex1() {
    int[][] Arr = new int[5][5];

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(10);
      }
    }

    printArray(Arr);

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print(Arr[i][j] + " ");
        }
      }
    }
  }

  // Exercicio 2
  public static void Ex2() {
    int[][] Arr = new int[10][10];

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(100);
      }
    }

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        if (i < j) {
          System.out.print(Arr[i][j] + " ");
        }
      }
      System.out.println("");
    }
  }

  // Exercicio 3
  public static void Ex3() {
    int[][] Arr = new int[5][5];
    int[] RowArr = new int[5];
    int[] ColumnArr = new int[5];

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(10);
      }
    }

    printArray(Arr);

    int sum = 0;

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        sum += Arr[i][j];
      }

      RowArr[i] = sum;
      sum = 0;
    }

    sum = 0;

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        sum += Arr[j][i];
      }

      ColumnArr[i] = sum;
      sum = 0;
    }

    for (int i = 0; i < Arr.length; i++) {
      System.out.print(RowArr[i] + " ");
    }

    System.out.println("");

    for (int i = 0; i < Arr[0].length; i++) {
      System.out.print(ColumnArr[i] + " ");
    }

  }

  // Exercicio 4
  public static void Ex4() {
    int[][] Arr = new int[2][3];

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(10);
      }
    }

    printArray(Arr);

    for (int i = 0; i < Arr[0].length; i++) {
      System.out.print(Arr[0][i] + " ");
      System.out.println(Arr[1][i]);
    }
  }

  // Exercicio 5
  public static void Ex5() {
    int[][] Arr = new int[10][10];

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(10);
      }
    }

    printArray(Arr);

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        if (i == 1) {
          int num;
          num = Arr[7][j];
          Arr[7][j] = Arr[i][j];
          Arr[i][j] = num;
        }
      }
    }

    printArray(Arr);

  }

  // Exercicio 6
  public static int[][] sumArr(int[][] ArrA, int[][] ArrB, int arrLength) {
    int[][] NewArr = new int[arrLength][arrLength];

    for (int i = 0; i < NewArr.length; i++) {
      for (int j = 0; j < NewArr[0].length; j++) {
        NewArr[i][j] = ArrA[i][j] + ArrB[i][j];
      }
    }

    return NewArr;
  }

  public static void Ex6() {
    int arrLength = 5;
    int[][] ArrA = new int[arrLength][arrLength];
    int[][] ArrB = new int[arrLength][arrLength];

    Random random = new Random();

    for (int i = 0; i < ArrA.length; i++) {
      for (int j = 0; j < ArrA[0].length; j++) {
        ArrA[i][j] = random.nextInt(10);
      }
    }

    for (int i = 0; i < ArrB.length; i++) {
      for (int j = 0; j < ArrB[0].length; j++) {
        ArrB[i][j] = random.nextInt(10);
      }
    }

    printArray(ArrA);
    printArray(ArrB);
    printArray(sumArr(ArrA, ArrB, arrLength));
  }

  // Exercicio 7
  public static void Ex7() {
    int arrLength = 6;
    int[][] Arr = new int[arrLength][arrLength];
    int[] SmallerArr = new int[arrLength];
    int[] HigherArr = new int[arrLength];
    int higher = Integer.MIN_VALUE;
    int smaller = Integer.MAX_VALUE;

    Random random = new Random();

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        Arr[i][j] = random.nextInt(10);
      }
    }

    printArray(Arr);

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr.length; j++) {
        if (Arr[j][i] > higher) {
          higher = Arr[j][i];
          HigherArr[i] = Arr[j][i];
        }

        if (Arr[j][i] < smaller) {
          smaller = Arr[j][i];
          SmallerArr[i] = Arr[j][i];
        }
      }
      higher = Integer.MIN_VALUE;
      smaller = Integer.MAX_VALUE;
    }

    for (int i = 0; i < HigherArr.length; i++) {
      System.out.print(HigherArr[i] + " ");
    }

    System.out.println(" ");

    for (int i = 0; i < SmallerArr.length; i++) {
      System.out.print(SmallerArr[i] + " ");
    }

    System.out.println(" ");

    for (int i = 0; i < SmallerArr.length; i++) {
      System.out.print((SmallerArr[i] + HigherArr[i]) / 2 + " ");
    }

  }
}
