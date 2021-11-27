package enums;

import lombok.Getter;

@Getter

public enum TipoSorologiaSarsCov2 {
    TESTE_RAPIDO (1, "Teste rápido"),
    ELISA (2, "Elisa"),
    QUIMILUMINESCENCIA (3, "Quimiluminescência"),
    OUTRO (4, "Outro");

    private final int valor;
    private final String descricao;

    TipoSorologiaSarsCov2(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return TESTE_RAPIDO.getDescricao();
            case 2:
                return ELISA.getDescricao();
            case 3:
                return QUIMILUMINESCENCIA.getDescricao();
            case 4:
                return OUTRO.getDescricao();
            default:
                return null;
        }
    }
}
