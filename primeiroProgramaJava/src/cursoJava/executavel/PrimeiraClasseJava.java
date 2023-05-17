package cursoJava.executavel;


import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Materia;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		
		int qtnMateria = Integer.parseInt(JOptionPane.showInputDialog("quantas materias?"));
		
		String nome = JOptionPane.showInputDialog("qual seu nome?");
		int idade = Integer.parseInt((JOptionPane.showInputDialog("qual idade?")));
		String dataNasc = JOptionPane.showInputDialog("qual sua data de nascimento");
		String cpf = JOptionPane.showInputDialog("digite seu Cpf");
		
				
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataNascimento(dataNasc);
		aluno1.setNumeroCpf(cpf);		
		
		
		for(int pos = 0; pos < qtnMateria; pos++) {
			String diciplina = JOptionPane.showInputDialog("digite a " + (pos + 1) + " diciplina");
			double nota = Double.parseDouble((JOptionPane.showInputDialog("digite a " + (pos + 1) + " nota")));
			
			Materia materia = new Materia();
			materia.setDiciplina(diciplina);
			materia.setNota(nota);
			
			aluno1.getMateria().add(materia);	
		}	
		JOptionPane.showMessageDialog(null, aluno1);
		
		int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma Materia?");
		if(escolha == 0) {
			String diciplinaRemover = JOptionPane.showInputDialog("qual a disciplina? " + "entre zero e " + (qtnMateria));
			aluno1.getMateria().remove(Integer.parseInt(diciplinaRemover));
		}
		JOptionPane.showMessageDialog(null, aluno1);
	}
}

