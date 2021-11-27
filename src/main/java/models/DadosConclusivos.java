package models;

import enums.ClassificacaoFinalCaso;
import enums.CriterioEncerramento;
import enums.EvolucaoCaso;
import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "dados_conclusivos")
public class DadosConclusivos {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_conclusivos_pk")
    private long pk;

    @Column(name = "classificacao_final_caso")
    private String classificacaoFinalCaso;

    @Column(name = "outro_agente_srag")
    private String outroAgenteSrag;

    @Column(name = "criterio_encerramento")
    private String criterioEncerramento;

    @Column(name = "evolucao_caso")
    private String evolucaoCaso;

    @Column(name = "data_alta_ou_obito")
    private Date dataAltaOuObito;

    @Column(name = "data_encerramento")
    private Date dataEncerramento;

    public DadosConclusivos() {}

    public DadosConclusivos(DadosImporter dadoImporter) throws ParseException {
        this.classificacaoFinalCaso = ClassificacaoFinalCaso.getByCodigo(dadoImporter.getClassificacaoFinalCaso());
        this.outroAgenteSrag = dadoImporter.getOutroAgenteSrag();
        this.criterioEncerramento = CriterioEncerramento.getByCodigo(dadoImporter.getCriterioEncerramento());
        this.evolucaoCaso = EvolucaoCaso.getByCodigo(dadoImporter.getEvolucaoCaso());
        this.dataAltaOuObito = dadoImporter.getDataAltaOuObito().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataAltaOuObito());
        this.dataEncerramento = dadoImporter.getDataEncerramento().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataEncerramento());
    }
}
