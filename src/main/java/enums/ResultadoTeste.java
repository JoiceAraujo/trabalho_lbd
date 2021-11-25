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

    public static ResultadoTeste getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return POSITIVO;
            case 2:
                return NEGATIVO;
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
