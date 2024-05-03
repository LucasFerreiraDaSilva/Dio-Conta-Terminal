import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception{
        //TODO:Conhecer e importar a classe Scanner
        //exibir as mensagens para nosso usuario
        //obter pela Scanner os valores digitados no terminal
        //exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, Digite o Número Da Sua Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, Digite sua Agencia: ");
        String agencia = scanner.next();

        System.out.print("Por favor, Digite Seu Nome: ");
        String nome = scanner.next();

        System.out.print("Por favor, Digite Seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Por favor, Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
