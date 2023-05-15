import java.rmi.Naming;

public class CalculadoraClient {
	public static void main(String[] args) {
		try {
			Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.86.10:43333/CalculadoraService");
			System.out.print("Adição: " + c.add(10, 15));
		}catch	(Exception e) {
			e.printStackTrace();			
		}
	}
}
