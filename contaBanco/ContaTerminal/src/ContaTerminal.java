
import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);    
	    
		System.out.println("Por favor digite o número da Conta: ");
		int numeroConta = leitor.nextInt();

        System.out.println("Por favor digite o número da Agência: ");
		int agencia = leitor.nextInt();
		
		System.out.println("Por favor digite seu Nome: ");
		String nomeCliente = leitor.next();
        System.out.println("   ");        
        
		double saldo = 237.48;

        System.out.println("Olá, "+ nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agencia é "+ agencia +", conta "+ numeroConta +" e seu Saldo de "+ saldo + " já esta disponivel para saque.");

        System.out.println(" __________________________________________  "); 
		
		
    }
}
