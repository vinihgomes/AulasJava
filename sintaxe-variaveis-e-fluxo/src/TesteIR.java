public class TesteIR {

	public static void main(String[] args) {

		double salario = 6000.0;

		if (salario < 1900) {
			System.out.println("Renda menor que a m�nima para declara��o do IR");
		} else if (salario < 2800) {
			System.out.println(
					"O IR ser� de R$" + salario * 0.075 + " e pode deduzir" + " na declara��o o valor de R$142,00");
		} else if (salario < 3751) {
			System.out.println(
					"O IR ser� de R$" + salario * 0.15 + " e pode deduzir" + " na declara��o o valor de R$350,00");
		} else if (salario < 4664) {
			System.out.println(
					"O IR ser� de R$" + salario * 0.225 + " e pode deduzir" + " na declara��o o valor de R$636,00");
		} else
			System.out.println(
					"O IR ser� de R$" + salario * 0.275 + " e pode deduzir" + " na declara��o o valor de R$869,36");

	}
}