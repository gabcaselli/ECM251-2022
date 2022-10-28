package caselli;

public class Main {

    public static void main(String[] args) {
        //Cria uma referência para um objeto conta
        Conta c1;
        Conta c2;

        //Instancia um objeto conta e cliente
        c1=new Conta();
        c1.cliente=new Cliente();
        c2=new Conta();
        c2.cliente=new Cliente();

        //Manipular os atributos
        c1.cliente.titular="Gabriel Caselli";
        c1.saldo=357281.72;
        c1.numero=8964;
        c2.cliente.titular="Roberto Campos";
        c2.saldo=45287.98;
        c2.numero=5627;

        // Invocar o método visualizarSaldo()
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        // Invocar o método depositar()
        c1.depositar(1765);
        c1.visualizarSaldo();

        // Invocar o método sacar();
        if(c2.sacar(790)) {
            System.out.println("Valor sacado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
        c2.visualizarSaldo();

        // Invocar o método transferirDinheiro();
        if(c1.transferirDinheiro(c2,21000)){
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Falha ao transferir. Saldo insuficiente");
        }
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());


    }
}
