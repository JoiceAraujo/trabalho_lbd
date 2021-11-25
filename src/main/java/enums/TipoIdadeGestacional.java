package enums;

import lombok.Getter;

@Getter
public enum TipoIdadeGestacional {
    PRIMEIRO_TRIMESTRE (1, "1º Trimestre"),
    SEGUNDO_TRIMESTR (2, "2º Trimestre"),
    TERCEIRO_TRIMESTRE (3, "3º Trimestre"),
    IDADE_GESTACIONAL_IGNORADA (4, "-Idade Gestacional Ignorada"),
    NAO (5, "Não"),
    NAO_SE_APLICA (6, "Não se aplica"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoIdadeGestacional(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoIdadeGestacional getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return PRIMEIRO_TRIMESTRE;
            case 2:
                return SEGUNDO_TRIMESTR;
            case 3:
                return TERCEIRO_TRIMESTRE;
            case 4:
                return IDADE_GESTACIONAL_IGNORADA;
            case 5:
                return NAO;
            case 6:
                return NAO_SE_APLICA;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
