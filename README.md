## ⛏️✨ 1º Fase:

- Sistema já recebe interações do usuário.
- Entrada funciona sendo com espaços ou sem, letras maiúsculas ou minúsculas, conforme gif.
- A requisição é realizada com sucesso na API OMDB: https://www.omdbapi.com/
- Métodos não estão acumulados mais na **ScreenmatchApplication**, estão em classe separada e instanciadas.
- Porém, API_KEY ainda não está restrita.

Retorna com dados de **qualquer série ou filme** que você digitar, devido ao código abaixo:

    private Scanner leitor = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://omdbapi.com/?t=";
    private final String API_KEY = "&apikey=966897e1";

    public void exibeMenu() {
        System.out.println("Digite o nome da série: ");
        var serieEscolhida = leitor.nextLine();
        var json = consumo.obterDados(ENDERECO + serieEscolhida.replace(" ", "+") + API_KEY);
        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dadosSerie);
    }

- **Demonstração:**

<img src="https://github.com/AlianeAmaral/screenmatch/blob/main/gifs/01-fase-teste-entradas.gif" alt="01-fase-teste-entradas" style="width: 950px;">

##
