package com.gildedrose;

public class GildedRoseCATEGORY implements GildedRoseltem{
	
	private final Item item;
	
	public GildedRoseCATEGORY(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}

	/* This function decrees the deadline of  sales sellIn*/
	@Override
	public void decrementSellIn() {
		// TODO Auto-generated method stub
		 item.sellIn = item.sellIn - 1;
	}

	@Override
	public boolean hasExpired() {
		// TODO Auto-generated method stub
		   return expiresBy(0);
	}

	@Override
	public boolean expiresBy(int expiryTime) {
		// TODO Auto-generated method stub
		return item.sellIn < expiryTime;
	}

	@Override
	public void decrementQuality() {
		/* we must always test if the quality is > 0 before the decrementation 
		 * because the quality must never be negative
		 */
		 if (item.quality > 0) {
	        item.quality = item.quality - 1;}
	}

	@Override
	public void incrementQuality() {
		 /* the quality must not exceed 50*/
		 /* First, we  test if the quality < 50 */
		 /* as a result, it is increased */
		 if (item.quality < 50) {
	            item.quality = item.quality + 1;
	        }
	}

	@Override
	public void setNoQuality() {
		// TODO Auto-generated method stub
		item.quality = 0;
	}

	@Override
	public void updateQuality() {
		// TODO Auto-generated method stub
		
	}

	
}
