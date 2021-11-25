package enums;

import lombok.Getter;

@Getter

public enum TiposInfluenza {
    INFLUENZA_A (1, "Influenza A"),
    INFLUENZA_B (2, "Influenza B");

    private final int valor;
    private final String descricao;

    TiposInfluenza(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TiposInfluenza getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return INFLUENZA_A;
            case 2:
                return INFLUENZA_B;
            default:
                return null;
        }
    }
}
