// Importa a classe Scanner do pacote java.util para permitir entrada de dados pelo teclado.
// O Scanner é necessário para ler informações digitadas pelo usuário.
import java.util.Scanner;

// Declaração da classe principal do programa.
// Toda aplicação Java precisa estar dentro de uma classe. O nome da classe deve ser o mesmo do arquivo (Nomecalc.java).
public class Nomecalc {  

    // O método `main` é o ponto de entrada do programa.
    // Ele define o que será executado quando rodamos o programa.
    public static void main (String[] args) {  

        // Criamos um objeto da classe Scanner chamado "leitor".
        // Esse objeto será usado para capturar a entrada do usuário pelo teclado.
        Scanner leitor = new Scanner(System.in);

        // Exibe uma mensagem no console pedindo para o usuário digitar seu nome.
        // `print` exibe o texto sem pular para a próxima linha.
        System.out.print("Digite seu nome: ");

        // Lê a entrada do usuário e armazena o nome na variável `nome1`.
        // `nextLine()` captura toda a linha digitada pelo usuário.
        String nome1 = leitor.nextLine(); 

        // Exibe uma mensagem de boas-vindas personalizada com o nome digitado pelo usuário.
        System.out.println("Seja bem-vindo à minha calculadora, " + nome1 + "!"); 

        // Declaração das variáveis que armazenarão os números e o resultado da operação
        int numero1;  // Primeiro número digitado pelo usuário
        int numero2;  // Segundo número digitado pelo usuário
        int resultado;  // Variável para armazenar o resultado da operação matemática
        char operacao;  // Variável para armazenar o operador matemático (+ ou -)

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        
        // Lê o primeiro número digitado pelo usuário e o armazena na variável `numero1`
        numero1 = leitor.nextInt();
        
        // Solicita ao usuário que escolha a operação matemática
        System.out.print("Escolha a operação, + para adição e - para subtração: ");
        
        // Lê o operador matemático digitado pelo usuário e armazena na variável `operacao`
        // `next().charAt(0)` captura apenas o primeiro caractere digitado
        operacao = leitor.next().charAt(0);
     
        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        
        // Lê o segundo número digitado pelo usuário e o armazena na variável `numero2`
        numero2 = leitor.nextInt();

        // Aqui começa a estrutura de decisão `if-else`, que determina qual operação será realizada.

        if (operacao == '+') {  // Se o usuário escolheu '+', realizamos uma soma
            resultado = numero1 + numero2;

        } else if (operacao == '-') {  // Se o usuário escolheu '-', realizamos uma subtração
            resultado = numero1 - numero2;

        } else {  // Se o usuário digitou qualquer outro símbolo, a operação é inválida.
            System.out.println("Operação inválida!!!"); // Exibe a mensagem de erro
            
            // Fecha o objeto Scanner para liberar recursos do sistema.
            leitor.close();

            // `return;` encerra imediatamente a execução do programa, pois não há operação válida.
            return;
        }  // Fecha o bloco do `else`

        // Após a verificação do `if-else`, se a operação for válida, exibimos o resultado.
        System.out.println("Seu resultado é: " + resultado);

        // Fecha o Scanner para evitar vazamento de memória e liberar os recursos do sistema.
        leitor.close();
    }  // Fecha o bloco do método `main`
}  // Fecha o bloco da classe `Nomecalc`