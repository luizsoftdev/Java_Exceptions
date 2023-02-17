public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    //Classes que herdam de Error são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de Error.
    private static void metodo2() {
        System.out.println("Ini do metodo 2");
        metodo2(); // Essa recursão vai gerar um erro de StackOverflowError que é um erro da máquina virtual para informar que a pilha de execução não tem mais memória.
        System.out.println("Fim do metodo 2");
    }
}