package models;

import enums.*;
import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "dados_atendimento")
public class DadosAtendimento {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_atendimento_pk")
    private long pk;

    @Column(name = "usou_antiviral")
    private String usouAntiviral;

    @Column(name = "tipo_antiviral_utilizado")
    private String antiviralUtilizado;

    @Column(name = "descricao_outro_antiviral")
    private String descricaoOutroAntiviralUtilizado;

    @Column(name = "data_inicio_tratamento")
    private Date dataInicioTratamento;

    @Column(name = "houve_internacao")
    private String houveInternacao;

    @Column(name = "data_internacao_srag")
    private Date dataInternacaoSrag;

    @Column(name = "uf_internacao")
    private String ufInternacao;

    @Column(name = "municipio_internacao")
    private String municipioInternacao;

    @Column(name = "codigo_ibge_internacao")
    private String codigoIbgeInternacao;

    @Column(name = "nome_regional_internacao")
    private String nomeRegionalInternacao;

    @Column(name = "codigo_regional_internacao")
    private String codigoRegionalInternacao;

    @Column(name = "internado_uti")
    private String internadoUti;

    @Column(name = "data_entrada_uti")
    private Date dataEntradaUti;

    @Column(name = "data_saida_uti")
    private Date dataSaidaUti;

    @Column(name = "tipo_suporte_ventilatorio")
    private String suporteVentilatorio;

    @Column(name = "tipo_raio_x_torax")
    private String raioXTorax;

    @Column(name = "descricao_raio_x_torax")
    private String descricaoRaioXToraxOutro;

    @Column(name = "data_raio_x")
    private Date dataRaioX;

    @Column(name = "aspecto_tomografia")
    private String aspectoTomografia;

    @Column(name = "descricao_aspecto_tomografia")
    private String descricaoAspectoTomografiaOutro;

    @Column(name = "data_tomografia")
    private Date dataTomografia;

    @Column(name = "coletou_amostra")
    private String coletouAmostra;

    @Column(name = "data_coleta")
    private Date dataColeta;

    @Column(name = "tipo_amostra")
    private String tipoAmostra;

    @Column(name = "descricao_amostra")
    private String descricaoAmostraOutro;

    public DadosAtendimento () {}

    public DadosAtendimento(DadosImporter dadoImporter) throws ParseException {
        this.usouAntiviral = SimNaoIgnorado.getByCodigo(dadoImporter.getUsouAntiviral());
        this.antiviralUtilizado = TipoAntiviralGripe.getByCodigo(dadoImporter.getAntiviralUtilizado());
        this.descricaoOutroAntiviralUtilizado = dadoImporter.getDescricaoOutroAntiviralUtilizado();
        this.dataInicioTratamento = dadoImporter.getDataInicioTratamento().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataInicioTratamento());
        this.houveInternacao = SimNaoIgnorado.getByCodigo(dadoImporter.getHouveInternacao());
        this.dataInternacaoSrag = dadoImporter.getDataInternacaoSrag().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataInternacaoSrag());
        this.ufInternacao = dadoImporter.getUfInternacao();
        this.municipioInternacao = dadoImporter.getMunicipioInternacao();
        this.codigoIbgeInternacao = dadoImporter.getCodigoIbgeInternacao();
        this.nomeRegionalInternacao = dadoImporter.getNomeRegionalInternacao();
        this.codigoRegionalInternacao = dadoImporter.getCodigoRegionalInternacao();
        this.internadoUti = SimNaoIgnorado.getByCodigo(dadoImporter.getInternadoUti());
        this.dataEntradaUti = dadoImporter.getDataEntradaUti().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataEntradaUti());
        this.dataSaidaUti = dadoImporter.getDataSaidaUti().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataSaidaUti());
        this.suporteVentilatorio = TipoUsoSuporteVentilatorio.getByCodigo(dadoImporter.getSuporteVentilatorio());
        this.raioXTorax = TipoRaioXTorax.getByCodigo(dadoImporter.getRaioXTorax());
        this.descricaoRaioXToraxOutro = dadoImporter.getDescricaoRaioXToraxOutro();
        this.dataRaioX = dadoImporter.getDataRaioX().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataRaioX());
        this.aspectoTomografia = TipoAspectoTomografia.getByCodigo(dadoImporter.getAspectoTomografia());
        this.descricaoAspectoTomografiaOutro = dadoImporter.getDescricaoAspectoTomografiaOutro();
        this.dataTomografia = dadoImporter.getDataTomografia().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataTomografia());
        this.coletouAmostra = SimNaoIgnorado.getByCodigo(dadoImporter.getColetouAmostra());
        this.dataColeta = dadoImporter.getDataColeta().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadoImporter.getDataColeta());
        this.tipoAmostra = TipoAmostra.getByCodigo(dadoImporter.getTipoAmostra());
        this.descricaoAmostraOutro = dadoImporter.getDescricaoAmostraOutro();
    }
}
