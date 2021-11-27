import importer.DadosImporter;
import importer.LeitorCsv;
import services.DadosFichaService;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String [] args) {
        LeitorCsv leitorCsv = new LeitorCsv();
        DadosFichaService dadosFichaService = new DadosFichaService();

        try {
            System.out.println("Iniciando a leitura do arquivo INFLUD-15-11-2021.csv");
            List<DadosImporter> dados = leitorCsv.lerCsv();
            System.out.println("Finalizando a leitura do arquivo");

            System.out.println("Inicio - Salvar dados no banco");
            dadosFichaService.salvarDadosImportados(dados);
            System.out.println("Fim - Salvar dados no banco");
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
    }
}
