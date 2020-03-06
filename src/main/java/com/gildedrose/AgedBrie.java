package com.gildedrose;


public class AgedBrie extends GildedRoseCATEGORY {

	public AgedBrie(Item item) {
		// TODO Auto-generated constructor stub
		super(item);
	}
	
	@Override
	public void updateQuality() {

		    incrementQuality();

	        decrementSellIn();
	
	        if (hasExpired()) {
	            incrementQuality();
	        }
	}


}
