package com.smxx1337.bettercheststorage.items;

import com.smxx1337.bettercheststorage.BetterChestStorage;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public abstract class ModItem extends Item {

	ResourceLocation location;
	Properties properties;
	
	public ModItem(String name, ItemGroup group) {
		super(new Item.Properties().group(group));
		location = new ResourceLocation(BetterChestStorage.MODID, name);
	}
	
	public Item register() {
		return new Item(new Item.Properties().group(this.group)).setRegistryName(location);
	}

}
