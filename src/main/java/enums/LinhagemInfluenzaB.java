package enums;

import lombok.Getter;

@Getter

public enum LinhagemInfluenzaB {
    VICTORIA (1, "Victoria"),
    YAMAGATHA (2, "Yamagatha"),
    NAO_REALIZADO (3, "Não realizado"),
    INCONCLUSIVO (4, "Inconclusivo"),
    OUTRO (5, "Outro");

    private final int valor;
    private final String descricao;

    LinhagemInfluenzaB(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return VICTORIA.getDescricao();
            case 2:
                return YAMAGATHA.getDescricao();
            case 3:
                return NAO_REALIZADO.getDescricao();
            case 4:
                return INCONCLUSIVO.getDescricao();
            case 5:
                return OUTRO.getDescricao();
            default:
                return null;
        }
    }
}
