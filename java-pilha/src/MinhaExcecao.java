
//Se extendemos da RuntimeException, temos uma exceção "unchecked" pelo compilador
//Se extendemos da Exception, temos uma checked e o compilador te obriga a colocar um throws na assinatura do método ou tratar a exception com um try/catch
public class MinhaExcecao extends Exception{
    public MinhaExcecao(String msg){
        super(msg);
    }
}

//    Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw)
//A hierarquia iniciada com a classe Throwable é dividida em exceções e erros. Exceções são usadas em códigos de aplicação. Erros são usados exclusivamente pela máquina virtual.