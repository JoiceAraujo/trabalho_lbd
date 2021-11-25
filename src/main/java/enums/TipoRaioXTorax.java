package enums;

import lombok.Getter;

@Getter

public enum TipoRaioXTorax {
    NORMAL (1, "Normal"),
    INFILTRADO_INTERSTICIAL (2, "Inflitrado intersticial"),
    CONSOLIDACAO (3, "Consolidação"),
    MISTO (4, "Misto"),
    OUTRO (5, "Outro"),
    NAO_REALIZADO (6, "Não realizado"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoRaioXTorax(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoRaioXTorax getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return NORMAL;
            case 2:
                return INFILTRADO_INTERSTICIAL;
            case 3:
                return CONSOLIDACAO;
            case 4:
                return MISTO;
            case 5:
                return OUTRO;
            case 6:
                return NAO_REALIZADO;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
