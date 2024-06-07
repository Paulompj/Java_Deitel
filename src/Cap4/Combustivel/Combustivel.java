package Cap4.Combustivel;

import Cap4.Combustivel.Entidades.Viagem;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        int i = 0;
        double somaKmsTotal = 0.0;
        double somaCombustivelTotal = 0.0;
        ArrayList<Viagem> viagens = new ArrayList<>();
        while (escolha != 4){
            System.out.println("\t1- Cadastrar nova Viagem: \n\t2 - Vizualizar Viagens Cadastradas\n\t3 - Vizualizar Médias\n\t4 - Sair");
            System.out.print("Escolha: ");
            escolha = input.nextInt();
            input.nextLine();
            switch (escolha){
                case 1:
                    i+=1;
                    System.out.printf("\tViagem %d\n",i);
                    System.out.print("Digite quantos Km foram percorridos: ");
                    int km = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite quantidade de combustível gasto: ");
                    int comb = input.nextInt();
                    input.nextLine();
                    viagens.add(new Viagem(km,comb));
                    break;
                case 2:
                    if (viagens.isEmpty()){
                        System.out.println("Nenhuma viagem Cadastrada:");
                    }
                    else{
                        for(int j = 0; j < viagens.size(); j += 1){
                            System.out.printf("\tViagem %d: \n",j+1);
                            System.out.println(viagens.get(j).toString());
                        }
                    }
                    break;
                case 3:
                    if (viagens.isEmpty()){
                        System.out.println("Nenhuma viagem Cadastrada:");
                    }
                    else{
                        for(int f = 0; f < viagens.size(); f += 1){
                            somaCombustivelTotal += viagens.get(f).getCombustivelUtilizado();
                            somaKmsTotal += viagens.get(f).getKilometros();
                        }
                        System.out.println("Kilometros rodados: "+somaKmsTotal);
                        System.out.println("Combustivel total utilizado: "+somaCombustivelTotal);
                        double media = somaKmsTotal/somaCombustivelTotal;
                        System.out.printf("Media de Combustivel por Km: "+String.format("%.2f",media)+"\n");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
            }
        }
        input.close();
    }
}
