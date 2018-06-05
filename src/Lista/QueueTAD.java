package Lista;

public interface QueueTAD<T> {
	/**********
	 * Adiciona um elemento na última posição (tail) da fila.
	 * @param d Elemento a ser adicionado. 
	 */
	  public void enqueue(T d);

	/**********
	 * Remove o elemento na primeira posição (head) da fila
	 * e retorna o elemento removido.
	 */
	  public T dequeue();

	/**********
	 * Consulta o elemento na primeira posição (head) da fila
	 * e retorna este elemento sem removê-lo.
	 */
	  public T first();

	/**********
	 * Retorna true se a fila estiver vazia, e false caso contrário.
	 */
	  public boolean isEmpty();

	/**********
	 * Retorna a quantidade de elementos da fila.
	 */
	  public int size(); 
}