package enums;

import lombok.Getter;

@Getter

public enum TipoUsoSuporteVentilatorio {
    SIM_INVASIVO (1, "Sim, invasivo"),
    SIM_NAO_INVASIVO (2, "Sim, não invasivo"),
    NAO (3,"Não"),
    IGNORADO (9, "Ignorado");

    private final int valor;
    private final String descricao;

    TipoUsoSuporteVentilatorio(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 1:
                return SIM_INVASIVO.getDescricao();
            case 2:
                return SIM_NAO_INVASIVO.getDescricao();
            case 3:
                return NAO.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
