package net.kitteam.kittest;

import net.fabricmc.api.ModInitializer;

import net.kitteam.kittest.block.ModBlocks;
import net.kitteam.kittest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KitTestGun implements ModInitializer {
	public static final String MOD_ID = "kittestgun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModIems();
		ModBlocks.registerModBlocks();
	}
}
