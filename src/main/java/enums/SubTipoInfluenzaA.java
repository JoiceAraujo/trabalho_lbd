package enums;

import lombok.Getter;

@Getter

public enum SubTipoInfluenzaA {
    INFLUENZA_A_H1N1_PDM09 (1, "Influenza A(H1N1)pdm09"),
    INFLUENZA_A_H3N2 (2, "Influenza A/H3N2"),
    INFLUENZA_A_NAO_SUBTIPADO (3, "Influenza A não subtipado"),
    INFLUENZA_A_NAO_SUBTIPAVEL (4, "Influenza A não subtipáve"),
    INCONCLUSIVO (5, "Inconclusivo"),
    OUTRO (6, "Outro");

    private final int valor;
    private final String descricao;

    SubTipoInfluenzaA(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return INFLUENZA_A_H1N1_PDM09.getDescricao();
            case 2:
                return INFLUENZA_A_H3N2.getDescricao();
            case 3:
                return INFLUENZA_A_NAO_SUBTIPADO.getDescricao();
            case 4:
                return INFLUENZA_A_NAO_SUBTIPAVEL.getDescricao();
            case 5:
                return INCONCLUSIVO.getDescricao();
            case 6:
                return OUTRO.getDescricao();
            default:
                return null;
        }
    }
}
