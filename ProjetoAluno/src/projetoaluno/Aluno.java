
package projetoaluno;

public class Aluno {
    private String nome;
    private int ra;
    private int idade;
    private boolean passou;
    private int nota;
    
    public Aluno(){
        
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String pNome){
         this.nome = pNome;
    }
    public int getRa(){
        return ra;
    }
    public void setRa(int pRa){
        this.ra = pRa;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int pIdade){
        this.idade = pIdade;
    }
    public boolean getPassou(){
        return passou;
    }
    public void setPassou(boolean pPassou){
        this.passou = pPassou;
    }
    public int getNota(){
        return nota;
    }
    public void setNota(int pNota){
        this.nota = pNota;
    }
}
