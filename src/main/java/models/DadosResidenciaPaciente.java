package models;

import enums.TipoZona;
import importer.DadosImporter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dados_residencia_paciente")
public class DadosResidenciaPaciente {
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dados_residencia_paciente_pk")
    private long pk;

    @Column(name = "uf_paciente")
    @NonNull
    private String ufPaciente;

    @Column(name = "nome_regional_saude")
    private String nomeRegionalSaudePaciente;

    @Column(name = "cod_regional_saude")
    private String codigoRegionalSaudePaciente;

    @Column(name = "nome_municipio")
    @NonNull
    private String nomeMunicipioPaciente;

    @Column(name = "cod_municipio")
    @NonNull
    private String codigoMunicipioPaciente;

    @Column(name = "zona")
    private TipoZona zona;

    @Column(name = "pais")
    @NonNull
    private String pais;

    @Column(name = "codigo_pais")
    @NonNull
    private String codigoPais;

    public DadosResidenciaPaciente() {}

    public DadosResidenciaPaciente(DadosImporter dadoImporter) {
        this.ufPaciente = Objects.requireNonNull(dadoImporter.getUfPaciente());
        this.nomeRegionalSaudePaciente = dadoImporter.getNomeRegionalSaudePaciente();
        this.codigoRegionalSaudePaciente = dadoImporter.getCodigoRegionalSaudePaciente();
        this.nomeMunicipioPaciente = Objects.requireNonNull(dadoImporter.getNomeMunicipioPaciente());
        this.codigoMunicipioPaciente = Objects.requireNonNull(dadoImporter.getCodigoMunicipioPaciente());
        this.zona = TipoZona.getByCodigo(dadoImporter.getZona());
        this.pais = Objects.requireNonNull(dadoImporter.getPais());
        this.codigoPais = Objects.requireNonNull(dadoImporter.getCodigoPais());
    }
}
