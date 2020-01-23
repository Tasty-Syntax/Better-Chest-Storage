package com.smxx1337.bettercheststorage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
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
}
