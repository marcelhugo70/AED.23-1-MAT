package lineares;

public class ListaEncadeada implements Lista {
	private NoLista primeiro;
	private NoLista ultimo;
	private int qtdeElementos;

	@Override
	public void inserir(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProx(novo);
		}
		ultimo = novo;
		qtdeElementos++;
	}

	@Override
	public int buscar(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void retirar(int valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lista copiar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pegar(int pos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void concatenar(Lista outra) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estaVazia() {
		return (primeiro == null);
	}

	@Override
	public Lista dividir() {
		// TODO Auto-generated method stub
		return null;
	}

}
