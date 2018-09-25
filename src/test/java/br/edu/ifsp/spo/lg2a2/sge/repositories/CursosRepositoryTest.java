package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepositoryTest {
	
	private CursosRepository repository; 
	
	@Before
	public void setUp() {
		Collection<Curso> cursosMock = new ArrayList<Curso>();
		Collection<Aluno> alunosMock1 = new ArrayList<Aluno>();
		alunosMock1.add(
				new Aluno("sp300001", "23103213387", "João da Silva", "joao_silva@example.org"));
		alunosMock1.add(
				new Aluno("sp300002", "04388567833", "Maria da Silva", "maria_silva@example.org"));
		alunosMock1.add(
				new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org"));
		
		Collection<Aluno> alunosMock2 = new ArrayList<Aluno>();
		alunosMock2.add(
				new Aluno("sp300004", "251681531855", "André da Silva", "andre_silva@example.org"));
		alunosMock2.add(
				new Aluno("sp300005", "256161515187", "Pedro da Silva", "pedro_silva@example.org"));
		alunosMock2.add(
				new Aluno("sp300006", "516815185688", "Lucas da Silva", "lucas_silva@example.org"));

		Collection<Aluno> alunosMock3 = new ArrayList<Aluno>();
		alunosMock3.add(
				new Aluno("sp300007", "156841351868", "Luana da Silva", "luana_silva@example.org"));
		alunosMock3.add(
				new Aluno("sp300008", "8833513846885", "Larissa da Silva", "larissa_silva@example.org"));
		alunosMock3.add(
				new Aluno("sp300009", "516551588652", "José da Silva", "jose_silva@example.org"));
				
		Collection<Turma> turmasMock1 = new ArrayList<Turma>();
		turmasMock1.add(new Turma(alunosMock1));
		
		Collection<Turma> turmasMock2 = new ArrayList<Turma>();
		turmasMock2.add(new Turma(alunosMock2));
		
		Collection<Turma> turmasMock3 = new ArrayList<Turma>();
		turmasMock3.add(new Turma(alunosMock3));
		
		cursosMock.add(
				new Curso(turmasMock1,"1234"));
		cursosMock.add(
				new Curso(turmasMock2,"4567"));
		cursosMock.add(
				new Curso(turmasMock3,"7891"));
		
		repository = new CursosRepository(cursosMock);	
	}
	
	@Test
	public void buscarPorCodigoTest() {
		//1. Configuração
		
		String codigo = "1234";
		//2. Execução
		Curso curso = repository.buscarPorCodigo(codigo);
		//3. Asserção / Verificação
		Assert.assertNotNull(curso);
	}
	
	@Test
	public void buscarTurmasTest() {
		//1. Configuração
		String codigo = "1234";
		
		//2. Execução
		Collection<Turma> turma = repository.buscarTurmas(codigo);
		
		//3. Asserção / Verificação
		
		Assert.assertNotNull(turma);
	}
	
	@Test
	public void buscarAlunosTest() {
		//1. Configuração	
		String codigo = "4567";
		
		//2. Execução
		Collection<Aluno> aluno = repository.buscarAlunos(codigo);
		
		//3. Asserção / Verificação
		Assert.assertNotNull(aluno);
	}


}
