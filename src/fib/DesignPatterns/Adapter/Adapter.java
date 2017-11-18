package fib.DesignPatterns.Adapter;

public class Adapter implements IAdapter {

	public WebService ws;

	// public void CriarWebService() {
	// ws = new WebService();
	// }

	public Adapter() {
		ws = new WebService();
	}

	@Override
	public int imprimir() {
		return Integer.parseInt(ws.imprimir());
	}

}
