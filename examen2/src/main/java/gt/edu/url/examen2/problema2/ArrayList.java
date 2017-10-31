package gt.edu.url.examen2.problema2;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {

	public static final int tamaño = 1;
	private E[] arreglo;
	private int size = 0;
	
	public ArrayList() {
	 arreglo =  (E[]) new Object[tamaño];
	}
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}
	

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E e) {
		if(size == arreglo.length) {
		Redimensionar(1+arreglo.length);
		}
		
		
}
		
	
	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}
	protected void CheckIndex(int index, int number) {
		if(index<0 || index>= number) {
			throw new IndexOutOfBoundsException("Index no existente: " + index);
		}
	}
	protected void Redimensionar(int tamaño) {
		E[] temp = (E[]) new Object[tamaño];
		for(int j = 0; j<size; j++) {
			temp[j] = arreglo[j];
			
		}
		arreglo = temp;
	}
	@Override
	public String toString() {
		return "ArrayList [arreglo=" + Arrays.toString(arreglo) + "]";
	}
	
	

}
