package com.smxx1337.bettercheststorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.smxx1337.bettercheststorage.items.StorageChip;
import com.smxx1337.bettercheststorage.lists.ItemsList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bettercheststorage")
public class BetterChestStorage {

	public static BetterChestStorage instance;
	public static String MODID = "bettercheststorage";
	public static Logger LOGGER = LogManager.getLogger(MODID);
	
	public BetterChestStorage() {
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	void setup(final FMLCommonSetupEvent event) {
		
	}
	
	void clientRegistries(final FMLCommonSetupEvent event) {
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegsitryEvents {
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			LOGGER.info("Registring new items...");
			
			event.getRegistry().registerAll(
				ItemsList.storage_chip_item = new StorageChip("storage_chip_item", ItemGroup.MATERIALS).register()
			);
		}
	}
}
