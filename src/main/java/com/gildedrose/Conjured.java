package com.gildedrose;


public class Conjured extends GildedRoseCATEGORY{

	Conjured(Item item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		// TODO Auto-generated method stub
		    decrementQuality();

	        decrementSellIn();

	        if (hasExpired()) {
	            decrementQuality();
	        }
	}

	

}
