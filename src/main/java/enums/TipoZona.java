package enums;

import lombok.Getter;

@Getter

public enum TipoZona {
    URBANA (1, "Urbana"),
    RURAL (2, "Rural"),
    PERIURBANA (3, "Periurbana"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoZona(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoZona getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return URBANA;
            case 2:
                return RURAL;
            case 3:
                return PERIURBANA;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
