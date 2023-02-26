public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta();
        //Ao invés do try/catch poderíamos ter usado um throws na assinatura do método
        try {
            c.deposita();
        } catch (MinhaExcecao e) {
            System.out.println("tratametno ...");
        }
    }
}
