package AulaRevisão;

import java.util.Scanner;

public class ExemplosRevisão1 {
    Scanner sc = new Scanner (System.in);
    public void exeercicio1() {
        System.out.println("Informe a primeira nota do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a segunda nota");
        int nota2 = sc.nextInt();
        double media = (nota1+nota2)/2 ;
        System.out.println("A média do aluno é " +media);
        System.out.println("Informe o total de aulas da disiplina");
        int aulasDadas= sc.nextInt();
        System.out.println("Informe a quantidade de faltas do auluno");
        int totalFaltas = sc.nextInt();
        double frequencia= (aulasDadas -totalFaltas)*100/aulasDadas;
        System.out.println("O tatal de frequencia é " + frequencia+ "%");
        if(media>50 && frequencia>=75){
            System.out.println("Aluno aprovado");
        } else if(media<50 && frequencia>=75){
            System.out.println("Aluno de recuperção");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
