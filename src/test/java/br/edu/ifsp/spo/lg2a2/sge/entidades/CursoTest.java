package br.edu.ifsp.spo.lg2a2.sge.entidades;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class CursoTest {
    @Before 
    public void setUp() throws Exception {
        
    }
    @Test
    public void testEqualsObject() {
		//1. Configuracao
                Aluno a = new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org");
		Aluno b = new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org");
                Collection<Aluno> alunos = new ArrayList<Aluno>();
                alunos.add(a);
                alunos.add(b);
                Turma t = new Turma();
                t.setAlunos(alunos);
                
                Collection<Turma> turmas = new ArrayList<Turma>();
                turmas.add(t);
                
                Curso c1 = new Curso(turmas ,"codigo");
                Curso c2 = new Curso(turmas, "codigo");
		//2. Execução
		boolean resultado1 = c1.equals(c2);
		boolean resultado2 = c2.equals(c1);
		//3. Asserção
		assertTrue(resultado1);
		assertTrue(resultado2);
	}
}
