// Aula Entrada, saída e processamento de dados. - Data: 25/08/2022
// Lab. ATP – ADS e SI / SG – 2/2022

// Aluno(a): Gabriel Augusto de Oliveira Pinto
// Profa. Michelle Nery Nascimento

// 1. Escreva um programa onde serão fornecidos como entrada de dados dois
// valores inteiros,
// calcule e imprima a soma, o produto, a diferença, o quociente destes números.

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// int num1, num2, sum, subtraction, multiplication, division;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite o primeiro numero: ");
// num1 = input.nextInt();
// System.out.println("Digite o segundo numero: ");
// num2 = input.nextInt();
// input.close();

// sum = num1 + num2;
// subtraction = num1 - num2;
// multiplication = num1 * num2;
// division = num1 / num2;

// System.out.println("A soma dos números é: " + sum + "\nO produto dos números
// é: " + multiplication
// + "\nA diferença dos números é: " + subtraction + "\nO quociente destes
// números é: " + division);
// }
// }

// 2. Escreva um programa que leia uma temperatura em graus Farenheit e a
// imprima em graus
// Centígrados. A conversão de graus Farenheit para Centígrados é obtida por
// C=(5/9)(F-32).

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// double farenheit, celsius;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite a temperatura em graus Farenheit: ");
// farenheit = input.nextFloat();
// input.close();

// celsius = (farenheit - 32) / 1.8;

// System.out.println(farenheit + "°F é igual a " + celsius + "°C");
// }
// }

// 3. Escreva um programa que pergunte os seguintes dados referentes ao pneu de
// um
// automóvel:
// P = pressão
// V = volume
// T = temperatura
// e calcule a massa de ar desse pneu segundo a fórmula (M = massa de ar):
// PV = 0.37M(T+460)

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// double pressure, volume, temperature, value;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite a pressão: ");
// pressure = input.nextInt();
// System.out.println("Digite o volume: ");
// volume = input.nextInt();
// System.out.println("Digite a temperatura: ");
// temperature = input.nextInt();

// input.close();

// value = (pressure * volume / (temperature + 460)) / 0.37;

// System.out.println("A massa de ar desse pneu é: " + value);
// }
// }

// 4. Escreva um programa que pergunte qual o tempo transcorrido em um
// cronômetro em
// horas, minutos e segundos e transforme (e mostre) todo este tempo em
// segundos.

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// int hours, minutes, seconds, value;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite o valor das horas: ");
// hours = input.nextInt();
// System.out.println("Digite o valor dos minutos: ");
// minutes = input.nextInt();
// System.out.println("Digite o valor dos segundos: ");
// seconds = input.nextInt();

// input.close();

// value = (hours * 3600) + (minutes * 60) + seconds;

// System.out.println("Foram percorridos " + value + " segundos no total");
// }
// }

// 5. Escreva um programa que leia uma temperatura em graus Farenheit e a
// imprima em graus
// Centígrados. A conversão de graus Farenheit para Centígrados é obtida por
// C=(5/9)(F-32)

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// double farenheit, celsius;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite a temperatura em graus Farenheit: ");
// farenheit = input.nextFloat();
// input.close();

// celsius = (farenheit - 32) / 1.8;

// System.out.println(farenheit + "°F é igual a " + celsius + "°C");
// }
// }

// 6. Determinar a quantidade de litros de combustível gastos em uma viagem por
// um
// automóvel que faz 12km/l. Para isso, sabe-se que o tempo gasto na viagem é t
// = 35min e
// a velocidade média do automóvel é v = 80km/h.

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// float consumption = 12, time = 35, velocity = 80, value;

// value = (((time / 60) * velocity) / consumption);

// System.out.println("Foram gastos " + value + " litros de combustível");
// }
// }

// 7. Criar um algoritmo que obtenha 4 números reais e exiba a sua média
// ponderada, sabendo-
// se que os pesos são 2, 1, 3 e 4, nesta ordem.

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// float num1, num2, num3, num4, value;
// int p1 = 2, p2 = 1, p3 = 3, p4 = 4;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite o primeiro numero: ");
// num1 = input.nextInt();
// System.out.println("Digite o segundo numero: ");
// num2 = input.nextInt();
// System.out.println("Digite o terceiro numero: ");
// num3 = input.nextInt();
// System.out.println("Digite o quarto numero: ");
// num4 = input.nextInt();
// input.close();

// value = ((num1 * p1) + (num2 * p2) + (num3 * p3) + (num4 * p4)) / (p1 + p2 +
// p3 + p4);

// System.out.println("Media: " + value);
// }
// }

// 8. Para vários tributos a base de calculo é o salário mínimo. Fazer um
// algoritmo que leia o o
// valor do salário de uma pessoa. Calcular e exibir quantos salários mínimos
// essa pessoa
// ganha. Considere que o valor do salário mínimo é: R$1.212,00.

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// float salary, value;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite seu salario: ");
// salary = input.nextInt();
// input.close();

// value = salary / 1212;

// System.out.println("Este salário equivale a " + value + " salários mínimos");
// }
// }

// 9. Todo restaurante cobra 10% sobre o valor do consumo do cliente para o
// garçom, embora
// por lei não possa obrigar o cliente a pagar. Fazer um algoritmo que leia o
// valor gasto com
// as despesas realizadas em um restaurante e imprima o valor da gorjeta e o
// valor total a
// ser pago (despesa mais gorjeta).

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// double consumption, tip, value;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite o consumo: ");
// consumption = input.nextInt();
// input.close();

// tip = consumption * 0.1;
// value = consumption + tip;

// System.out.println("O valor da gorjeta é: R$" + tip + "\nO consumo mais a
// gorjeta fica igual a: R$" + value);
// }
// }

// 10. Faça um algoritmo para calcular quantas ferraduras são necessárias para
// equipar todos os
// cavalos comprados para um haras

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// int horses, value;

// Scanner input = new Scanner(System.in);
// System.out.println("Digite a quantidade de cavalos comprada: ");
// horses = input.nextInt();
// input.close();

// value = (horses * 4);

// System.out.println("Deverá comprar " + value + " ferraduras");
// }
// }