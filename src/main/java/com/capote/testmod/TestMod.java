package com.capote.testmod;

import com.capote.testmod.block.ModBlocks;
import com.capote.testmod.item.ModItems;
import com.capote.testmod.item.ModelItemGroups;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModelItemGroups.registerItemsGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}