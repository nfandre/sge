package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	private Collection<Turma> turmas;
    private String codigo;
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}
	public String getCodigo() {
		return this.codigo;
	}


    public Curso(Collection<Turma> turmas, String codigo) {
        this.turmas = turmas;
        this.codigo = codigo;
    }

	@Override
	public String toString() {
		return "<Turma: " 
				+ this.getTurmas() 
				+ ", codigo: " + this.getCodigo()
				+ ">";
	}
    
    
	@Override
	public boolean equals(Object obj) {
		
		boolean resultado = false;
		
		if(obj.getClass() == this.getClass()) {
			
			Curso other = (Curso)obj;
			
			resultado = 
					this.getCodigo().equals(other.getCodigo());
			resultado = resultado &&
					this.getTurmas().equals(other.getTurmas());
		}
		
		return resultado;
	}

}
