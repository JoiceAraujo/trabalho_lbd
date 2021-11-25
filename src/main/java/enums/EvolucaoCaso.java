package enums;

public enum EvolucaoCaso {
    CURA (1, "Cura"),
    OBITO (2, "Óbito"),
    OBITO_OUTRA_CAUSA (3, "Óbito por outras Causas"),
    IGNORADO(9, "Ignorado");

    private final int valor;
    private final String descricao;

    EvolucaoCaso(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static EvolucaoCaso getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return CURA;
            case 2:
                return OBITO;
            case 3:
                return OBITO_OUTRA_CAUSA;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }
}
