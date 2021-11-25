package enums;

import lombok.Getter;

@Getter

public enum ResultadoRtPcr {
    DETECTAVEL (1, "Detectável"),
    NAO_DETECTAVEL (2, "Não Detectável"),
    INCONCLUSIVO (3, "Inconclusivo"),
    NAO_REALIZADO (4, "Não realizado"),
    AGUARDANDO_RESULTADO (5, "Aguardando resultado"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    ResultadoRtPcr(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static ResultadoRtPcr getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return DETECTAVEL;
            case 2:
                return NAO_DETECTAVEL;
            case 3:
                return INCONCLUSIVO;
            case 4:
                return NAO_REALIZADO;
            case 5:
                return AGUARDANDO_RESULTADO;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
