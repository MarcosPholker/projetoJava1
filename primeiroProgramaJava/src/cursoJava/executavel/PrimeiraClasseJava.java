package cursoJava.executavel;


import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("qual seu nome?");
		int idade = Integer.parseInt((JOptionPane.showInputDialog("qual idade?")));
		String dataNasc = JOptionPane.showInputDialog("qual sua data de nascimento");
		String cpf = JOptionPane.showInputDialog("digite seu Cpf");
		
		String diciplina1 = JOptionPane.showInputDialog("digite a 1 diciplina");
		double nota1 = Double.parseDouble((JOptionPane.showInputDialog("digite a 1 nota")));
		
		String diciplina2 = JOptionPane.showInputDialog("digite a 2 diciplina");
		double nota2 = Double.parseDouble((JOptionPane.showInputDialog("digite a 2 nota")));
		
		String diciplina3 = JOptionPane.showInputDialog("digite a 3 diciplina");
		double nota3 = Double.parseDouble((JOptionPane.showInputDialog("digite a 3 nota")));
		
		String diciplina4 = JOptionPane.showInputDialog("digite a 4 diciplina");
		double nota4 = Double.parseDouble((JOptionPane.showInputDialog("digite a 4 nota")));
		
				
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataNascimento(dataNasc);
		aluno1.setNumeroCpf(cpf);
		aluno1.getMateria().setDiciplina1(diciplina1);
		aluno1.getMateria().setNota1(nota1);
		aluno1.getMateria().setDiciplina2(diciplina2);
		aluno1.getMateria().setNota2(nota2);
		aluno1.getMateria().setDiciplina3(diciplina3);
		aluno1.getMateria().setNota3(nota3);
		aluno1.getMateria().setDiciplina1(diciplina4);
		aluno1.getMateria().setNota4(nota4);
		
		
		
		JOptionPane.showMessageDialog(null, aluno1);
	}
}

