

/**
 *
 * @author anapa
 */
import java.util.Scanner;


public class Principal {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //String nome;
        //int telefone;
        
        while(true){
            System.out.println("---------------------------");
            System.out.println("   Agenda Telefônica       ");
            System.out.println("---------------------------");
            System.out.println("   1.Adicionar             ");
            System.out.println("   2.Remover               ");
            System.out.println("   3.Buscar                ");
            System.out.println("   4.Atualizar             ");
            System.out.println("   5.Listar                ");
            System.out.println("   6.Sair                  ");
            System.out.println("---------------------------");
            System.out.println("Informe a opção desejada:  ");
            System.out.println("---------------------------");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Informe o nome:");         // solicita o nome do contato
                    String nome = entrada.nextLine();              // lê o nome do contato
                    System.out.println("Informe o telefone:");     // solicta o telefone do contato 
                    int telefone = entrada.nextInt();              //lê o telefone do contato   
                    agenda.adicionarContato(nome, telefone);       // adiciona o contato a agenda
                    break;                                         // sai do loop   
        
                case 2:
                    
                    System.out.println("Informe o nome:");        // solicita o nome do contato
                    nome = entrada.nextLine();                    //lê o nome do contato
                    agenda.removerContato(nome);                  //remove o contato da agenda
                    break;                                        // sai do loop
                
                case 3: 
                    System.out.println("Informe o nome a ser pesquisado:");    // Solicita o nome do contato a ser pesquisado
                    nome = entrada.nextLine();                                 // Lê o nome do contato a ser pesquisado
                    int i = agenda.buscarContato(nome);                        // Lê o nome do contato a ser pesquisado
                    if(i < 0){                                                 // Verifica se o contato foi encontrado
                        System.out.println("Contato não foi encontrada");       // Imprime uma mensagem informando que o contato não foi encontrado
                    } else {
                        System.out.println("Contato foi encontrada posição " + i );     // Imprime a posição do contato na lista de contatos
                    } break;
                    
                case 4:      
                    System.out.println("Digite a posição do contato:");         // Solicita a posição do contato a ser alterado
                    int index = entrada.nextInt();                              // Lê a posição do contato a ser alterado
                    entrada.nextLine();
                    System.out.println("Digite o nome:");                       // Solicita o novo nome do contato
                    nome = entrada.nextLine();                                  // Lê o novo nome do contato
                    System.out.println("Informe o Telefone:");                  // Solicita o novo telefone do contato
                    telefone = entrada.nextInt();                               // Lê o novo telefone do contato
                    entrada.nextLine();
                    agenda.alterarContato(index, nome, telefone);               // Altera o contato na posição index com o novo nome e telefone
                    break;
                   
                case 5:
                   agenda.listarContato();                       
                   break;
                   
                case 6:
                    System.exit(0);
                    
                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
           
        }
        
    }
    
}
