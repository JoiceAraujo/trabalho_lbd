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

    public static SimNaoIgnorado getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (Integer.parseInt(codigo)) {
            case 0:
                return NAO_PREENCHIDO;
            case 1:
                return SIM;
            case 2:
                return NAO;
            case 3:
                return OUTRO;
            case 9:
                return IGNORADO;
            default:
                return null;
        }
    }

    public static SimNaoIgnorado getValueBySigla(String sigla) {
        switch (sigla) {
            case "S":
                return SIM;
            case "N":
                return NAO;
            default:
                return IGNORADO;
        }
    }
}
