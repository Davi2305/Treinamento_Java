package br.com.treinamento.abstrato;

public class Principal {

	public static void main(String[] args) {
		
		NuvemBrodis nuvem = new NuvemBrodis();
		nuvem.setNomeImagem("foto_bolo.png");
		
		String base64 = nuvem.convertBase64(nuvem.getNomeImagem());
		
		nuvem.uploud(base64);
		
		System.out.println(nuvem.getUrlImagem());		
	}

}
