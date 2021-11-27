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

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return NORMAL.getDescricao();
            case 2:
                return INFILTRADO_INTERSTICIAL.getDescricao();
            case 3:
                return CONSOLIDACAO.getDescricao();
            case 4:
                return MISTO.getDescricao();
            case 5:
                return OUTRO.getDescricao();
            case 6:
                return NAO_REALIZADO.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
