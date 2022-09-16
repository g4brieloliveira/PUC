import java.util.*;

// 6. A energia gasta em kcal (calorias) com uma atividade aeróbica qualquer obedece a
// seguinte equação: E = MET × PESO × Tempo atividade/60. O tempo é dado em minutos. O peso
// é dado em quilos. METS significa capacidade aeróbica e depende do tipo de exercício. Ciclismo
// ou corrida leve tem pontuação de 7.0 METS. A Natação Crawl tem pontuação de 8.0 METS. Um
// usuário deve entrar com seu peso, quanto tempo ele corre por semana; quanto tempo ele pedala
// por semana e quanto tempo ele nada por semana. O seu programa deve retornar o número de
// calorias que este usuário queima por semana com exercícios físicos. (OBS: os dados acima são
// reais para pessoas até 40 anos.)

class Main {
  public static void main(String[] args) {
    double weight, runningTime, pedalingTime, swimTime, value;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite seu peso: ");
    weight = input.nextDouble();

    System.out.print("Digite, em minutos, quanto tempo você corre por semana: ");
    runningTime = input.nextDouble();

    System.out.print("Digite, em minutos, quanto tempo você pedala por semana: ");
    pedalingTime = input.nextDouble();

    System.out.print("Digite, em minutos, quanto tempo você nada por semana: ");
    swimTime = input.nextDouble();
    input.close();

    value = (7.0 * weight * (runningTime / 60)) + (7.0 * weight * (pedalingTime / 60))
        + (8.0 * weight * (swimTime / 60));

    System.out.println("Este usuário queima " + value + " kcal por semana");

  }
}