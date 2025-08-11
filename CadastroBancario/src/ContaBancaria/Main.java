package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João Silva", "12345-6", 1000.00);
        
        conta1.mostrarDados();
        
        conta1.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta1.getSaldo());
        
        conta1.sacar(200.00);
        System.out.println("Saldo após saque: R$" + conta1.getSaldo());
        
        conta1.sacar(2000.00);
        
        conta1.setTitular("João Silva Santos");
        System.out.println("\nTitular alterado para: " + conta1.getTitular());
        
        conta1.mostrarDados();
    }
    
    
}