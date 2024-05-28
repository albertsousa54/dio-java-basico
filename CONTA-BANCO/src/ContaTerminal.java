//ETAPAS QUE DEVEM SER REALIZADAS NESSE DESAFIO.
//1º CONHECER E IMPORTAR A CLASSE SCANNER

import java.util.Locale;
import java.util.Scanner;;


public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //int numeroDaConta;
        //String agencia;
        //String NomeDoCliente;
        //double saldoCliente = 2200;

        //2º EXIBIR AS MENSAGENS PARA O NOSSO USUÁRIO

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //3º OPTER/CAPTURAR ATRAVES DO SCANNER OS VALORES DIGITADOS

        System.out.println("Informe o numero da sua conta.");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Informe quanto deseja depositar:");
        double saldoCliente = scanner.nextDouble();
        
        System.out.println("Informe a sua agencia:");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome completo:");
        String nomeCompleto = scanner.next();

        //4º E ULTIMO EXIBIR A MENSAGEM DE OCNTA CRIADA1234.

        System.out.println("Ola " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " " + " e sua conta é: " + numeroDaConta + "" + " e o saldo " + saldoCliente + " já está disponivel para saque.");
    }
}
