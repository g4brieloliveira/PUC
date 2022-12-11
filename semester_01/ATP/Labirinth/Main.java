import java.util.*;
import java.io.*;

public class Main {

  public static void printArray(String[][] Arr) {
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        System.out.print(Arr[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  public static String[][] readMap(int ex, int lineLength, int columnLength) throws FileNotFoundException {
    File file = new File("./maps/MAPA" + ex + ".txt");
    Scanner sc = new Scanner(file);

    List<String> listMap = new ArrayList<>();

    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      columnLength = str.length() - 1;
      String[] arrOfStr = str.split("");
      lineLength++;
      for (int i = 0; i < arrOfStr.length; i++) {
        listMap.add(arrOfStr[i]);
      }
    }

    String[][] map = new String[lineLength][columnLength];
    int line = 0, column = 0;
    for (int i = 0; i < listMap.toArray().length; i++) {
      if (listMap.toArray()[i].hashCode() == 92) {
        line++;
        column = 0;
      } else {
        map[line][column] = listMap.toArray()[i].toString();
        column++;
      }
    }

    sc.close();

    return map;
  }

  public static void main(String[] args) throws Exception {
    System.out.print("\033[H\033[2J");
    int ex = 0;

    Scanner input = new Scanner(System.in);

    do {
      System.out.print("\033[H\033[2J");
      System.out.print("Digite o número do mapa (1 a 10): ");
      ex = input.nextInt();
    } while (ex <= 0 || ex > 10);

    input.close();

    int lineLength = 0, columnLength = 0;

    String[][] map = readMap(ex, lineLength, columnLength);

    int posX = 0, posY = 0;
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[0].length; j++) {
        if (map[i][j].hashCode() == 83) {
          posX = i;
          posY = j;
        }
      }
    }

    printArray(map);

    String[][] clearMap = new String[map.length][map[0].length];

    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[0].length; j++) {
        clearMap[i][j] = map[i][j];
      }
    }

    Boolean win = false;

    String way = "";
    do {
      int sorted = 0;

      Random random = new Random();
      sorted = random.nextInt(4);
      switch (sorted) {
        case 0:
          if (posY + 1 < map[0].length
              && (map[posX][posY + 1].hashCode() == 32 || map[posX][posY + 1].hashCode() == 69)) {
            way = way + "D";
            map[posX][posY] = "-";
            posY += 1;
          }
          break;
        case 1:
          if (posY - 1 >= 0 && (map[posX][posY - 1].hashCode() == 32 || map[posX][posY
              - 1].hashCode() == 69)) {
            way = way + "E";
            map[posX][posY] = "-";
            posY -= 1;
          }
          break;
        case 2:
          if (posX + 1 < map.length
              && (map[posX + 1][posY].hashCode() == 32 || map[posX + 1][posY].hashCode() == 69)) {
            way = way + "B";
            map[posX][posY] = "-";
            posX += 1;
          }
          break;
        case 3:
          if (posX - 1 >= 0 && (map[posX - 1][posY].hashCode() == 32 || map[posX -
              1][posY].hashCode() == 69)) {
            way = way + "C";
            map[posX][posY] = "-";
            posX -= 1;
          }
          break;
      }

      if (map[posX][posY].hashCode() == 69) {
        System.out.println("Caminho: " + way);

        System.out.println("\nVenceu!\n");
        win = true;
        printArray(map);
      }

      if ((posY + 1 < map[0].length && (map[posX][posY + 1].hashCode() == 88 || map[posX][posY + 1] == "-")) &&
          (posY - 1 >= 0 && (map[posX][posY - 1].hashCode() == 88 || map[posX][posY - 1] == "-")) &&
          (posX + 1 < map.length && (map[posX + 1][posY].hashCode() == 88 || map[posX + 1][posY] == "-")) &&
          (posX - 1 >= 0 && (map[posX - 1][posY].hashCode() == 88 || map[posX - 1][posY] == "-"))) {

        for (int i = 0; i < clearMap.length; i++) {
          for (int j = 0; j < clearMap[0].length; j++) {
            map[i][j] = clearMap[i][j];
          }
        }

        way = "";

        for (int i = 0; i < map.length; i++) {
          for (int j = 0; j < map[0].length; j++) {
            if (map[i][j].hashCode() == 83) {
              posX = i;
              posY = j;
            }
          }
        }

        sorted = random.nextInt(4);
      }

    } while (win == false);
  }
}

// HASHCODES
// S = 83
// E = 69
// X = 88
// ' ' = 32