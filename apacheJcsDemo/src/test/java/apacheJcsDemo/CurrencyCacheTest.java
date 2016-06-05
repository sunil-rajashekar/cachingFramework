package apacheJcsDemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.thinkbigprg.cache.CurrencyCache;

public class CurrencyCacheTest {
	private CurrencyCache currencyCache;

	@Before
	public void setup() {
		currencyCache = CurrencyCache.getInstance();
	}

	@Test
	public void validateCachingFramework() throws InterruptedException {
		currencyCache.cacheAllRecords();

		assertAllCurrencyRecords();
		assertCacheResultsExpireAfter4Seconds();
	}

	private void assertAllCurrencyRecords() {
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Canadian Dollar, exchangeRate=1.29368]",
				currencyCache.getRecord("US Dollar - Canadian Dollar").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=British Pound, exchangeRate=0.688942]",
				currencyCache.getRecord("US Dollar - British Pound").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Chinese Yuan Renminbi, exchangeRate=6.5668]",
				currencyCache.getRecord("US Dollar - Chinese Yuan Renminbi").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Malaysian Ringgit, exchangeRate=4.09125]",
				currencyCache.getRecord("US Dollar - Malaysian Ringgit").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Indian Rupee, exchangeRate=66.781]",
				currencyCache.getRecord("US Dollar - Indian Rupee").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Japanese Yen, exchangeRate=106.61]",
				currencyCache.getRecord("US Dollar - Japanese Yen").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Swiss Franc, exchangeRate=0.976035]",
				currencyCache.getRecord("US Dollar - Swiss Franc").toString());
		Assert.assertEquals("Currency [sourceCurrency=US Dollar, destinationCurrency=Euro, exchangeRate=0.879815]",
				currencyCache.getRecord("US Dollar - Euro").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Australian Dollar, exchangeRate=1.358142]",
				currencyCache.getRecord("US Dollar - Australian Dollar").toString());
		Assert.assertEquals(
				"Currency [sourceCurrency=US Dollar, destinationCurrency=Singapore Dollar, exchangeRate=1.356335]",
				currencyCache.getRecord("US Dollar - Singapore Dollar").toString());
	}

	private void assertCacheResultsExpireAfter4Seconds() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertNull(currencyCache.getRecord("US Dollar - Singapore Dollar"));

	}
}
