package controller;

public class modulos {
		public modulos() {
			super();
		}
		
		public String inverte(String x){
			// A condição de parada é quando o vetor String é menor ou igual a 1, pois já percorreu ele todo
	        if(x.length() <= 1) {
	        	return x ;
	        }else{
	        	// a função soma a ultima posição do vetor e põe no lugar do primeiro assim ela escreve a palavra ao contrário
	            return inverte(x.substring(1)) + x.charAt(0);
	        }
	    }
		

}
