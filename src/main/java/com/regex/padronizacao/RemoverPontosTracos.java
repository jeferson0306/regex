package com.regex.padronizacao;

public class RemoverPontosTracos {

    public static void main(String[] args) {

        String cpf = "123.456.789-01";

        System.out.println("CPF antes: " + cpf);

        cpf = cpf.replaceAll("\\.","").replaceAll("-", "");

        System.out.println("CPF depois: " + cpf);



    }
}
