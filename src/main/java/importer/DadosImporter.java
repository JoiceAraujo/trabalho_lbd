package importer;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;

@Getter
public class DadosImporter {
    /* Dados da Ficha */

    @CsvBindByPosition(position = 0)
    private String dataPreenchimentoFichaNotificacao;

    @CsvBindByPosition(position = 1)
    private String semanaEpidemiologica;

    @CsvBindByPosition(position = 2)
    private String dataPrimeirosSintomas;

    @CsvBindByPosition(position = 3)
    private String semanaEpidemiologicaPrimeirosSintomas;

    @CsvBindByPosition(position = 4)
    private String ufPostoNotificacao;

    @CsvBindByPosition(position = 5)
    private String nomeRegionalSaude;

    @CsvBindByPosition(position = 6)
    private String codigoRegionalSaude;

    @CsvBindByPosition(position = 7)
    private String municipioPostoNotificacao;

    @CsvBindByPosition(position = 8)
    private String codigoIbgePostoNotificacao;

    @CsvBindByPosition(position = 9)
    private String nomeUnidadeSaudeNotificacao;

    @CsvBindByPosition(position = 10)
    private String codigoCnesPostoNotificacao;

    /* Dados do Paciente */

    @CsvBindByPosition(position = 11)
    private String sexo;

    @CsvBindByPosition(position = 12)
    private String dataNascimento;

    @CsvBindByPosition(position = 13)
    private String idade;

    @CsvBindByPosition(position = 14)
    private String tipoIdade;

    @CsvBindByPosition(position = 16)
    private String idadeGestacional;

    @CsvBindByPosition(position = 17)
    private String raca;

    @CsvBindByPosition(position = 18)
    private String etiniaIndigena;

    @CsvBindByPosition(position = 19)
    private String escolaridade;

    @CsvBindByPosition(position = 121)
    private String codigoClassificacaoBrasileiraOcupacoes;

    @CsvBindByPosition(position = 122)
    private String descricaoClassificacaoBrasileiraOcupacoes;

    /* Dados da Residencia do Paciente */

    @CsvBindByPosition(position = 22)
    private String ufPaciente;

    @CsvBindByPosition(position = 23)
    private String nomeRegionalSaudePaciente;

    @CsvBindByPosition(position = 24)
    private String codigoRegionalSaudePaciente;

    @CsvBindByPosition(position = 25)
    private String nomeMunicipioPaciente;

    @CsvBindByPosition(position = 26)
    private String codigoMunicipioPaciente;

    @CsvBindByPosition(position = 27)
    private String zona;

    @CsvBindByPosition(position = 20)
    private String pais;

    @CsvBindByPosition(position = 21)
    private String codigoPais;

    /* Dados Clinicos e Epidemiologicos */

    @CsvBindByPosition(position = 114)
    private String historicoViagemInternacional;

    @CsvBindByPosition(position = 115)
    private String paisViagem;

    @CsvBindByPosition(position = 116)
    private String codigoPaisViagem;

    @CsvBindByPosition(position = 117)
    private String localViagem;

    @CsvBindByPosition(position = 118)
    private String dataViagem;

    @CsvBindByPosition(position = 119)
    private String dataRetornoViagem;

    @CsvBindByPosition(position = 28)
    private String sgEvoluiuSrag;

    @CsvBindByPosition(position = 29)
    private String casoNosocomial;

    @CsvBindByPosition(position = 30)
    private String contatoAveSuinoOutro;

    @CsvBindByPosition(position = 123)
    private String outroAnimal;

    @CsvBindByPosition(position = 31)
    private String febre;

    @CsvBindByPosition(position = 32)
    private String tosse;

    @CsvBindByPosition(position = 33)
    private String dorGarganta;

    @CsvBindByPosition(position = 34)
    private String dispneia;

    @CsvBindByPosition(position = 35)
    private String desconfortoRespiratorio;

    @CsvBindByPosition(position = 36)
    private String saturacaoO2;

    @CsvBindByPosition(position = 37)
    private String diarreia;

    @CsvBindByPosition(position = 38)
    private String vomito;

    @CsvBindByPosition(position = 124)
    private String dorAbdominal;

    @CsvBindByPosition(position = 125)
    private String fadiga;

    @CsvBindByPosition(position = 126)
    private String perdaOfato;

    @CsvBindByPosition(position = 127)
    private String perdaPaladar;

    @CsvBindByPosition(position = 39)
    private String outrosSintomas;

    @CsvBindByPosition(position = 40)
    private String descricaoOutrosSintomas;

    @CsvBindByPosition(position = 41)
    private String puerpera;

    @CsvBindByPosition(position = 42)
    private String fatorDeRisco;

    @CsvBindByPosition(position = 43)
    private String doencaCardiovascular;

    @CsvBindByPosition(position = 44)
    private String doencaHematologica;

    @CsvBindByPosition(position = 45)
    private String sindromeDeDown;

    @CsvBindByPosition(position = 46)
    private String doencaHepatica;

    @CsvBindByPosition(position = 47)
    private String asma;

    @CsvBindByPosition(position = 48)
    private String diabetes;

    @CsvBindByPosition(position = 49)
    private String doencaNeurologica;

    @CsvBindByPosition(position = 50)
    private String pneumopatia;

    @CsvBindByPosition(position = 51)
    private String imunodeficiencia;

    @CsvBindByPosition(position = 52)
    private String doencaRenal;

    @CsvBindByPosition(position = 53)
    private String obesidade;

    @CsvBindByPosition(position = 54)
    private String imcPaciente;

    @CsvBindByPosition(position = 55)
    private String outrosFatoresRisco;

    @CsvBindByPosition(position = 56)
    private String descricaoFatoresRisco;

    @CsvBindByPosition(position = 57)
    private String vacinadoGripe;

    @CsvBindByPosition(position = 58)
    private String dataUltimaDoseVacinacaGripe;

    @CsvBindByPosition(position = 59)
    private String maeVacinada;

    @CsvBindByPosition(position = 60)
    private String dataVacinacaoMae;

    @CsvBindByPosition(position = 61)
    private String amamentando;

    @CsvBindByPosition(position = 62)
    private String dataDoseUnica;

    @CsvBindByPosition(position = 63)
    private String dataPrimeiraDose;

    @CsvBindByPosition(position = 64)
    private String dataSegundaDose;

    /* Dados do Atendimento */

    @CsvBindByPosition(position = 65)
    private String usouAntiviral;

    @CsvBindByPosition(position = 66)
    private String antiviralUtilizado;

    @CsvBindByPosition(position =67)
    private String descricaoOutroAntiviralUtilizado;

    @CsvBindByPosition(position = 68)
    private String dataInicioTratamento;

    @CsvBindByPosition(position = 69)
    private String houveInternacao;

    @CsvBindByPosition(position = 70)
    private String dataInternacaoSrag;

    @CsvBindByPosition(position = 71)
    private String ufInternacao;

    @CsvBindByPosition(position = 74)
    private String municipioInternacao;

    @CsvBindByPosition(position = 75)
    private String codigoIbgeInternacao;

    @CsvBindByPosition(position = 72)
    private String nomeRegionalInternacao;

    @CsvBindByPosition(position = 73)
    private String codigoRegionalInternacao;

    @CsvBindByPosition(position = 76)
    private String internadoUti;

    @CsvBindByPosition(position = 77)
    private String dataEntradaUti;

    @CsvBindByPosition(position = 78)
    private String dataSaidaUti;

    @CsvBindByPosition(position = 79)
    private String suporteVentilatorio;

    @CsvBindByPosition(position = 80)
    private String raioXTorax;

    @CsvBindByPosition(position = 81)
    private String descricaoRaioXToraxOutro;

    @CsvBindByPosition(position = 82)
    private String dataRaioX;

    @CsvBindByPosition(position = 128)
    private String aspectoTomografia;

    @CsvBindByPosition(position = 129)
    private String descricaoAspectoTomografiaOutro;

    @CsvBindByPosition(position = 130)
    private String dataTomografia;

    @CsvBindByPosition(position = 83)
    private String coletouAmostra;

    @CsvBindByPosition(position = 84)
    private String dataColeta;

    @CsvBindByPosition(position = 85)
    private String tipoAmostra;

    @CsvBindByPosition(position = 86)
    private String descricaoAmostraOutro;

    /* Dados laboratoriais */

    @CsvBindByPosition(position = 131)
    private String tipoTesteAntigenico;

    @CsvBindByPosition(position = 132)
    private String dataResultadoAntigeno;

    @CsvBindByPosition(position = 133)
    private String resultadoTesteAntigenico;

    @CsvBindByPosition(position = 134)
    private String testeAntigenicoPositivoInfluenza;

    @CsvBindByPosition(position = 135)
    private String anInfluenzaResultado;

    @CsvBindByPosition(position = 136)
    private String anPositivoOutrosVirus;

    @CsvBindByPosition(position = 137)
    private String anPositivoSarsCov2;

    @CsvBindByPosition(position = 138)
    private String anPositivoVirusSincicialRespiratorio;

    @CsvBindByPosition(position = 139)
    private String anPositivoParainfluenza1;

    @CsvBindByPosition(position = 140)
    private String anPositivoParainfluenza2;

    @CsvBindByPosition(position = 141)
    private String anPositivoParainfluenza3;

    @CsvBindByPosition(position = 142)
    private String anPositivoAdenovirus;

    @CsvBindByPosition(position = 143)
    private String anPositivoOutroVirus;

    @CsvBindByPosition(position = 144)
    private String anDescricaoOutroVirus;

    @CsvBindByPosition(position = 87)
    private String resultadoRTPCR;

    @CsvBindByPosition(position = 88)
    private String dataResultadoRTPCR;

    @CsvBindByPosition(position = 89)
    private String agenteRtPcrPositivoInfluenza;

    @CsvBindByPosition(position = 90)
    private String influenzaAgtRtPcr;

    @CsvBindByPosition(position = 91)
    private String subTipoInfluenzaA;

    @CsvBindByPosition(position = 92)
    private String descricaoSubTipoInfluenzaA;

    @CsvBindByPosition(position = 93)
    private String linhagemInfluenzaB;

    @CsvBindByPosition(position = 94)
    private String descricacaoLinhagemInfluenzaB;

    @CsvBindByPosition(position = 95)
    private String rtpcrPositivoOutrosVirus;

    @CsvBindByPosition(position = 120)
    private String rtpcrPositivoSarsCov2;

    @CsvBindByPosition(position = 96)
    private String rtpcrPositivoSincicialRespiratorio;

    @CsvBindByPosition(position = 97)
    private String rtpcrPositivoParainfluenza1;

    @CsvBindByPosition(position = 98)
    private String rtpcrPositivoParainfluenza2;

    @CsvBindByPosition(position = 99)
    private String rtpcrPositivoParainfluenza3;

    @CsvBindByPosition(position = 100)
    private String rtpcrPositivoParainfluenza4;

    @CsvBindByPosition(position = 101)
    private String rtpcrPositivoAdenovirus;

    @CsvBindByPosition(position = 102)
    private String rtpcrPositivoMetapneumovirus;

    @CsvBindByPosition(position = 103)
    private String rtpcrPositivoBocavirus;

    @CsvBindByPosition(position = 104)
    private String rtpcrPositivoRinovirus;

    @CsvBindByPosition(position = 105)
    private String rtpcrPositivoOutro;

    @CsvBindByPosition(position = 106)
    private String descricaoRtpcrOutro;

    @CsvBindByPosition(position = 145)
    private String tipoAmostraSarsCov2;

    @CsvBindByPosition(position = 146)
    private String descricaoAmostraSarsCov2;

    @CsvBindByPosition(position = 147)
    private String dataColetaAmostraSarsCov2;

    @CsvBindByPosition(position = 148)
    private String tipoSorologiaSarsCov2;

    @CsvBindByPosition(position = 149)
    private String descricaoOutroSorologiaSarsCov2;

    @CsvBindByPosition(position = 151)
    private String resultadoSarsCov2IgG;

    @CsvBindByPosition(position = 152)
    private String resultadoSarsCov2IgM;

    @CsvBindByPosition(position = 153)
    private String resultadoSarsCov2IgA;

    @CsvBindByPosition(position = 150)
    private String dataResultadoSarsCov2;

    /* Conclusão */

    @CsvBindByPosition(position = 107)
    private String classificacaoFinalCaso;

    @CsvBindByPosition(position = 108)
    private String outroAgenteSrag;

    @CsvBindByPosition(position = 109)
    private String criterioEncerramento;

    @CsvBindByPosition(position = 110)
    private String evolucaoCaso;

    @CsvBindByPosition(position = 111)
    private String dataAltaOuObito;

    @CsvBindByPosition(position = 112)
    private String dataEncerramento;
}
















