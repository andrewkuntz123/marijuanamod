package net.andrewk.marijuana.block;

import net.andrewk.marijuana.block.custom.SmooglyCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.andrewk.marijuana.TutorialMod;
import net.andrewk.marijuana.block.custom.MarijuanaCropBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MARIJUANA_CROP = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "marijuana_crop"),
            new MarijuanaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block SMOOGLY_CROP = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "smoogly_crop"),
            new SmooglyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
