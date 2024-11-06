
package schoolmanager.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import schoolmanager.interfaces.IAluno;
import schoolmanager.model.Aluno;
import schoolmanager.util.DBConnection;


public class AlunoDAO implements IAluno {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public AlunoDAO(){
        
    }

    @Override
    public int adcionarAluno(Aluno aluno) {
        
        try
        {
            String query = "INSERT INTO alunos (RA, nome, idade, turma) VALUES (?,?,?,?)";
            con = DBConnection.conectar();
            cmd = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, aluno.getRA());
            cmd.setString(2, aluno.getNome());
            cmd.setInt(3, aluno.getIdade());
            cmd.setString(4, aluno.getTurma());
            
            if(cmd.executeUpdate() > 0)
            {
                try (ResultSet rs = cmd.getGeneratedKeys()) {
                    if (rs.next()) {
                        return rs.getInt(1);
                    }
                }
  
                //ResultSet rs = cmd.getGeneratedKeys();
                //return rs.next() ? rs.getInt(1) : -1;
            }
            return -1;
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally
        {
            DBConnection.desconectar(con);
        }
    }

    @Override
    public Aluno buscarAlunoPorId(int id) {
        
        try
        {
            String query = "SELECT id, RA, nome, idade, turma FROM alunos WHERE id=?";
            con = DBConnection.conectar();
            cmd = con.prepareStatement(query);
            cmd.setInt(1, id);
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("Id"));                
                aluno.setRA(rs.getString("RA"));
                aluno.setNome(rs.getString("Nome"));
                aluno.setIdade(rs.getInt("Idade"));
                aluno.setTurma(rs.getString("Turma"));
                return aluno;
            
            } else {
                return null;
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
        finally
        {
            DBConnection.desconectar(con);
        }
    }

    @Override
    public List<Aluno> buscarTodosAlunos() {
        
        try
        {
            String query = "SELECT id, RA, nome, idade, turma FROM alunos";
            con = DBConnection.conectar();
            cmd = con.prepareStatement(query);
            ResultSet rs = cmd.executeQuery();
            List<Aluno> lista = new ArrayList<>();
            while (rs.next())
            {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("Id")); 
                aluno.setRA(rs.getString("RA"));
                aluno.setNome(rs.getString("Nome"));
                aluno.setIdade(rs.getInt("Idade"));
                aluno.setTurma(rs.getString("Turma"));
                lista.add(aluno);
            }
            return lista;
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
        finally
        {
            DBConnection.desconectar(con);
        }
    }

    @Override
    public int atualizarAluno(Aluno aluno) {
        
        try
        {
            String query = "UPDATE alunos SET RA=?, nome=?, idade=?, turma=? WHERE id=?";
            con = DBConnection.conectar();
            cmd = con.prepareStatement(query);
            //ResultSet rs = cmd.executeQuery();            
            cmd.setString(1, aluno.getRA());
            cmd.setString(2, aluno.getNome());
            cmd.setInt(3, aluno.getIdade());
            cmd.setString(4, aluno.getTurma());
            cmd.setInt(5, aluno.getId());
            
            if(cmd.executeUpdate() > 0){
                return aluno.getId();
            }
            return -1;
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally
        {
            DBConnection.desconectar(con);
        }
        
    }

    @Override
    public int deletarAluno(Aluno aluno) {
        
        try
        {            
            String query = "DELETE FROM alunos WHERE id=?";
            con = DBConnection.conectar();
            cmd = con.prepareStatement(query);
            cmd.setInt(1, aluno.getId());
            
            if(cmd.executeUpdate() > 0){
                return aluno.getId();
            }
            return -1;
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally
        {
            DBConnection.desconectar(con);
        }
        
    }
        
}
