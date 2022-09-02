package com.mycompany.horadosistema;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @OTalDoL2 -> Github
 * @L2.ramos -> Instagram
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = info.nextLine();
        
        
        Calendar c1 = Calendar.getInstance();
	int hora = c1.get(Calendar.HOUR_OF_DAY);
        int dia = c1.get(Calendar.DAY_OF_WEEK);
        String dayOfWeek = "";
        switch (dia) {
            case 1 -> dayOfWeek = "domingo";
            case 2 -> dayOfWeek = "segunda";
            case 3 -> dayOfWeek = "terça";
            case 4 -> dayOfWeek = "quarta";
            case 5 -> dayOfWeek = "quinta";
            case 6 -> dayOfWeek = "sexta";
            case 7 -> dayOfWeek = "sábado";
        }
        /*switch (dia) {
            case 1:
                dayOfWeek = "domingo";
                break;
            case 2:
                dayOfWeek = "segunda";
                break;
            case 3:
                dayOfWeek = "terça";
                break;
            case 4:
                dayOfWeek = "quarta";
                break;
            case 5:
                dayOfWeek = "quinta";
                break;
            case 6:
                dayOfWeek = "sexta";
                break;
            case 7:
                dayOfWeek = "sábado";
                break;
        }*/
        
        if(hora > 0 && hora < 6){
            System.out.println("Ei, " + nome + " você não deveria estar dormindo? Até porque são " + hora + " da manhã! Daqui a pouco é hora de ir para luta!");
            System.out.println("Boa " + dayOfWeek + " Guerreiro(a)!!!!");
        }
        else if(hora > 6 && hora < 12){
            System.out.println("Bom dia, " + nome + "!");
            System.out.println("Excelente " + dayOfWeek + " para você!!!!");
        }
        else if(hora > 12 && hora < 18){
            System.out.println("Boa tarde " + nome + "!");
        }
        else if(hora > 18 && hora < 23){
            System.out.println("Bom descanso, " + nome + "!");
        }
    }
}