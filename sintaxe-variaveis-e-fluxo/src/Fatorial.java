
public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		int num = 6;
		for (int i = num; i > 1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial + " � o fatorial de " + num);
	}

}