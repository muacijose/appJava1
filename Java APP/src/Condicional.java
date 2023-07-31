public class Condicional {
    public static void main(String[] args){
        int anoLancamento= 2022;
        boolean incluindoNoPLano = false;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "plus";

        if (anoLancamento > 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        }else {
            System.out.println("Fime retrô que vale a apena assistir");
        }

        if (incluindoNoPLano == true || tipoDoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

    }
}
