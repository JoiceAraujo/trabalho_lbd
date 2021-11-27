package enums;

import lombok.Getter;

@Getter

public enum TipoIdade {
    DIA (1, "Dia"),
    MES (2, "Mês"),
    ANO (3, "Ano");

    private final int valor;
    private final String descricao;

    TipoIdade(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return DIA.getDescricao();
            case 2:
                return MES.getDescricao();
            case 3:
                return ANO.getDescricao();
            default:
                return null;
        }
    }
}
