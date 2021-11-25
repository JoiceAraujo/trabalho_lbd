package importer;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class LeitorCsv {

    public List<DadosImporter> lerCsv() throws IOException {
        List<DadosImporter> dados = new LinkedList<>();
        try {
            System.out.println(Paths.get("pessoas.csv"));

            Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));

            CsvToBean<DadosImporter> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(DadosImporter.class)
                    .build();

            dados.addAll(csvToBean.parse());



            if(!dados.isEmpty()) {
                int cont = 0;
                for (DadosImporter dado : dados) {
                    dado.setLinha(cont);
                    cont++;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return dados;
    }
}
