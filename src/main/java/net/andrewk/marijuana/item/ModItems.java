package net.andrewk.marijuana.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.andrewk.marijuana.TutorialMod;
import net.andrewk.marijuana.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Seeds
    public static final Item MARIJUANA_SEEDS = registerItem("marijuana_seeds",
            new AliasedBlockItem(ModBlocks.MARIJUANA_CROP, new FabricItemSettings()));
    public static final Item SMOOGLY_SEEDS = registerItem("smoogly_seeds",
            new AliasedBlockItem(ModBlocks.SMOOGLY_CROP, new FabricItemSettings()));

    //Marijuana Strains
    public static final Item MARIJUANA = registerItem("marijuana", new Item(new FabricItemSettings()));
    public static final Item SMOOGLY_OG = registerItem("smoogly_og", new Item(new FabricItemSettings()));

    //Grinded Marijuana Strains
    public static final Item GRINDED_MARIJUANA = registerItem("grinded_marijuana", new Item(new FabricItemSettings()));
    public static final Item GRINDED_SMOOGLY_OG = registerItem("grinded_smoogly_og", new Item(new FabricItemSettings()));

    //Tools
    public static final Item GRINDER = registerItem("grinder", new Item(new FabricItemSettings()));

    //Smokeable Itmes
    public static final Item JOINT = registerItem("joint", new Item(new FabricItemSettings().food(ModFoodComponents.BASE_STONED)));
    public static final Item BONG = registerItem("bong", new Item(new FabricItemSettings()));
    public static final Item MARIJUANA_BONG = registerItem("marijuana_bong", new Item(new FabricItemSettings().food(ModFoodComponents.BASE_STONED)));
    public static final Item SMOOGLY_JOINT = registerItem("smoogly_joint", new Item(new FabricItemSettings().food(ModFoodComponents.SMOOGLY_STONED)));
    public static final Item SMOOGLY_BONG = registerItem("smoogly_bong", new Item(new FabricItemSettings().food(ModFoodComponents.SMOOGLY_STONED)));






    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
