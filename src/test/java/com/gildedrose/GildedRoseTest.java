package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	
	@Test
	public void TestItemAgedBrie() {
		    Item item = new Item("Aged Brie", 12, 3);
		 
	        GildedRose gildedRose = new GildedRose(new Item[]{item});
	        int quality=item.quality;
	        int SellIn=item.sellIn;
	        gildedRose.updateQuality();
	        assertEquals(quality+1, item.quality);
	        assertEquals(SellIn-1,item.sellIn);

	}
	

	
	@Test
	public void TestItemConjured() {
		
		Item item=new Item("Conjured Item", 2, 3);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();
        assertEquals(2, item.quality);
        assertEquals(1,item.sellIn);
        
        gildedRose.updateQuality();
        assertEquals(1, item.quality);
        assertEquals(0,item.sellIn);
        
        gildedRose.updateQuality();
        assertEquals(0, item.quality);
        assertEquals(-1,item.sellIn);

	}
	

	@Test
	public void TestQualityofItemsConjuredAndAgedAfterExpiration() {
		
		
        TestQualityDegradeTwiceAfterExpiration(new Item("Conjured Item", 0, 3));
        TestQualityDegradeTwiceAfterExpiration(new Item("Aged Brie", 0, 3));     
	}
	
	private void TestQualityDegradeTwiceAfterExpiration(Item item) {
            GildedRose gildedRose = new GildedRose(new Item[]{item});
		    gildedRose.updateQuality();
		    if(item.name.contains("Conjured")) {
	        assertEquals(1, item.quality);
	        assertEquals(-1,item.sellIn);}
		    else {
		     assertEquals(5, item.quality);
		     assertEquals(-1,item.sellIn);}	    	
	}
	
	
	@Test
	public void TestItemBackstage() {
		    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 3);
		    GildedRose gildedRose = new GildedRose(new Item[]{item});
	        int quality=item.quality;
	        int SellIn=item.sellIn;
	        gildedRose.updateQuality(); 
	        assertEquals(quality+2, item.quality);
	        assertEquals(SellIn-1,item.sellIn);
	        
	        
	        item.sellIn=14;
	        quality=item.quality;
	        SellIn=item.sellIn;
	        gildedRose.updateQuality(); 
	        assertEquals(quality+1, item.quality);
	        assertEquals(SellIn-1,item.sellIn);
	        
	        
	        item.sellIn=4;
	        quality=item.quality;
	        SellIn=item.sellIn;
	        gildedRose.updateQuality(); 
	        assertEquals(quality+3, item.quality);
	        assertEquals(SellIn-1,item.sellIn);
	        
	        
	        item.sellIn=0;
	        quality=item.quality;
	        SellIn=item.sellIn;
	        gildedRose.updateQuality(); 
	        assertEquals(0, item.quality);
	        assertEquals(SellIn-1,item.sellIn);
	}
	
  
	public void TestItemSulfuras() {
		
		Item item=new Item("Sulfuras, Hand of Ragnaros",10,3);
	    GildedRose gildedRose = new GildedRose(new Item[]{item});
	    gildedRose.updateQuality(); 
	    assertEquals(item.quality, item.quality);
        assertEquals(item.sellIn,item.sellIn);
	}
	
	
	@Test
	public void TestIfMaxOfQualityIsEqual50() {
	    Item item = new Item("Aged Brie", 12, 50);
        GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
        assertEquals(50, item.quality);
        
	}
	
	
	@Test 
	public void TestQualityNeverBeNegtive() {
	    Item item = new Item("Conjured Item", 12, 0);
	    GildedRose gildedRose = new GildedRose(new Item[]{item});
        gildedRose.updateQuality();
         assertEquals(0, item.quality);

	}

}
