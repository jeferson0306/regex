package com.regex.padronizacao;

public class RemoverLetras {
    public static void main(String[] args) {

        String telefone = "A9B8C7D4e5f6g3h2I1J";

        System.out.println("Telefone antes: " + telefone);

        telefone = telefone.replaceAll("[a-zA-Z]","");

        System.out.println("Telefone depois: " + telefone);


    }
}
