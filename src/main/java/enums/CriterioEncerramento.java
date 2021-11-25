package enums;

public enum CriterioEncerramento {
    LABORATORIAL (1, "Laboratorial"),
    CLINICO_EPIDEMIOLOGICO (2, "Clínico Epidemiológico"),
    CLINICO (3, "Clínico"),
    CLINICO_IMAGEM (4, "Clínico-Imagem");

    private final int valor;
    private final String descricao;

    CriterioEncerramento(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public int getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CriterioEncerramento getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return LABORATORIAL;
            case 2:
                return CLINICO_EPIDEMIOLOGICO;
            case 3:
                return CLINICO;
            case 4:
                return CLINICO_IMAGEM;
            default:
                return null;
        }
    }
}
