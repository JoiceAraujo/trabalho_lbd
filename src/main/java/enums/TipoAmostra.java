package enums;

import lombok.Getter;

@Getter

public enum TipoAmostra {
    SECRECAO_NASO_OROFARINGE (1, "Secreção de Naso-orofaringe"),
    LAVADO_BRONCO_ALVEOLAR (2, "Lavado Bronco-alveolar"),
    TECIDO_POST_MORTEM (3, "Tecidopost-mortem"),
    OUTRO (4, "Outro"),
    LCR (5, "LCR"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoAmostra(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoAmostra getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return SECRECAO_NASO_OROFARINGE;
            case 2:
                return LAVADO_BRONCO_ALVEOLAR;
            case 3:
                return TECIDO_POST_MORTEM;
            case 4:
                return OUTRO;
            case 5:
                return LCR;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
