package com.adnecrias.lmmod.handler;

import java.io.File;

import com.adnecrias.lmmod.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	
	public static boolean configValue = false;
	
	public static void init(File configFile) {
		
		if(configuration == null){

			configuration = new Configuration(configFile);
			loadConfiguration();
		}
		
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		configValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "Example config value");
		
		if(configuration.hasChanged()) {
			configuration.save();
		}
	}
}
