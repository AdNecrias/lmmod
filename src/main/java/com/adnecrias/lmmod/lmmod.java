package com.adnecrias.lmmod;

import com.adnecrias.lmmod.handler.ConfigurationHandler;
import com.adnecrias.lmmod.init.ModItems;
import com.adnecrias.lmmod.proxy.IProxy;
import com.adnecrias.lmmod.reference.Reference;
import com.adnecrias.lmmod.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class lmmod {
	
	@Mod.Instance(Reference.MOD_ID)
	public static lmmod instance;
	
	@SidedProxy(clientSide = "com.adnecrias.lmmod.proxy.ClientProxy", serverSide = "com.adnecrias.lmmod.proxy.ServerProxy")
	public static IProxy proxy;
	
	/*
	 * Network handling, mod config, initalise items and blocks
	 * */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	/*
	 * Register GUI, tile entities, Crafting recipes
	 */
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		LogHelper.info("Initialization Complete!");
	}
	
	/*
	 * after other mods
	 */
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		LogHelper.info("Post Initialization Complete!");
	}
}
