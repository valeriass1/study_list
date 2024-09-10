package br.com.studylist.utils;

public enum Genero {
	
	FEMININO, MASCULINO, OUTROS, PREFIRO_NAO_DIZER;
	
	
	public static String getGenero(String gen) {
		if(gen == null) return OUTROS.toString();
	
		return Genero.values()[Integer.parseInt(gen)].name();
		
		
	}

}
