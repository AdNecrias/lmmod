package com.adnecrias.lmmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "lmmod", name = "lmmod", version = "1.7.10-1.0")
public class lmmod {
	
	@Mod.Instance("lmmod")
	public static lmmod instance;
	
	/*
	 * Network handling, mod config, initalise items and blocks
	 * */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	/*
	 * Register GUI, tile entities, Crafting recipes
	 */
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	/*
	 * after other mods
	 */
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
