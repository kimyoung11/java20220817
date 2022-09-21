package ch13.lecture;

class Product<T,M>{
	private T kind;
	private M model;
	
	T getKind() {	return this.kind;	}
	M getModel() {	return this.model;	}
	
	void setKind(T kind) {	this.kind = kind;	}
	void setModel(M model) {	this.model = model;	}
}

class Tv{
	
}

class ChildProduct<T,M,C> extends Product<T, M>{
	private C company;
	public C getCompany() {		return this.company;	}
	public void setCompany(C company) {	this.company = company;	}
}

interface Storage<T>{
	public void add(T item, int index);
	public T get(int index);
}

class StorageImpl<T> implements Storage<T>{
	
	private T[] array;
	
	StorageImpl(int capacity){
		this.array = (T[]) new Object[capacity];
	}
	
	@Override
	public void add(T item, int index) {
		array[index] =item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}

public class ChildProductAndStorageExample {	
	public static void main(String[] args) {
		
	}
}
