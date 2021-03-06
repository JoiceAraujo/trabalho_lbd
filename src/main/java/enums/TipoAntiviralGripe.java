package enums;

import lombok.Getter;

@Getter

public enum TipoAntiviralGripe {
    OSELTAMIVIR (1, "Oseltamivir"),
    ZANAMIVIR (2, "Zanamivir"),
    OUTRO (3, "Outro");

    private final int valor;
    private final String descricao;

    TipoAntiviralGripe(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return OSELTAMIVIR.getDescricao();
            case 2:
                return ZANAMIVIR.getDescricao();
            case 3:
                return OUTRO.getDescricao();
            default:
                return null;
        }
    }
}
