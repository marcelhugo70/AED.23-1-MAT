package lineares;

public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		this.info = new int[10];
		this.tamanho = 0;
	}
	
	public void inserir(int valor) {
		if (tamanho == info.length) {
			this.redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	private void redimensionar() {
		int[] novo = new int[tamanho + 10];
		for (int i=0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public int buscar(int valor) {
		for (int i=0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
	public void retirar(int valor) {
		int pos = this.buscar(valor);
		if (pos != -1) {
			for (int i=pos; i < tamanho-1; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	
	public String exibir() {
		String str = "[";
		for (int i=0; i < tamanho; i++) {
			str += info[i]+", ";
		}
		return str+"]";
	}
	
	public ListaEstatica copiar() {
		ListaEstatica outra = new ListaEstatica();
		for (int i=0; i < tamanho; i++) {
			outra.inserir(info[i]);
		}
		return outra;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int pegar(int pos) {
		if (pos <0 || pos >= tamanho) {
			throw new IndexOutOfBoundsException("Pos = "+pos);
		}
		return info[pos];
	}
	
	public void concatenar(ListaEstatica outra) {
		for (int i=0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
	}
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	public ListaEstatica dividir() {
		ListaEstatica dividida = new ListaEstatica();
		int metade = this.tamanho / 2;
		for (int i = metade; i < tamanho; i++) {
			dividida.inserir(info[i]);
		}
		this.tamanho = metade;
		return dividida;
	}
}
