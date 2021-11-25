package models;

import enums.SimNaoIgnorado;
import importer.DadosImporter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "dados_clinicos_epidemiologicos")
public class DadosClinicosEpidemiologicos {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_clinicos_epidemiologicos_pk")
    private long pk;

    @Column(name = "historico_viagem_internacional")
    @NonNull
    private SimNaoIgnorado historicoViagemInternacional;

    @Column(name = "pais_viagem")

    private String paisViagem;

    @Column(name = "codigo_pais_viagem")
    private String codigoPaisViagem;

    @Column(name = "local_viagem")
    private String localViagem;

    @Column(name = "data_viagem")
    private Date dataViagem;

    @Column(name = "data_retorno_viagem")
    private Date dataRetornoViagem;

    @Column(name = "sg_evoluiu_srag")
    private SimNaoIgnorado sgEvoluiuSrag;

    @Column(name = "caso_nosocomial")
    private SimNaoIgnorado casoNosocomial;

    @Column(name = "contato_ave_suino_outro")
    private SimNaoIgnorado contatoAveSuinoOutro;

    @Column(name = "outro_animal")
    private String outroAnimal;

    @Column(name = "febre")
    private SimNaoIgnorado febre;

    @Column(name = "tosse")
    private SimNaoIgnorado tosse;

    @Column(name = "dor_garganta")
    private SimNaoIgnorado dorGarganta;

    @Column(name = "dispneia")
    private SimNaoIgnorado dispneia;

    @Column(name = "desconforto_respiratorio")
    private SimNaoIgnorado desconfortoRespiratorio;

    @Column(name = "saturacao_dioxigênio")
    private SimNaoIgnorado saturacaoO2;

    @Column(name = "diarreia")
    private SimNaoIgnorado diarreia;

    @Column(name = "vomito")
    private SimNaoIgnorado vomito;

    @Column(name = "dor_abdominal")
    private SimNaoIgnorado dorAbdominal;

    @Column(name = "fadiga")
    private SimNaoIgnorado fadiga;

    @Column(name = "perda_ofato")
    private SimNaoIgnorado perdaOfato;

    @Column(name = "perda_paladar")
    private SimNaoIgnorado perdaPaladar;

    @Column(name = "outros_sintomas")
    private SimNaoIgnorado outrosSintomas;

    @Column(name = "descricao_outros_sintomas")
    private String descricaoOutrosSintomas;

    @Column(name = "puerpera")
    private SimNaoIgnorado puerpera;

    @Column(name = "fator_de_risco")
    private SimNaoIgnorado fatorDeRisco;

    @Column(name = "doenca_cardiovascular")
    private SimNaoIgnorado doencaCardiovascular;

    @Column(name = "doenca_hematologica")
    private SimNaoIgnorado doencaHematologica;

    @Column(name = "sindrome_de_down")
    private SimNaoIgnorado sindromeDeDown;

    @Column(name = "doenca_hepatica")
    private SimNaoIgnorado doencaHepatica;

    @Column(name = "asma")
    private SimNaoIgnorado asma;

    @Column(name = "diabetes")
    private SimNaoIgnorado diabetes;

    @Column(name = "doenca_neurologica")
    private SimNaoIgnorado doencaNeurologica;

    @Column(name = "pneumopatia")
    private SimNaoIgnorado pneumopatia;

    @Column(name = "imunodeficiencia")
    private SimNaoIgnorado imunodeficiencia;

    @Column(name = "doenca_renal")
    private SimNaoIgnorado doencaRenal;

    @Column(name = "obesidade")
    private SimNaoIgnorado obesidade;

    @Column(name = "imc_paciente")
    private String imcPaciente;

    @Column(name = "outros_fatores_risco")
    private SimNaoIgnorado outrosFatoresRisco;

    @Column(name = "descricao_fatores_risco")
    private String descricaoFatoresRisco;

    @Column(name = "vacinado_gripe")
    private SimNaoIgnorado vacinadoGripe;

    @Column(name = "data_ultima_dose_vacinaca_gripe")
    private Date dataUltimaDoseVacinacaGripe;

    @Column(name = "mae_vacinada")
    private SimNaoIgnorado maeVacinada;

    @Column(name = "data_vacinacao_mae")
    private Date dataVacinacaoMae;

    @Column(name = "amamentando")
    private SimNaoIgnorado amamentando;

    @Column(name = "data_dose_unica")
    private Date dataDoseUnica;

    @Column(name = "data_primeira_dose")
    private Date dataPrimeiraDose;

    @Column(name = "data_segunda_dose")
    private Date dataSegundaDose;

    public DadosClinicosEpidemiologicos(DadosImporter dadosImporter) throws ParseException {
        this.historicoViagemInternacional = Objects.requireNonNull(SimNaoIgnorado.getByCodigo(dadosImporter.getHistoricoViagemInternacional()));
        this.paisViagem = dadosImporter.getPaisViagem();
        this.codigoPaisViagem = dadosImporter.getCodigoPaisViagem();
        this.localViagem = dadosImporter.getLocalViagem();
        this.dataViagem = dadosImporter.getDataViagem().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataViagem());
        this.dataRetornoViagem = dadosImporter.getDataRetornoViagem().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataRetornoViagem());
        this.sgEvoluiuSrag = SimNaoIgnorado.getByCodigo(dadosImporter.getSgEvoluiuSrag());
        this.casoNosocomial = SimNaoIgnorado.getByCodigo(dadosImporter.getCasoNosocomial());
        this.contatoAveSuinoOutro = SimNaoIgnorado.getByCodigo(dadosImporter.getContatoAveSuinoOutro());
        this.outroAnimal = dadosImporter.getOutroAnimal();
        this.febre = SimNaoIgnorado.getByCodigo(dadosImporter.getFebre());
        this.tosse = SimNaoIgnorado.getByCodigo(dadosImporter.getTosse());
        this.dorGarganta = SimNaoIgnorado.getByCodigo(dadosImporter.getDorGarganta());
        this.dispneia = SimNaoIgnorado.getByCodigo(dadosImporter.getDispneia());
        this.desconfortoRespiratorio = SimNaoIgnorado.getByCodigo(dadosImporter.getDesconfortoRespiratorio());
        this.saturacaoO2 = SimNaoIgnorado.getByCodigo(dadosImporter.getSaturacaoO2());
        this.diarreia = SimNaoIgnorado.getByCodigo(dadosImporter.getDiarreia());
        this.vomito = SimNaoIgnorado.getByCodigo(dadosImporter.getVomito());
        this.dorAbdominal = SimNaoIgnorado.getByCodigo(dadosImporter.getDorAbdominal());
        this.fadiga = SimNaoIgnorado.getByCodigo(dadosImporter.getFadiga());
        this.perdaOfato = SimNaoIgnorado.getByCodigo(dadosImporter.getPerdaOfato());
        this.perdaPaladar = SimNaoIgnorado.getByCodigo(dadosImporter.getPerdaPaladar());
        this.outrosSintomas = SimNaoIgnorado.getByCodigo(dadosImporter.getOutrosSintomas());
        this.descricaoOutrosSintomas = dadosImporter.getDescricaoOutrosSintomas();
        this.puerpera = SimNaoIgnorado.getByCodigo(dadosImporter.getPuerpera());
        this.fatorDeRisco = SimNaoIgnorado.getValueBySigla(dadosImporter.getFatorDeRisco());
        this.doencaCardiovascular = SimNaoIgnorado.getByCodigo(dadosImporter.getDoencaCardiovascular());
        this.doencaHematologica = SimNaoIgnorado.getByCodigo(dadosImporter.getDoencaHematologica());
        this.sindromeDeDown = SimNaoIgnorado.getByCodigo(dadosImporter.getSindromeDeDown());
        this.doencaHepatica = SimNaoIgnorado.getByCodigo(dadosImporter.getDoencaHepatica());
        this.asma = SimNaoIgnorado.getByCodigo(dadosImporter.getAsma());
        this.diabetes = SimNaoIgnorado.getByCodigo(dadosImporter.getDiabetes());
        this.doencaNeurologica = SimNaoIgnorado.getByCodigo(dadosImporter.getDoencaNeurologica());
        this.pneumopatia = SimNaoIgnorado.getByCodigo(dadosImporter.getPneumopatia());
        this.imunodeficiencia = SimNaoIgnorado.getByCodigo(dadosImporter.getImunodeficiencia());
        this.doencaRenal = SimNaoIgnorado.getByCodigo(dadosImporter.getDoencaRenal());
        this.obesidade = SimNaoIgnorado.getByCodigo(dadosImporter.getObesidade());
        this.imcPaciente = dadosImporter.getImcPaciente();
        this.outrosFatoresRisco = SimNaoIgnorado.getByCodigo(dadosImporter.getOutrosFatoresRisco());
        this.descricaoFatoresRisco = dadosImporter.getDescricaoFatoresRisco();
        this.vacinadoGripe = SimNaoIgnorado.getByCodigo(dadosImporter.getVacinadoGripe());
        this.dataUltimaDoseVacinacaGripe = dadosImporter.getDataUltimaDoseVacinacaGripe().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataUltimaDoseVacinacaGripe());
        this.maeVacinada = SimNaoIgnorado.getByCodigo(dadosImporter.getMaeVacinada());
        this.dataVacinacaoMae = dadosImporter.getDataVacinacaoMae().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataVacinacaoMae());
        this.amamentando = SimNaoIgnorado.getByCodigo(dadosImporter.getAmamentando());
        this.dataDoseUnica = dadosImporter.getDataDoseUnica().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataDoseUnica());
        this.dataPrimeiraDose = dadosImporter.getDataPrimeiraDose().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataPrimeiraDose());
        this.dataSegundaDose = dadosImporter.getDataSegundaDose().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataSegundaDose());
    }

    public DadosClinicosEpidemiologicos() {

    }
}
