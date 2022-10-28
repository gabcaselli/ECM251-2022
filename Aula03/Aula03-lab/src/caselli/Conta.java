package caselli;

public class Conta {
    //Atributos
    Cliente cliente;
    int numero;
    double saldo;
    private double valor;

    // Métodos
    void visualizarSaldo() {
        double saldo=50;
        System.out.println("Saldo disponível: R$" + this.saldo); // "this." especifica que o atributo saldo será utilizado e não a variável declarada dentro do mëtodo
    }
    boolean sacar(double valor) {
        if(this.saldo>=valor){
            this.valor-=valor;
            return true;
        }
        return false;
    }
    void depositar(double valor) {
        this.saldo+=valor;
    }
    boolean transferirDinheiro (Conta destino, double valor) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", valor=" + valor +
                '}';
    }
}
