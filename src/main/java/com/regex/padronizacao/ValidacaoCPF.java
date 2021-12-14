package com.regex.padronizacao;

public class ValidacaoCPF {
    public static void main(String[] args) {

        String CPF = "!A@9.#B$..8%;,C7¨&D*4-(e/)5¹\\f²:6³g£3¢h¬2I1J";

        //usuário ou cliente pode digitar errado qualquer outro caracter diferente de números
        System.out.println("CPF sem formatação: " + CPF);

        //esse regex recusa tudo que for diferente de números de 0 a 9
        CPF = CPF.replaceAll("[^0-9]+","");

        System.out.println("CPF depois: " + CPF);
    }
}
