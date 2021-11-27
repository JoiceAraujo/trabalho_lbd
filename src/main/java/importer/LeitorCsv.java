package importer;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class LeitorCsv {

    public List<DadosImporter> lerCsv() throws IOException {
        List<DadosImporter> dados = new LinkedList<>();
        try {
            dados.addAll(
                    new CsvToBeanBuilder(Files.newBufferedReader(Paths.get("INFLUD-15-11-2021.csv")))
                            .withType(DadosImporter.class)
                            .build()
                            .parse()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dados;
    }
}
