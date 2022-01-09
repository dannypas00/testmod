package com.dannypas00.testmod;

import com.dannypas00.testmod.registerables.registries.ItemRegister;
import com.dannypas00.testmod.registerables.registries.ToolMaterialRegister;
import com.dannypas00.testmod.registerables.registries.ToolRegister;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(ModInfo.MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info(String.format("Hello from %s", ModInfo.MOD_ID));

		ItemRegister.register();
		ToolRegister.register();
		ToolMaterialRegister.register();
	}
}
