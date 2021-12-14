package com.regex.padronizacao;

public class RemoverEspacos {

    public static void main(String[] args) {

        String emailSemEspaco = "testando 1234 @ retirarEspacos . com";

        System.out.println("E-mail sem espaços antes: " + emailSemEspaco);

        emailSemEspaco = emailSemEspaco.replaceAll("[ ]", "");

        System.out.println("E-mail sem espaços depois: " + emailSemEspaco);
    }
}
