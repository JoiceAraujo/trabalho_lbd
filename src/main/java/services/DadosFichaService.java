package services;

import importer.DadosImporter;
import models.*;
import org.apache.commons.lang3.time.StopWatch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DadosFichaService {
    public void salvarDadosImportados(List<DadosImporter> dados) throws ParseException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SRAG-DB");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StopWatch salvarDados = StopWatch.createStarted();

        for(DadosImporter dado : dados) {
            DadosAtendimento dadoAtendimento = new DadosAtendimento(dado);
            DadosConclusivos dadoConclusivo = new DadosConclusivos(dado);
            DadosPaciente dadoPaciente = new DadosPaciente(dado);
            DadosResidenciaPaciente dadoResidenciaPaciente = new DadosResidenciaPaciente(dado);
            DadosClinicosEpidemiologicos dadoClinicoEpidemiologico = new DadosClinicosEpidemiologicos(dado);
            DadosLaboratoriais dadoLaboratorial = new DadosLaboratoriais(dado);

            try {
                dadoAtendimento = (DadosAtendimento) GenericService.salvar(dadoAtendimento, entityManager);
                dadoConclusivo = (DadosConclusivos) GenericService.salvar(dadoConclusivo, entityManager);
                dadoPaciente = (DadosPaciente) GenericService.salvar(dadoPaciente, entityManager);
                dadoResidenciaPaciente = (DadosResidenciaPaciente) GenericService.salvar(dadoResidenciaPaciente, entityManager);
                dadoClinicoEpidemiologico = (DadosClinicosEpidemiologicos) GenericService.salvar(dadoClinicoEpidemiologico, entityManager);
                dadoLaboratorial = (DadosLaboratoriais) GenericService.salvar(dadoLaboratorial, entityManager);

                DadosFicha dadoFicha = new DadosFicha(dado, dadoAtendimento, dadoClinicoEpidemiologico,
                        dadoConclusivo, dadoLaboratorial, dadoPaciente, dadoResidenciaPaciente);

                dadoFicha = (DadosFicha) GenericService.salvar(dadoFicha, entityManager);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        salvarDados.stop();
        System.out.println("Tempo Salvar Dados em minutos: " + salvarDados.getTime(TimeUnit.MILLISECONDS));
    }
}
