/**
 *
 * @author anapa
 */

import java.util.ArrayList;
import java.util.Iterator;


public class Agenda {
    
    private ArrayList<Contato> contatos = new ArrayList<Contato>();   // cria uma lista de contatos vazia
    
    public void adicionarContato(String nome, int telefone){
        Contato contato = new Contato(nome, telefone);   //cria um novo objeto contato com o nome e telefone fornecidos
        contatos.add(contato);                           // adiciona o objeto contato à lista de contatos
    }
    
    public void removerContato(String nome){   // Esta é a declaração da função. Ela é pública, não retorna nada (void) e aceita uma string como argumento, que é o nome do contato a ser removido.
         Iterator<Contato> iterator = contatos.iterator();  //Aqui, um objeto Iterator é criado para percorrer a lista de contatos.
    while(iterator.hasNext()){                              // Este é o início de um loop que continuará enquanto houver mais contatos na lista.
        Contato contato = iterator.next();                  // Este é o início de um loop que continuará enquanto houver mais contatos na lista.  
        if(contato.getNome().equals(nome)){                // Esta é uma verificação para ver se o nome do contato atual corresponde ao nome fornecido.
            iterator.remove();                             //Se o nome corresponder, o contato atual é removido da lista.
           }    break;
        }
    }
    
    public int buscarContato(String nome){                
        for( int i = 0; i < contatos.size(); i++){       //itera sobre a lista de contatos
            if(contatos.get(i).getNome().equals(nome)){  //verifica se o nome da pessoa é igual ao nome fornecido
                return i;                                //retorna -1 caso o contato não seja encontrado
                
            }           
        }
        return -1;
    }
    
    public void alterarContato(int index, String nome, int telefone){
        Contato contato = contatos.get(index);     //obtém o contato na posição index da lista de contatos
        contato.setNome(nome);                    // define o novo nome do contato
        contato.setTelefone(telefone);            //define o novo telefone do contato
    }
    
    public void listarContato(){
        for(Contato contato : contatos){               // itera sobre a lista de contatos
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone()); // imprime o nome e telefone do contato
        }
    }

    
    }
    
