package net.andrewk.marijuana.item;

import net.andrewk.marijuana.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "marijuana"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.marijuana"))
                    .icon(() -> new ItemStack(ModItems.MARIJUANA)).entries((displayContext, entries) -> {


                        entries.add(ModItems.MARIJUANA_SEEDS);
                        entries.add(ModItems.MARIJUANA);
                        entries.add(ModItems.GRINDED_MARIJUANA);
                        entries.add(ModItems.GRINDER);
                        entries.add(ModItems.JOINT);
                        entries.add(ModItems.BONG);


                    }).build());


    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
