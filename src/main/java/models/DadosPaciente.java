package models;

import enums.*;
import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "dados_paciente")
public class DadosPaciente {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_paciente_pk")
    private long pk;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "tipo_idade")
    private String tipoIdade;

    @Column(name = "tipo_idade_gestacional")
    private String idadeGestacional;

    @Column(name = "raca")
    private String raca;

    @Column(name = "etnia_indigena")
    private String etiniaIndigena;

    @Column(name = "escolaridade")
    private String escolaridade;

    @Column(name = "cod_classificacao_brasileira_ocupacao")
    private String codigoClassificacaoBrasileiraOcupacoes;

    @Column(name = "desc_classificacao_brasileira_ocupacao")
    private String descricaoClassificacaoBrasileiraOcupacoes;

    public DadosPaciente() {}

    public DadosPaciente(DadosImporter dadoImporter) throws ParseException {
        this.sexo = TipoSexo.getByCodigo(dadoImporter.getSexo());
        this.dataNascimento = dadoImporter.getDataNascimento().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataNascimento());
        this.idade = Integer.parseInt(dadoImporter.getIdade());
        this.tipoIdade = TipoIdade.getByCodigo(dadoImporter.getTipoIdade());
        this.idadeGestacional = TipoIdadeGestacional.getByCodigo(dadoImporter.getIdadeGestacional());
        this.raca = TipoRaca.getByCodigo(dadoImporter.getRaca());
        this.etiniaIndigena = dadoImporter.getEtiniaIndigena();
        this.escolaridade = TipoEscolaridade.getByCodigo(dadoImporter.getEscolaridade());
        this.codigoClassificacaoBrasileiraOcupacoes = dadoImporter.getCodigoClassificacaoBrasileiraOcupacoes();
        this.descricaoClassificacaoBrasileiraOcupacoes = dadoImporter.getDescricaoClassificacaoBrasileiraOcupacoes();
    }
}
