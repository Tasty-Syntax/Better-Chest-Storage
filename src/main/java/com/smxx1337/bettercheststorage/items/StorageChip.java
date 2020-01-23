package com.smxx1337.bettercheststorage.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class StorageChip extends ModItem{

	ResourceLocation location;
	Properties properties;
	
	public StorageChip(String name, ItemGroup group) {
		super(name, group);
	}
	
	public Item register() {
		return new Item(new Item.Properties().group(this.group)).setRegistryName(location);
	}
	
}
