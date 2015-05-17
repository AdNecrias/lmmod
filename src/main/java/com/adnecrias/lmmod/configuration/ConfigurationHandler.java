package com.adnecrias.lmmod.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static void init(File configFile) {
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try {
			//Load the configuration
			configuration.load();
			
			//Read configuration file.
			configValue = configuration.get("TestCategory", "configValue", true, "This is an example bool value.").getBoolean(true);
			
			
		} catch(Exception e) {
			//Log the Exception
		} finally {
			//Save the configuration file
			configuration.save();
		}
		
		System.out.println("!!! Value: " + configValue);
	}
}
