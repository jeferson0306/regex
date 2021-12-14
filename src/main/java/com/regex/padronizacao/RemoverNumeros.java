package com.regex.padronizacao;

public class RemoverNumeros {
    public static void main(String[] args) {

        String nome = "A9B8C7D4e5f6g3h2I1J";

        System.out.println("Nome antes: " + nome);

        nome = nome.replaceAll("[0-9]","");

        System.out.println("Nome depois: " + nome);


    }
}
