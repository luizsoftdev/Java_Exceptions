public class TesteConexao {

    public static void main(String[] args) {

        //try-with-resources
        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch(IllegalStateException e){
            System.out.println("Deu erro na conexao");
        }


        //-----------------------------------------------

//        Conexao con = null;
//        try{
//            con = new Conexao();
//            con.leDados();
//
//        } catch(IllegalStateException e){
//            System.out.println("Deu erro na conexao");
//        } finally {
//            System.out.println("finally");
//            if(con!=null){
//                con.fecha();
//            }
//
//        }
    }
}
;