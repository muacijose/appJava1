public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: top Gun: Maverick");

        int anoDeLancamento  = 2022;
        System.out.println("AnoDeLancamento: " + anoDeLancamento);
        boolean incluindoNoPLano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3 ;
        System.out.println(media);

        String sinopse;
        sinopse = """
                   Filme Top Gun
                   Filme de aventura de Tom Cruise";
                   Muito bom!
                   Ano de Lançamento
                   """ + anoDeLancamento;
        System.out.println(sinopse);

        int classification;
        classification = (int) media / 2 ;
        System.out.println(classification);

    }
}