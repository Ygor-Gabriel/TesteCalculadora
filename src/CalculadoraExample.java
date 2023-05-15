import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraExample extends UnicastRemoteObject implements Calculadora{
	private static final long serialVersionUID = 1L;

	protected CalculadoraExample() throws RemoteException{
		super();
	}
	
	public long add(long a, long b) throws RemoteException{
		return a+b;
	}

}
