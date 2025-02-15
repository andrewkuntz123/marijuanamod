package net.andrewk.marijuana;

import net.andrewk.marijuana.item.ModItemGroups;
import net.andrewk.marijuana.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.andrewk.marijuana.block.ModBlocks;
import net.andrewk.marijuana.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "highharvest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
			ModItems.registerModItems();
			ModBlocks.registerModBlocks();
			ModItemGroups.registerItemGroups();
			ModLootTableModifiers.modifyLootTables();

	}
}