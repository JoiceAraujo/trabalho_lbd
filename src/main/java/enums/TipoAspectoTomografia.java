package enums;

import lombok.Getter;

@Getter

public enum TipoAspectoTomografia {
    TIPICO_COVID_19 (1, "Tipico COVID-19"),
    INDETERMINADO_COVID_19 (2, "Indeterminado COVID-19"),
    ATIPICO_COVID_19 (3, "Atípico COVID-19"),
    NEGATIVO_PARA_PNEUMONIA (4, "Negativo para Pneumonia "),
    OUTRO (5, "Outro"),
    NAO_REALIZADO (6, "Não realizado"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoAspectoTomografia(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoAspectoTomografia getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return TIPICO_COVID_19;
            case 2:
                return INDETERMINADO_COVID_19;
            case 3:
                return ATIPICO_COVID_19;
            case 4:
                return NEGATIVO_PARA_PNEUMONIA;
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
