package Metodos;

public class testeCarro {
	public static void main(String[] args) {
	
		Carro meuCarro= new Carro();
		meuCarro.cor = "Marsala";
		meuCarro.modelo = "Fiat Toro";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		//chamando os métodos
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		
		meuCarro.pegaMarcha();
	}
}
