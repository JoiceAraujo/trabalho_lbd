package models;

import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "dados_ficha")
public class DadosFicha {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_ficha_pk")
    private long pk;

    @Column(name = "data_preenchimento_ficha_notificacao")
    private Date dataPreenchimentoFichaNotificacao;

    @Column(name = "semana_epidemiologica")
    private String semanaEpidemiologica;

    @Column(name = "data_primeiros_sintomas")
    private Date dataPrimeirosSintomas;

    @Column(name = "semana_epidemiologica_primeiros_sintomas")
    private String semanaEpidemiologicaPrimeirosSintomas;

    @Column(name = "uf_posto_notificacao")
    private String ufPostoNotificacao;

    @Column(name = "nome_regional_saude")
    private String nomeRegionalSaude;

    @Column(name = "codigo_regional_saude")
    private String codigoRegionalSaude;

    @Column(name = "municipio_posto_notificacao")
    private String municipioPostoNotificacao;

    @Column(name = "codigo_ibge_posto_notificacao")
    private String codigoIbgePostoNotificacao;

    @Column(name = "nome_unidade_saude_notificacao")
    private String nomeUnidadeSaudeNotificacao;

    @Column(name = "codigo_cnes_posto_notificacao")
    private String codigoCnesPostoNotificacao;

    @OneToOne
    @JoinColumn(name = "dados_atendimento_pk", referencedColumnName = "dados_atendimento_pk")
    private DadosAtendimento dadosAtendimento;

    @OneToOne
    @JoinColumn(name = "dados_clinicos_epidemiologicos_pk", referencedColumnName = "dados_clinicos_epidemiologicos_pk")
    private DadosClinicosEpidemiologicos dadosClinicosEpidemiologicos;

    @OneToOne
    @JoinColumn(name = "dados_conclusivos_pk", referencedColumnName = "dados_conclusivos_pk")
    private DadosConclusivos dadosConclusivos;

    @OneToOne
    @JoinColumn(name = "dados_laboratoriais_pk", referencedColumnName = "dados_laboratoriais_pk")
    private DadosLaboratoriais dadosLaboratoriais;

    @OneToOne
    @JoinColumn(name = "dados_paciente_pk", referencedColumnName = "dados_paciente_pk")
    private DadosPaciente dadosPaciente;

    @OneToOne
    @JoinColumn(name = "dados_residencia_paciente_pk", referencedColumnName = "dados_residencia_paciente_pk")
    private DadosResidenciaPaciente dadosResidenciaPaciente;

    public DadosFicha(DadosImporter dadosImporter, DadosAtendimento dadosAtendimento,
                      DadosClinicosEpidemiologicos dadosClinicosEpidemiologicos, DadosConclusivos dadosConclusivos,
                      DadosLaboratoriais dadosLaboratoriais, DadosPaciente dadosPaciente,
                      DadosResidenciaPaciente dadosResidenciaPaciente) throws ParseException {
        this.dataPreenchimentoFichaNotificacao = dadosImporter.getDataPreenchimentoFichaNotificacao().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataPreenchimentoFichaNotificacao());
        this.semanaEpidemiologica = dadosImporter.getSemanaEpidemiologica();
        this.dataPrimeirosSintomas = dadosImporter.getDataPrimeirosSintomas().isEmpty() ?  null : new SimpleDateFormat("dd/MM/yyyy").parse(dadosImporter.getDataPrimeirosSintomas());
        this.semanaEpidemiologicaPrimeirosSintomas = dadosImporter.getSemanaEpidemiologicaPrimeirosSintomas();
        this.ufPostoNotificacao = dadosImporter.getUfPostoNotificacao();
        this.nomeRegionalSaude = dadosImporter.getNomeRegionalSaude();
        this.codigoRegionalSaude = dadosImporter.getCodigoRegionalSaude();
        this.municipioPostoNotificacao = dadosImporter.getMunicipioPostoNotificacao();
        this.codigoIbgePostoNotificacao = dadosImporter.getCodigoIbgePostoNotificacao();
        this.nomeUnidadeSaudeNotificacao = dadosImporter.getNomeUnidadeSaudeNotificacao();
        this.codigoCnesPostoNotificacao = dadosImporter.getCodigoCnesPostoNotificacao();
        this.dadosAtendimento = dadosAtendimento;
        this.dadosClinicosEpidemiologicos = dadosClinicosEpidemiologicos;
        this.dadosConclusivos = dadosConclusivos;
        this.dadosLaboratoriais = dadosLaboratoriais;
        this.dadosPaciente = dadosPaciente;
        this.dadosResidenciaPaciente = dadosResidenciaPaciente;
    }

    public DadosFicha() {}
}
