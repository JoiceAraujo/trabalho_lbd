package enums;

import lombok.Getter;

@Getter

public enum TipoTesteAntigenoViral {
    IMUNOFLUORESCENCIA_IF (1, "Imunofluorescência (IF)"),
    TESTE_RAPIDO_ANTIGENICO (2, "Teste rápido antigênico");

    private final int valor;
    private final String descricao;

    TipoTesteAntigenoViral(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static TipoTesteAntigenoViral getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return IMUNOFLUORESCENCIA_IF;
            case 2:
                return TESTE_RAPIDO_ANTIGENICO;
            default:
                return null;
        }
    }
}
