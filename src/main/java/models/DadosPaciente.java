package models;

import enums.*;
import importer.DadosImporter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "dados_paciente")
public class DadosPaciente {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_paciente_pk")
    private long pk;

    @Column(name = "sexo")
    @NonNull
    private TipoSexo sexo;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "idade")
    @NonNull
    private int idade;

    @Column(name = "tipo_idade")
    @NonNull
    private TipoIdade tipoIdade;

    @Column(name = "tipo_idade_gestacional")
    private TipoIdadeGestacional idadeGestacional;

    @Column(name = "raca")
    private TipoRaca raca;

    @Column(name = "etnia_indigena")
    private String etiniaIndigena;

    @Column(name = "escolaridade")
    private TipoEscolaridade escolaridade;

    @Column(name = "cod_classificacao_brasileira_ocupacao")
    private String codigoClassificacaoBrasileiraOcupacoes;

    @Column(name = "desc_classificacao_brasileira_ocupacao")
    private String descricaoClassificacaoBrasileiraOcupacoes;

    public DadosPaciente() {}

    public DadosPaciente(DadosImporter dadoImporter) throws ParseException {
        this.sexo = Objects.requireNonNull(TipoSexo.getByCodigo(dadoImporter.getSexo()));
        this.dataNascimento = dadoImporter.getDataNascimento().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataNascimento());
        this.idade = Integer.parseInt(dadoImporter.getIdade());
        this.tipoIdade = Objects.requireNonNull(TipoIdade.getByCodigo(dadoImporter.getTipoIdade()));
        this.idadeGestacional = TipoIdadeGestacional.getByCodigo(dadoImporter.getIdadeGestacional());
        this.raca = TipoRaca.getByCodigo(dadoImporter.getRaca());
        this.etiniaIndigena = dadoImporter.getEtiniaIndigena();
        this.escolaridade = TipoEscolaridade.getByCodigo(dadoImporter.getEscolaridade());
        this.codigoClassificacaoBrasileiraOcupacoes = dadoImporter.getCodigoClassificacaoBrasileiraOcupacoes();
        this.descricaoClassificacaoBrasileiraOcupacoes = dadoImporter.getDescricaoClassificacaoBrasileiraOcupacoes();
    }
}
