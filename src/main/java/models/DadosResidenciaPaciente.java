package models;

import enums.TipoZona;
import importer.DadosImporter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "dados_residencia_paciente")
public class DadosResidenciaPaciente {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_residencia_paciente_pk")
    private long pk;

    @Column(name = "uf_paciente")
    private String ufPaciente;

    @Column(name = "nome_regional_saude")
    private String nomeRegionalSaudePaciente;

    @Column(name = "cod_regional_saude")
    private String codigoRegionalSaudePaciente;

    @Column(name = "nome_municipio")
    private String nomeMunicipioPaciente;

    @Column(name = "cod_municipio")
    private String codigoMunicipioPaciente;

    @Column(name = "zona")
    private String zona;

    @Column(name = "pais")
    private String pais;

    @Column(name = "codigo_pais")
    private String codigoPais;

    public DadosResidenciaPaciente() {}

    public DadosResidenciaPaciente(DadosImporter dadoImporter) {
        this.ufPaciente = dadoImporter.getUfPaciente();
        this.nomeRegionalSaudePaciente = dadoImporter.getNomeRegionalSaudePaciente();
        this.codigoRegionalSaudePaciente = dadoImporter.getCodigoRegionalSaudePaciente();
        this.nomeMunicipioPaciente = dadoImporter.getNomeMunicipioPaciente();
        this.codigoMunicipioPaciente = dadoImporter.getCodigoMunicipioPaciente();
        this.zona = TipoZona.getByCodigo(dadoImporter.getZona());
        this.pais = dadoImporter.getPais();
        this.codigoPais = dadoImporter.getCodigoPais();
    }
}
