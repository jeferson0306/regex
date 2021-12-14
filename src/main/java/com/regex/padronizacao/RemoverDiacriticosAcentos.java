package com.regex.padronizacao;

public class RemoverDiacriticosAcentos {

    public static void main(String[] args) {

        String palavraSemAcento = "ÁÈÎÕÛ´~`";

        System.out.println("Palavra sem acento antes: " + palavraSemAcento);

        palavraSemAcento = palavraSemAcento.replaceAll("[ ]", "");

        System.out.println("Palavra sem acento depois: " + palavraSemAcento);


    }
}
