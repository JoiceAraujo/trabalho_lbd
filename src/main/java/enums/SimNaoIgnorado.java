package enums;

import lombok.Getter;

@Getter
public enum SimNaoIgnorado {
    SIM (1, "Sim"),
    NAO (2, "Não"),
    OUTRO (3, "Outro"),
    IGNORADO(9, "Ignorado"),
    NAO_PREENCHIDO(0, "Não preenchido");

    private final int valor;
    private final String descricao;

    SimNaoIgnorado(int opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 0:
                return NAO_PREENCHIDO.getDescricao();
            case 1:
                return SIM.getDescricao();
            case 2:
                return NAO.getDescricao();
            case 3:
                return OUTRO.getDescricao();
            case 9:
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }

    public static String getValueBySigla(String sigla) {
        switch (sigla) {
            case "S":
                return SIM.getDescricao();
            case "N":
                return NAO.getDescricao();
            default:
                return IGNORADO.getDescricao();
        }
    }
}
