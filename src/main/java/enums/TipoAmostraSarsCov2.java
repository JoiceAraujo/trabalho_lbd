package enums;

import lombok.Getter;

@Getter

public enum TipoAmostraSarsCov2 {
    SANGUE_PLASMA_SORO (1, "Sangue/plasma/soro"),
    OUTRO (2, "Outro"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoAmostraSarsCov2(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoAmostraSarsCov2 getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return SANGUE_PLASMA_SORO;
            case 2:
                return OUTRO;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
