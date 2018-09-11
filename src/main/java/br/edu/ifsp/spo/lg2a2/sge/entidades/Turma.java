package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Turma {
	private Collection<Aluno> alunos;
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}

    public void setAlunos(Collection<Aluno> alunos) {
        this.alunos = alunos;
    }
	@Override
	public String toString() {
		return "<Alunos: " 
				+ this.getAlunos() 
				+ "Classe: " + this.getClass()
				 + ">";
	}
}
