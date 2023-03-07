package lineares;

public interface Lista {

	void inserir(int valor);

	int buscar(int valor);

	void retirar(int valor);

	String exibir();

	Lista copiar();

	int getTamanho();

	int pegar(int pos);

	void concatenar(Lista outra);

	boolean estaVazia();

	Lista dividir();

}