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

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return PRIMEIRO_TRIMESTRE.getDescricao();
            case 2:
                return SEGUNDO_TRIMESTR.getDescricao();
            case 3:
                return TERCEIRO_TRIMESTRE.getDescricao();
            case 4:
                return IDADE_GESTACIONAL_IGNORADA.getDescricao();
            case 5:
                return NAO.getDescricao();
            case 6:
                return NAO_SE_APLICA.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
