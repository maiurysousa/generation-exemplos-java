package Encapsulamento;

public class testFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Antônia");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());

	}

}
