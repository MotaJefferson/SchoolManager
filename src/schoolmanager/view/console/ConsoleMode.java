
package schoolmanager.view.console;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import schoolmanager.dao.AlunoDAO;
import schoolmanager.model.Aluno;


public class ConsoleMode {

    public ConsoleMode() {
        
        Scanner scanner = new Scanner(System.in);
        AlunoDAO alunoDAO = new AlunoDAO();
        
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Buscar Aluno por ID");
            System.out.println("3. Listar Todos os Alunos");
            System.out.println("4. Atualizar Aluno");
            System.out.println("5. Deletar Aluno");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Aluno novoAluno = new Aluno();
                    System.out.print("RA: ");
                    novoAluno.setRA(scanner.nextLine());
                    System.out.print("Nome: ");
                    novoAluno.setNome(scanner.nextLine());
                    System.out.print("Idade: ");
                    novoAluno.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Turma: ");
                    novoAluno.setTurma(scanner.nextLine());
                    alunoDAO.adcionarAluno(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o ID do aluno: ");
                    int id = scanner.nextInt();
                    Aluno aluno = alunoDAO.buscarAlunoPorId(id);
                    if (aluno != null) {
                        System.out.println(aluno);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    List<Aluno> alunos = alunoDAO.buscarTodosAlunos();
                    for (Aluno a : alunos) {
                        System.out.println(a);
                    }
                    break;
                case 4:
                    System.out.print("ID do aluno a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    
                    Aluno alunoAtualizar = new Aluno();
                    alunoAtualizar.setId(idAtualizar);
                    System.out.print("Novo RA: ");
                    alunoAtualizar.setRA(scanner.nextLine());
                    System.out.print("Novo Nome: ");
                    alunoAtualizar.setNome(scanner.nextLine());
                    System.out.print("Nova Idade: ");
                    alunoAtualizar.setIdade(scanner.nextInt());
                    scanner.nextLine(); 
                    System.out.print("Nova Turma: ");
                    alunoAtualizar.setTurma(scanner.nextLine());
                    
                    if(alunoDAO.atualizarAluno(alunoAtualizar) > 0){
                        System.out.println("Aluno atualizado com sucesso!");
                    } else {
                        System.out.println("Falha ao atualizar o aluno");
                    }
                    break;
                case 5:
                    System.out.print("ID do aluno a ser deletado: ");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine();
                    Aluno alunoDeletar = new Aluno();
                    alunoDeletar.setId(idDeletar);
                    alunoDAO.deletarAluno(alunoDeletar);
                    
                    if(alunoDAO.deletarAluno(alunoDeletar) > 01){
                        System.out.println("Aluno deletado com sucesso!");
                    } else {
                        System.out.println("Falha ao deletar o aluno");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    
}
