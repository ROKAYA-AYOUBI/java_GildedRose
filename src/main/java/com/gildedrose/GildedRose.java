package com.gildedrose;

 
public class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		super();
		this.items = items;
	}

	//verification method:
	/*
	 * depending on the type of article, we instantiate their associated class
	 */
	static GildedRoseltem verification(Item item) {
		if (AGEDBRIE(item)) {
			return new AgedBrie(item);
		}
		if (BACKSTAGEPASSES(item)) {
			return new BackstagePasses(item);
		}
		if (SULFURAS(item)) {
			return new Sulfuras(item);
		}
		return new Conjured(item);
	}

	static boolean AGEDBRIE(Item item) {
		return item.name.equals("Aged Brie");
	}

	static boolean BACKSTAGEPASSES(Item item) {
		return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
	}

	static boolean SULFURAS(Item item) {
		return item.name.equals("Sulfuras, Hand of Ragnaros");
	}

	// updateQuality method: decrement or increase quality and Sellin.
	// 
	/*
	 * this method  is redefined in each class which describes the type of article.
	 * 
	 */
	

	public void updateQuality() {
		for (Item item : items) {
			verification(item).updateQuality();
		}
	}

}
