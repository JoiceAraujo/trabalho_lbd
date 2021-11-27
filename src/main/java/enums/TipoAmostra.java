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

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return SECRECAO_NASO_OROFARINGE.getDescricao();
            case 2:
                return LAVADO_BRONCO_ALVEOLAR.getDescricao();
            case 3:
                return TECIDO_POST_MORTEM.getDescricao();
            case 4:
                return OUTRO.getDescricao();
            case 5:
                return LCR.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
