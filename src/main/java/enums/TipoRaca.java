package enums;

public enum TipoRaca {
    BRANCA (1, "Branca"),
    PRETA (2, "Preta"),
    AMARELA (3, "Amarela"),
    PARDA (4, "Parda"),
    INDIGENA (5, "Indigena"),
    IGNORADO(9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoRaca(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return BRANCA.getDescricao();
            case 2:
                return PRETA.getDescricao();
            case 3:
                return AMARELA.getDescricao();
            case 4:
                return PARDA.getDescricao();
            case 5:
                return INDIGENA.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
