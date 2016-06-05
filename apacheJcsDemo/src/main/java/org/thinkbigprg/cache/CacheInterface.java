package org.thinkbigprg.cache;

public interface CacheInterface<T> {

	public abstract void cacheAllRecords();

	public abstract T getRecord(String name);
}
