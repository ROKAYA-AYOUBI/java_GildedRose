package com.gildedrose;


public class BackstagePasses extends GildedRoseCATEGORY{

	BackstagePasses(Item item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateQuality() {
		// TODO Auto-generated method stub
		 incrementQuality();
	        if (expiresBy(11)) {
	            incrementQuality();
	        }

	        if (expiresBy(6)) {
	            incrementQuality();
	        }

	        decrementSellIn();

	        if (hasExpired()) {
	            setNoQuality();
	    }
	

	}
}
