package org.thinkbigprg.dao;

import java.util.LinkedList;
import java.util.List;

import org.thinkbigprg.domain.Currency;

public class CurrencyDao {

	public List<Currency> getAllCurrencyRate() {
		List<Currency> currencies = new LinkedList<>();

		currencies.add(new Currency("US Dollar", "Euro", 0.879815d));
		currencies.add(new Currency("US Dollar", "British Pound", 0.688942));
		currencies.add(new Currency("US Dollar", "Indian Rupee", 66.781000));
		currencies.add(new Currency("US Dollar", "Australian Dollar", 1.358142));
		currencies.add(new Currency("US Dollar", "Canadian Dollar", 1.293680));
		currencies.add(new Currency("US Dollar", "Singapore Dollar", 1.356335));
		currencies.add(new Currency("US Dollar", "Swiss Franc", 0.976035));
		currencies.add(new Currency("US Dollar", "Malaysian Ringgit", 4.091250));
		currencies.add(new Currency("US Dollar", "Japanese Yen", 106.610000));
		currencies.add(new Currency("US Dollar", "Chinese Yuan Renminbi", 6.566800));

		return currencies;
	}
}
