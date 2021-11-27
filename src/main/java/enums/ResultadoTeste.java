package enums;

import lombok.Getter;

@Getter

public enum ResultadoTeste {
    POSITIVO (1, "Positivo"),
    NEGATIVO (2, "Negativo"),
    INCONCLUSIVO (3, "Inconclusivo"),
    NAO_REALIZADO (4, "Não Realizado"),
    AGUARDANDO_RESULTADO (5, "Aguadando Resultado"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    ResultadoTeste(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return POSITIVO.getDescricao();
            case 2:
                return NEGATIVO.getDescricao();
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
