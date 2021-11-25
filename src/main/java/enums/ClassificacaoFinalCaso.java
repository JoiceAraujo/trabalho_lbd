package enums;

public enum ClassificacaoFinalCaso {
    SRAG_INFLUENZA (1, "SRAG por influenza"),
    SRAG_OUTRO_VIRUS (2, "SRAG por outro vírus respiratório"),
    SRAG_AGENTE_ETIOLOGICO (3, "SRAG por outro agente etiológico"),
    SRAG_NAO_ESPECIFICADO (4, "SRAG não especificado"),
    SRAG_COVID_19(5, "SRAG por COVID-19");

    private final int valor;
    private final String descricao;

    ClassificacaoFinalCaso(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static ClassificacaoFinalCaso getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return SRAG_INFLUENZA;
            case 2:
                return SRAG_OUTRO_VIRUS;
            case 3:
                return SRAG_AGENTE_ETIOLOGICO;
            case 4:
                return SRAG_NAO_ESPECIFICADO;
            case 5:
                return SRAG_COVID_19;
            default:
                return null;
        }
    }
}
