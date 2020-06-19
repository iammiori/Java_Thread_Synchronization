package com.threadstudy.queuethread;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<E> implements Queue<E>{
	
	private Object[] data;
	
	public MyQueue() {
		data = new Object[0];
	}
	
	/**
	 * E형의 element를 Queue의 맨 뒤에 넣는다. 성공 시, true 반환
	 */
	@Override
	public boolean add(E e) {
		Object[] newData = new Object[data.length+1];
		for (int i=0;i<data.length;i++) {
			newData[i] = data[i];
		}
		newData[newData.length-1] = e;
		data= newData;
		return true;
	}
	
	/**
	 * E형태의 Queue의 가장 앞에 있는 데이터를 지우고 출력
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E poll() {
		if (isEmpty())
			return null;
		Object[] newData = new Object[data.length-1];
		E retVal = (E) data[0];
		for (int i=0;i<newData.length;i++) {
			newData[i] = data[i+1];
		}
		data = newData;
		return retVal;
	}
	
	/**
	 * E형태의 Queue의 가장 앞에 있는 데이터 추출 (지우지 않음)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		if (isEmpty())
			return null;
		return (E) data[0];
	}
	
	/**
	 * Queue가 갖고있는 데이터의 사이즈 반환
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
