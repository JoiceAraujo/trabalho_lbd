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

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return DETECTAVEL.getDescricao();
            case 2:
                return NAO_DETECTAVEL.getDescricao();
            case 3:
                return INCONCLUSIVO.getDescricao();
            case 4:
                return NAO_REALIZADO.getDescricao();
            case 5:
                return AGUARDANDO_RESULTADO.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
