package com.regex.padronizacao;

public class RemoverPontos {

    public static void main(String[] args) {

        String cpf = "123.456.789-01";

        System.out.println("CPF antes: " + cpf);

        cpf = cpf.replaceAll("\\.","");

        System.out.println("CPF depois: " + cpf);



    }
}
