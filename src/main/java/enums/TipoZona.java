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

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return URBANA.getDescricao();
            case 2:
                return RURAL.getDescricao();
            case 3:
                return PERIURBANA.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
