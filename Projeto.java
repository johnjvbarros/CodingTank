import java.util.Arrays;
import java.util.Scanner;

public class Projeto {
    public static void main(String ... args) {
        int x, sum = 0, sumout = 0;

        // quantidade de temperaturas
        System.out.println("Digite a quantidade de temperaturas que serão convertidas: ");
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int temp[] = new int[quantidade];

        // unidade de origem
        System.out.println("Digite o tipo que sera convertido \n 1- Celcius para Fahrenheit \n 2- Celcius para Kelvin \n 3- Fahrenheit para Celcius \n 4- Kelvin para Celcius \n 5- Kelvin para Fahrenheit \n 6 - Fahrenheit para Celcius");
        int tipotemp = sc.nextInt();

        // entrar temperaturas
        for ( x=0 ; x < quantidade ; x++){
                System.out.print(x+1+"a temperatura: ");
                temp[x] = sc.nextInt();
                sum += temp[x];
            }

       // System.out.printf(Arrays.toString(temp));

          // converter temperatura
        switch (tipotemp) {

             // 1- Celcius para Fahrenheit
            case 1: {
                for(x=0; x < quantidade; x++) {
                    double tempF = (temp[x] * 1.8) + 32;
                    System.out.println(temp[x] + "C em Fahrenheit é " + tempF +"F");
                    sumout += tempF;
                }
                break;
            }
            // 2- Celcius para Kelvin
            case 2: {
                for(x=0; x< quantidade; x++) {
                double tempK = temp[x] + 275.15;
                System.out.println(temp[x] + "C em Kelvin é " + tempK +"K");
                    sumout += tempK;
                }
                break;
            }

            // 3- Fahrenheit para Celcius
            case 3: {
                for(x=0; x< quantidade; x++) {
                    double tempC = (temp[x] - 32) * 5 / 9;
                    System.out.println(temp[x] + "F em Celcius é " + tempC+"C");
                    sumout += tempC;
                }
                break;
            }
            // 4- Kelvin para Celcius
            case 4: {
                for(x=0; x< quantidade; x++) {
                    double tempC = temp[x] - 275.15;
                    System.out.println(temp[x] + "K em Celcius é " + tempC+"C");
                    sumout += tempC;

                }break;
            }
            // 5- Kelvin para Fahrenheit
            case 5: {
                for(x=0; x< quantidade; x++) {
                    double tempF = ((temp[x] - 275.15) * 9 / 5) + 32;
                    System.out.println(temp[x]+ "K em Fahrenheit é " + tempF+"F");
                    sumout += tempF;

                }
                break;
            }
            // 6 - Fahrenheit para Kelvin
            case 6:{
                for(x=0; x< quantidade; x++) {
                    double tempK = ((temp[x] - 32) * 5 / 9) + 275.15;
                    System.out.println(temp[x] + "F em Kelvin é " + tempK);
                    sumout += tempK;
                }
                break;
            }
            default:
                System.out.println("opção inválida! \n");
                break;
        }

        // Media Inputs
        double average = sum / quantidade;
        System.out.println("Media das temps de entrada é "+ average+" graus");

        // Media Saida
        double averageout = sumout / quantidade;
        System.out.println("Media das temps de saida é "+ averageout+" graus");
        //imprimir temp de:
        // imprimir temp para:

        //media das temperaturas iniciais
        //media temperaturas transformadas
 }

 }
