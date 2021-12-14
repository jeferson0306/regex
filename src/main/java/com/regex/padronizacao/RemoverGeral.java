package com.regex.padronizacao;

import java.text.Normalizer;

public class RemoverGeral {

    public static String removeCaracteresEspeciais(String str) {
        return str.replaceAll("[^0-9aA-zZáéíóúàèìòùâêîôûãõçÁÉÍÓÚÀÈÌÒÙÂÊÎÔÛÃÕÇ\\s]", " ").trim();
    }

    public static String removeAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")
                .replaceAll("[(?<!^)\\'(?!$)]", "");
    }

}