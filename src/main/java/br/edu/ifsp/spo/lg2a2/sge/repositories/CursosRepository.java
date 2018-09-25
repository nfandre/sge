package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
	
	private static Collection<Curso> cursos = new ArrayList<Curso>();
    public CursosRepository(){
        
    }
    public CursosRepository(Collection<Curso> cursos){
        this.cursos.addAll(cursos);
    }
    
    public Curso buscarPorCodigo(String codigo) {
        Curso result = null;
        
        for(Curso curso: CursosRepository.cursos){
            if(curso.getCodigo().equals(codigo)){
                result = curso;
                break;
            }
        }
        return result;
    }

	public Collection<Turma> buscarTurmas(String codigoCurso){
            Collection<Turma> turmas = new ArrayList<Turma>();
            
            turmas = null;
            for(Curso curso:CursosRepository.cursos){
                if(curso.getCodigo().equals(codigoCurso)){
                    curso.getTurmas();
                	turmas = curso.getTurmas();
                    break;
                }
            }
            return turmas;
	}
	
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		Collection<Aluno> alunos = new ArrayList<Aluno>();
                alunos = null;
                for(Curso curso:CursosRepository.cursos){
                    if(curso.getCodigo().equals(codigoCurso)){
                        Turma turma = (Turma) curso.getTurmas();
                        alunos = turma.getAlunos();
                        break;
                    }
                }
                return alunos;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		return false;
	}
	

}
