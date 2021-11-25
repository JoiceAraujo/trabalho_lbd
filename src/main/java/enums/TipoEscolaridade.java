package enums;

import lombok.Getter;

@Getter
public enum TipoEscolaridade {
    SEM_ESCOLARIDADE_ANALFABETO (0, "Sem escolaridade/Analfabeto"),
    FUNDAMENTAL_PRIMEIRO_CICLO (1, "Fundamental 1º ciclo (1ª a 5ª série)"),
    FUNDAMENTAL_SEGUNDO_CICLO (2, "Fundamental 2º ciclo (6ª a 9ª série)"),
    MEDIO (3, "Médio (1º ao 3º ano) "),
    SUPERIOR (4, "Superior"),
    NAO_SE_APLICA (5, "Não se aplica"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoEscolaridade(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoEscolaridade getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 0:
                return SEM_ESCOLARIDADE_ANALFABETO;
            case 1:
                return FUNDAMENTAL_PRIMEIRO_CICLO;
            case 2:
                return FUNDAMENTAL_SEGUNDO_CICLO;
            case 3:
                return MEDIO;
            case 4:
                return SUPERIOR;
            case 5:
                return NAO_SE_APLICA;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
