package MetodosSobrecarregados;

public class MetodoSobrecarregado {
	
	public void testaMetodoSobreecarregado()
	{
		System.out.printf("Salário em número inteiro: %d \n",salario(1000));
		System.out.printf("Salário em número inteiro: %f \n",salario(7.500));
	}
	
	public int salario(int valorInt)
	{
		System.out.printf("Salário com argumento inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	//argumentos de mesmo nomes mas com parâmetros diferentes, um inteiro e outro double 
	public double salario(double valorDouble)
	{
		System.out.printf("Salário com argumento inteiro: %f \n",valorDouble);
		return valorDouble * valorDouble;
	}
	
	
}
