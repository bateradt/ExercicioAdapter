package fib.DesignPatterns.Adapter;

public class WebSite {

	public void exibir() {

		WebService ws = new WebService();

		System.out.println(ws.imprimir());
	}

}
