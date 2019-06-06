package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

		public static void main(String[] args) {
			
			Professor professor = new Professor();
			
				professor.setNome(JOptionPane.showInputDialog(null,"Nome"));
				professor.setEndereco(JOptionPane.showInputDialog(null,"Endereco"));
				professor.setBairro(JOptionPane.showInputDialog(null,"Bairro"));
				professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"Cep")));
				professor.setCidade(JOptionPane.showInputDialog(null,"Cidade"));
				professor.setEstado(JOptionPane.showInputDialog(null,"Estado"));
				professor.setRg(Integer.parseInt(JOptionPane.showInputDialog(null,"Rg")));
				professor.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"Cpf")));
				
				System.out.println("Nome: "+professor.getNome());
				System.out.println("Endereço: "+professor.getEndereco());
				System.out.println("Bairro: "+professor.getBairro());
				System.out.println("Cep: "+professor.getCep());
				System.out.println("Cidade: "+professor.getCidade());
				System.out.println("Estado: "+professor.getEstado());
				System.out.println("RG: "+professor.getRg());
				System.out.println("CPF: "+professor.getCpf());
				
				
			try {
				int dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas Disciplinas você Possui?"));				
				String disciplinas[] = new String[100];
				
				for(int i=0; i<dis;i++) {
					
					disciplinas[i] = JOptionPane.showInputDialog(null,"Digite a disciplina"+i);
					
				}
				for(int i=0; i<dis;i++) {
					
				System.out.println("Disciplina "+i+" "+disciplinas[i]);
					
				}
				professor.setDisciplinas(disciplinas);
			}
			catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			try {
				int cur = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos Cursos você possiu ?"));
				String cursos[] = new String[100];
				
				for(int i = 0;i < cur;i++) {
				cursos[i] = JOptionPane.showInputDialog(null,"Digite o Curso "+i);
				
				}
				
				for(int i=0; i<cur;i++) {
					
				System.out.println("Curso "+i+" "+cursos[i]);
					
				}
				
				professor.setCursos(cursos);
			}
			catch (Exception e) {
				
				e.printStackTrace();
				
			}
				
			

			

		}
	
}
