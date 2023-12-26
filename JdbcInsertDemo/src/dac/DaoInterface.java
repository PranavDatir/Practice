package dac;

import java.util.Collection;

public interface DaoInterface<T, K> {
	Collection<T> getAll();
	T getOne(K key);
	void create(T t);
	void update(T t);
	void delete(K key);
}
