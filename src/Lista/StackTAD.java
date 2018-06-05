package Lista;

public interface StackTAD<T> {
	/**********
	 * Adiciona um elemento no topo da pilha.
	 * @param d Elemento a ser adicionado. 
	 */
	  public void push(T d);

	/**********
	 * Remove o elemento do topo da pilha
	 * e retorna o elemento removido.
	 */
	  public T pop();
	  
	/**********
	 * Consulta o elemento no topo da pilha
	 * e retorna este elemento sem removê-lo.
	 */
	  public T top();

	/**********
	 * Returna true se a pilha estiver vazia, e false caso contrário.
	 */
	  public boolean isEmpty();

	/**********
	 * Retorna a quantidade de elementos da pilha.
	 */
	  public int size(); 
}

