package models;

import enums.*;
import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "dados_laboratoriais")
public class DadosLaboratoriais {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_laboratoriais_pk")
    private long pk;

    @Column(name = "tipo_teste_antigenico")
    private String tipoTesteAntigenico;

    @Column(name = "data_resultado_antigeno")
    private Date dataResultadoAntigeno;

    @Column(name = "resultado_teste_antigenico")
    private String resultadoTesteAntigenico;

    @Column(name = "teste_antigenico_positivo_influenza")
    private String testeAntigenicoPositivoInfluenza;

    @Column(name = "an_influenza_resultado")
    private String anInfluenzaResultado;

    @Column(name = "an_positivo_outros_virus")
    private String anPositivoOutrosVirus;

    @Column(name = "an_positivo_sars_cov2")
    private String anPositivoSarsCov2;

    @Column(name = "an_positivo_virus_sincicial_respiratorio")
    private String anPositivoVirusSincicialRespiratorio;

    @Column(name = "an_positivo_parainfluenza1")
    private String anPositivoParainfluenza1;

    @Column(name = "an_positivo_parainfluenza2")
    private String anPositivoParainfluenza2;

    @Column(name = "an_positivo_parainfluenza3")
    private String anPositivoParainfluenza3;

    @Column(name = "an_positivo_adenovirus")
    private String anPositivoAdenovirus;

    @Column(name = "an_positivo_outro_virus")
    private String anPositivoOutroVirus;

    @Column(name = "an_descricao_outro_virus")
    private String anDescricaoOutroVirus;

    @Column(name = "resultado_rtpcr")
    private String resultadoRTPCR;

    @Column(name = "data_resultado_rtpcr")
    private Date dataResultadoRTPCR;

    @Column(name = "agente_rtpcr_positivo_influenza")
    private String agenteRtPcrPositivoInfluenza;

    @Column(name = "influenza_agt_rtpcr")
    private String influenzaAgtRtPcr;

    @Column(name = "sub_tipo_influenza_a")
    private String subTipoInfluenzaA;

    @Column(name = "descricao_sub_tipo_influenza_a")
    private String descricaoSubTipoInfluenzaA;

    @Column(name = "linhagem_influenza_b")
    private String linhagemInfluenzaB;

    @Column(name = "descricacao_linhagem_influenza_b")
    private String descricacaoLinhagemInfluenzaB;

    @Column(name = "rtpcr_positivo_outros_virus")
    private String rtpcrPositivoOutrosVirus;

    @Column(name = "rtpcr_positivo_sars_cov2")
    private String rtpcrPositivoSarsCov2;

    @Column(name = "rtpcr_positivo_sincicial_respiratorio")
    private String rtpcrPositivoSincicialRespiratorio;

    @Column(name = "rtpcr_positivo_parainfluenza1")
    private String rtpcrPositivoParainfluenza1;

    @Column(name = "rtpcr_positivo_parainfluenza2")
    private String rtpcrPositivoParainfluenza2;

    @Column(name = "rtpcr_positivo_parainfluenza3")
    private String rtpcrPositivoParainfluenza3;

    @Column(name = "rtpcr_positivo_parainfluenza4")
    private String rtpcrPositivoParainfluenza4;

    @Column(name = "rtpcr_positivo_adenovirus")
    private String rtpcrPositivoAdenovirus;

    @Column(name = "rtpcr_positivo_metapneumovirus")
    private String rtpcrPositivoMetapneumovirus;

    @Column(name = "rtpcr_positivo_bocavirus")
    private String rtpcrPositivoBocavirus;

    @Column(name = "rtpcr_positivo_rinovirus")
    private String rtpcrPositivoRinovirus;

    @Column(name = "rtpcr_positivo_outro")
    private String rtpcrPositivoOutro;

    @Column(name = "descricao_rtpcr_outro")
    private String descricaoRtpcrOutro;

    @Column(name = "tipo_amostra_sars_cov2")
    private String tipoAmostraSarsCov2;

    @Column(name = "descricao_amostra_sars_cov2")
    private String descricaoAmostraSarsCov2;

    @Column(name = "data_coleta_amostra_sars_cov2")
    private Date dataColetaAmostraSarsCov2;

    @Column(name = "tipo_sorologia_sars_cov2")
    private String tipoSorologiaSarsCov2;

    @Column(name = "descricao_outro_sorologia_sars_cov2")
    private String descricaoOutroSorologiaSarsCov2;

    @Column(name = "resultado_sars_cov2_igg")
    private String resultadoSarsCov2IgG;

    @Column(name = "resultado_sars_cov2_igm")
    private String resultadoSarsCov2IgM;

    @Column(name = "resultado_sars_cov2_iga")
    private String resultadoSarsCov2IgA;

    @Column(name = "data_resultado_sars_cov2")
    private Date dataResultadoSarsCov2;

    public DadosLaboratoriais(DadosImporter dadosImporter) throws ParseException {
        this.tipoTesteAntigenico = TipoTesteAntigenoViral.getByCodigo(dadosImporter.getTipoTesteAntigenico());
        this.dataResultadoAntigeno = dadosImporter.getDataResultadoAntigeno().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataResultadoAntigeno());
        this.resultadoTesteAntigenico = ResultadoTeste.getByCodigo(dadosImporter.getResultadoTesteAntigenico());
        this.testeAntigenicoPositivoInfluenza = SimNaoIgnorado.getByCodigo(dadosImporter.getTesteAntigenicoPositivoInfluenza());
        this.anInfluenzaResultado = TiposInfluenza.getByCodigo(dadosImporter.getAnInfluenzaResultado());
        this.anPositivoOutrosVirus = SimNaoIgnorado.getByCodigo(dadosImporter.getAnPositivoOutrosVirus());
        this.anPositivoSarsCov2 = dadosImporter.getAnPositivoSarsCov2();
        this.anPositivoVirusSincicialRespiratorio = dadosImporter.getAnPositivoVirusSincicialRespiratorio();
        this.anPositivoParainfluenza1 = dadosImporter.getAnPositivoParainfluenza1();
        this.anPositivoParainfluenza2 = dadosImporter.getAnPositivoParainfluenza2();
        this.anPositivoParainfluenza3 = dadosImporter.getAnPositivoParainfluenza3();
        this.anPositivoAdenovirus = dadosImporter.getAnPositivoAdenovirus();
        this.anPositivoOutroVirus = dadosImporter.getAnPositivoOutroVirus();
        this.anDescricaoOutroVirus = dadosImporter.getAnDescricaoOutroVirus();
        this.resultadoRTPCR = ResultadoRtPcr.getByCodigo(dadosImporter.getResultadoRTPCR());
        this.dataResultadoRTPCR = dadosImporter.getDataResultadoRTPCR().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataResultadoRTPCR());
        this.agenteRtPcrPositivoInfluenza = SimNaoIgnorado.getByCodigo(dadosImporter.getAgenteRtPcrPositivoInfluenza());
        this.influenzaAgtRtPcr = TiposInfluenza.getByCodigo(dadosImporter.getInfluenzaAgtRtPcr());
        this.subTipoInfluenzaA = SubTipoInfluenzaA.getByCodigo(dadosImporter.getDescricaoSubTipoInfluenzaA());
        this.descricaoSubTipoInfluenzaA = dadosImporter.getDescricaoSubTipoInfluenzaA();
        this.linhagemInfluenzaB = LinhagemInfluenzaB.getByCodigo(dadosImporter.getLinhagemInfluenzaB());
        this.descricacaoLinhagemInfluenzaB = dadosImporter.getDescricacaoLinhagemInfluenzaB();
        this.rtpcrPositivoOutrosVirus = SimNaoIgnorado.getByCodigo(dadosImporter.getRtpcrPositivoOutrosVirus());
        this.rtpcrPositivoSarsCov2 = dadosImporter.getRtpcrPositivoSarsCov2();
        this.rtpcrPositivoSincicialRespiratorio = dadosImporter.getRtpcrPositivoSincicialRespiratorio();
        this.rtpcrPositivoParainfluenza1 = dadosImporter.getRtpcrPositivoParainfluenza1();
        this.rtpcrPositivoParainfluenza2 = dadosImporter.getRtpcrPositivoParainfluenza2();
        this.rtpcrPositivoParainfluenza3 = dadosImporter.getRtpcrPositivoParainfluenza3();
        this.rtpcrPositivoParainfluenza4 = dadosImporter.getRtpcrPositivoParainfluenza4();
        this.rtpcrPositivoAdenovirus = dadosImporter.getRtpcrPositivoAdenovirus();
        this.rtpcrPositivoMetapneumovirus = dadosImporter.getRtpcrPositivoMetapneumovirus();
        this.rtpcrPositivoBocavirus = dadosImporter.getRtpcrPositivoBocavirus();
        this.rtpcrPositivoRinovirus = dadosImporter.getRtpcrPositivoRinovirus();
        this.rtpcrPositivoOutro = dadosImporter.getRtpcrPositivoOutro();
        this.descricaoRtpcrOutro = dadosImporter.getDescricaoRtpcrOutro();
        this.tipoAmostraSarsCov2 = TipoAmostraSarsCov2.getByCodigo(dadosImporter.getTipoAmostraSarsCov2());
        this.descricaoAmostraSarsCov2 = dadosImporter.getDescricaoAmostraSarsCov2();
        this.dataColetaAmostraSarsCov2 = dadosImporter.getDataColetaAmostraSarsCov2().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataColetaAmostraSarsCov2());
        this.tipoSorologiaSarsCov2 = TipoSorologiaSarsCov2.getByCodigo(dadosImporter.getTipoSorologiaSarsCov2());
        this.descricaoOutroSorologiaSarsCov2 = dadosImporter.getDescricaoOutroSorologiaSarsCov2();
        this.resultadoSarsCov2IgG = dadosImporter.getResultadoSarsCov2IgG();
        this.resultadoSarsCov2IgM = dadosImporter.getResultadoSarsCov2IgM();
        this.resultadoSarsCov2IgA = dadosImporter.getResultadoSarsCov2IgA();
        this.dataResultadoSarsCov2 = dadosImporter.getDataResultadoSarsCov2().isEmpty() ? null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataResultadoSarsCov2());
    }

    public DadosLaboratoriais() {}
}
