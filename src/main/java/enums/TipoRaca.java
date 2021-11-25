package enums;

public enum TipoRaca {
    BRANCA (1),
    PRETA (2),
    AMARELA (3),
    PARDA (4),
    INDIGENA (5),
    IGNORADO(9);

    private final int valor;

    TipoRaca(int opcao) {
        this.valor = opcao;
    }

    public int getValor() {
        return this.valor;
    }

    public static TipoRaca getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return BRANCA;
            case 2:
                return PRETA;
            case 3:
                return AMARELA;
            case 4:
                return PARDA;
            case 5:
                return INDIGENA;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
