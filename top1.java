import java.util.Scanner;


public class top1{
    public static void main(String[] args){
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Que dia é hoje?");
            int dia = lector.nextInt();
            if(dia == 1){
                System.out.println("Hoje é domingo! Pé de Caximbo!");
            }
            else if(dia == 2){
                System.out.println("Hoje é segunda... Vai trabalhar!!");
            }
            else if(dia == 3){
                System.out.println("Hoje é terça! Tem aula de Linguagem de Programação!!");
            }
            else if(dia == 4){
                System.out.println("Hoje é quarta... Tem Engenharia de Software!");
            }
            else if(dia == 5){
                System.out.println("Hoje é quinta. Jonathas na área!");
            }
            else if(dia == 6){
                System.out.println("Hoje é sexta! Tem Padim e polêmica!");
            }
            else if(dia == 7){
                System.out.println("Hoje é sábado! Pensa que tem folga? Tem LP de novo!");
            }
            else if(dia >= 8){
                System.out.println("Opção inválida!");
            }
        }
    }
}