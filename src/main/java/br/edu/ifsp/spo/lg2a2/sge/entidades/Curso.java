package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	private Collection<Turma> turmas;
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}
        private String codigo;

    public Curso(Collection<Turma> turmas, String codigo) {
        this.turmas = turmas;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

}
