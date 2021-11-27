Integrante: Joice de Souza Araujo

Link apresentação do trabalho:

Link dump: https://drive.google.com/file/d/1pwgNfq4UHHsMdTSY94-MA7XcgzJJmSas/view?usp=sharing

Link arquivos trabalho:

Instruções: O projeto foi criado com a IDE IntelliJ IDEA, a linguagem utilizada é JAVA. O projeto possui suas dependências
gerenciadas pelo Maven. É necessário que o banco srag_db exista antes de executar a Main.java, assim como a estrutura das
tabelas que o compõe. Para isso, execute o scrip initial_database.sql (/src/main/java/scripts/initial_database.sql).
Esse scrip irá apagar o banco srag_db se ele existir, criar o banco e por fim a estrutura da tabela. Por favor, apague a
linha 0 do csv antes de importar, a que contém os labels das tabelas. O programa espera encontrar o arquivo INFLUD-15-11-2021.csv
na raiz do projeto


QUERIES
--  Quais os 3 sintomas mais comuns apresentados no dados para pacientes de SRAG?

select count(febre) febre, count(tosse) tosse, count(dor_garganta) dor_garganta, count(dispneia) dispneia,
       count(desconforto_respiratorio) desconforto_respiratorio, count(saturacao_dioxigênio) saturacao_dioxigênio,
       count(diarreia) diarreia, count(vomito) vomito, count(dor_abdominal) dor_abdominal, count(fadiga) fadiga,
       count(perda_ofato) perda_ofato, count(perda_paladar) perda_paladar, count(outros_sintomas) outros_sintomas
from dados_clinicos_epidemiologicos;

-- Dos pacientes que fizeram viagens, quais os 3 países de origem mais comuns nos dados?

select pais_viagem, count(pais_viagem) as ocorrencias from dados_clinicos_epidemiologicos
where historico_viagem_internacional = 'Sim'
group by pais_viagem
order by ocorrencias desc
limit 3;

-- Dos pacientes que fizeram o teste RT-PCR, quantos testaram positivo para SARS-CoV-2?

select count(*) from dados_laboratoriais
where resultado_rtpcr = 'Detectável' and rtpcr_positivo_outros_virus = 'Sim' and rtpcr_positivo_sars_cov2 = '1';

-- Quantos pacientes vieram a óbito?

select count(*) from dados_conclusivos where evolucao_caso = 'Óbito';

-- Quantos pacientes estavam internados em UTI?

select count(*) from dados_atendimento where internado_uti = 'Sim';



