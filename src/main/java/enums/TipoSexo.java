package enums;

import lombok.Getter;

@Getter
public enum TipoSexo {
    MASCULINO ("M", "Masculino"),
    FEMININO ("F", "Feminino"),
    IGNORADO ("9", "Ignorado");

    private final String valor;
    private final String descricao;

    TipoSexo(String opcao, String descricao) {
        this.valor = opcao;
        this.descricao = descricao;
    }

    public static String getByCodigo(String codigo) {
        if(codigo.isEmpty()) {
            return null;
        }

        switch (codigo) {
            case "M":
                return MASCULINO.getDescricao();
            case "F":
                return FEMININO.getDescricao();
            case "9":
                return IGNORADO.getDescricao();
            default:
                return null;
        }
    }
}
