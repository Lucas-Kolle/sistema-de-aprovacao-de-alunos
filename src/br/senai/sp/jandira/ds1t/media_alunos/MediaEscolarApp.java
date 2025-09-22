package br.senai.sp.jandira.ds1t.media_alunos;

import br.senai.sp.jandira.ds1t.media_alunos.model.MediaEscolar;

public class MediaEscolarApp {
    public static void main(String[] args) {
        System.out.println("Iniciano Programa...");

        MediaEscolar mediaEscolar = new MediaEscolar();
        mediaEscolar.receberDados();
    }
}
