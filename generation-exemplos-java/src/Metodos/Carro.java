package Metodos;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga() //m�todo
	{
		System.out.println("O carro est� ligando...");
	}
	
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual+ quantidade;// vai criar uma velocidade nova mais q quantidade
		this.velocidadeAtual = velocidadeNova; //para poder atualizar qu
	}
	
	int pegaMarcha()
	{
		if(this.velocidadeAtual<0)
		{
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40) //km/h
		{
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80) //km por hoa
		{
			return 2;
		}
		return 3;
	}
}
