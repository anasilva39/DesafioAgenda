/**
 *
 * @author anapa
 */

public class Contato {
    private String nome;
    private int telefone;
    
    
    //construtor cheio
    public Contato (String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;   
    }
    
    
    // construtor vazio
    public Contato(){
        
    }

    public String getNome() {
        return nome;    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
