package ch01.lecture;

import java.util.Arrays;
import java.util.Iterator;


class myArrayList<T>{
	Object[] arr = null;
	int capacity = 0;
	int size = 0;
	
	public myArrayList(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
		
	}
	
	public myArrayList() {
		this.capacity =1;
		arr = new Object[capacity];
		size = 0;
	}
	public void add(T element) {
		if(size == capacity) {
			expandArray();
		}
		arr[size++] = element;
	}
	public void addFirst(T element) {
		if(size == capacity) {
			expandArray();
		}
		add(0,element);
	}
	public void add(int index, T element) {
		if(size == capacity) {
			expandArray();
		}
		for(int i=size;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = element;
		size++;
	}
	private void expandArray() {
		capacity *= 2;
		Object[] tempArr = new Object[capacity];
		copyArr(tempArr, arr);
		arr = new Object[capacity];
		copyArr(arr,tempArr);
		
	}
	
	private void copyArr(Object[] arr1, Object[] arr2) {
		for(int i=0;i<arr2.length;i++) {
			arr1[i] = arr2[i];
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
	    return (T) arr[index];
	}
	
	public T remove(int index) {
		T result = (T) arr[index];
		for(int i=index;i<size;i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return (T) result;
	}
	public void reset() {
		arr= new Object[capacity];
		size = 0;
	}
	public int size() {
		return this.size;
	}
	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public String toString() {
		//return "myArrayList [arr=" + Arrays.toString(arr) + ", capacity=" + capacity + ", size=" + size + "]";
		return "myArrayList [arr" + Arrays.toString(arr) +"]";
	}
	
	
}

public class ArraylistExer {
	public static void main(String[] args) {
		
		myArrayList<Integer> al = new myArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(2,10);
		al.add(3,11);
		al.add(4,19);
		al.add(5,20);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.getCapacity());
		System.out.println(al.remove(2));
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.getCapacity());
		al.addFirst(1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.getCapacity());
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		al.add(5,20);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.getCapacity());
//		for(myArrayList<Integer> i : al) {
//			System.out.println(i);
//		}
		//Iterator<> it = new Iterator<>();
		
//		System.out.println(al);
//		System.out.println(al.size());
//		System.out.println(al.getCapacity());
	}	
}
