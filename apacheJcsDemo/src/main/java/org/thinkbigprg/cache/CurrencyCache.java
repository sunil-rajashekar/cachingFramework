package org.thinkbigprg.cache;

import org.apache.commons.jcs.JCS;
import org.apache.commons.jcs.access.CacheAccess;
import org.thinkbigprg.dao.CurrencyDao;
import org.thinkbigprg.domain.Currency;

public class CurrencyCache implements CacheInterface<Currency> {

	private CacheAccess<String, Currency> cache = null;
	private CurrencyDao currencyDao;
	private static CurrencyCache currencyCache;

	private CurrencyCache() {
		cache = JCS.getInstance("currency");
		currencyDao = new CurrencyDao();
	}

	public static CurrencyCache getInstance() {
		if (currencyCache == null) {
			synchronized (CurrencyCache.class) {
				if (currencyCache == null) {
					return new CurrencyCache();
				}
			}
		}
		return currencyCache;
	}

	public void cacheAllRecords() {
		for (Currency currency : currencyDao.getAllCurrencyRate()) {
			cache.put(currency.getSourceCurrency() + " - " + currency.getDestinationCurrency(), currency);
		}
	}

	public Currency getRecord(String name) {
		return cache.get(name);
	}

}
