public class FluxoComTratamento {
    //Para exceções checked, ou temos que colocar um throws na assinatura ou colocar um trycatch
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { //Aqui utilizamos do multi-catch através do "|"(pipe), ao invés de vários blocos catch
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");

        throw new MinhaExcecao("deu muito errado"); // eu só posso dar "throw" em exceptions

//       ArithmeticException ex = new ArithmeticException("deu errado");
//       throw ex;
        //System.out.println("Fim do metodo2");
    }
}