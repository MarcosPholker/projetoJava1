package cursoJava.executavel;


import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;
import cursoJava.classes.Materia;

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
		
		Materia materia1 = new Materia();
		materia1.setDiciplina(diciplina1);
		materia1.setNota(nota1);
		aluno1.getMateria().add(materia1);
		
		Materia materia2 = new Materia();
		materia1.setDiciplina(diciplina2);
		materia1.setNota(nota2);
		aluno1.getMateria().add(materia2);
		
		Materia materia3 = new Materia();
		materia1.setDiciplina(diciplina3);
		materia1.setNota(nota3);
		aluno1.getMateria().add(materia3);
		
		Materia materia4 = new Materia();
		materia1.setDiciplina(diciplina4);
		materia1.setNota(nota4);
		aluno1.getMateria().add(materia4);
		
		
		JOptionPane.showMessageDialog(null, aluno1);
		System.out.println(aluno1.getMediaNota());
	}
}

