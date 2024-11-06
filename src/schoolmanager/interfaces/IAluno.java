package schoolmanager.interfaces;

import java.util.List;
import schoolmanager.model.Aluno;

public interface IAluno {
    int adcionarAluno(Aluno aluno);
    Aluno buscarAlunoPorId(int id);
    List<Aluno> buscarTodosAlunos();
    int atualizarAluno(Aluno aluno);
    int deletarAluno(Aluno aluno);
}
