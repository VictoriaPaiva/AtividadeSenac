
package projetoaluno;

import javax.swing.JOptionPane;

public class ProjetoAluno {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        
        aluno01.setNome("Vick");
        JOptionPane.showMessageDialog(null,"Olá " + aluno01.getNome());
        
        
    }
    
}
