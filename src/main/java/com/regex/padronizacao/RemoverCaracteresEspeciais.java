package com.regex.padronizacao;

public class RemoverCaracteresEspeciais {
    public static void main(String[] args) {

        String sentenca = "!A@9#B$8%C7¨&D*4(e)5¹f²6³g£3¢h¬2I1J";

        System.out.println("Sentença antes: " + sentenca);

        //o '^' fala para o replaceAll "remova tudo que não for isso -> (sentença)"
        sentenca = sentenca.replaceAll("[^a-zA-Z0-9]","");

        System.out.println("Sentença depois: " + sentenca);


    }
}
