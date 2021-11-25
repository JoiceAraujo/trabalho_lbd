import importer.DadosImporter;
import importer.LeitorCsv;
import org.apache.commons.lang3.time.StopWatch;
import services.DadosFichaService;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String [] args) {
        LeitorCsv leitorCsv = new LeitorCsv();
        DadosFichaService dadosFichaService = new DadosFichaService();

        try {
            StopWatch lerCsvStopWatch = StopWatch.createStarted();
            List<DadosImporter> dados = leitorCsv.lerCsv();
            lerCsvStopWatch.stop();
            System.out.println("Tempo Ler CSV em minutos: " + lerCsvStopWatch.getTime(TimeUnit.MILLISECONDS));

            dadosFichaService.salvarDadosImportados(dados);
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
    }
}
