package br.senai.sp.jandira.ds1t.media_alunos.model;

import java.util.Scanner;

public class MediaEscolar {

    String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double mediaDoAluno;
    String situacaoAluno;

    public void receberDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("***Calculadora De Média***");
        System.out.println("----------------------------------");

        System.out.print("Digite o nome do(a) aluno(a): ");
        nomeAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a Segunda Nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        calcularMedia();
    }

    public void calcularMedia(){


        mediaDoAluno = ( nota1 + nota2 + nota3 + nota4) / 4.0;

        if (mediaDoAluno >= 5){
            situacaoAluno ="Aprovado(a)";
        } else {
            situacaoAluno = "Reprovado(a)";
        }

        exibirResultado();
    }

    public void exibirResultado(){
        String mediaDoAlunoComDoisDecimais = String.format("%.2f", mediaDoAluno);
        System.out.println("CÁLCULANDO MÉDIA...");
        System.out.println("----------------------------------------");
        System.out.println("Média Do aluno: " + mediaDoAlunoComDoisDecimais);
        System.out.println("Resultado: O(a) aluno(a) " + nomeAluno + "está " + situacaoAluno + "!");
        System.out.println("***FINALIZANDO PROGRAMA***");
        System.out.println("-----------------------------------------");
    }
}






