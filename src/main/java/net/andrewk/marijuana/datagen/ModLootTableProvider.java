package net.andrewk.marijuana.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.andrewk.marijuana.block.ModBlocks;
import net.andrewk.marijuana.block.custom.MarijuanaCropBlock;
import net.andrewk.marijuana.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {


        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.MARIJUANA_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(MarijuanaCropBlock.AGE, 5));
        addDrop(ModBlocks.MARIJUANA_CROP, cropDrops(ModBlocks.MARIJUANA_CROP, ModItems.MARIJUANA, ModItems.MARIJUANA_SEEDS, builder));
    }
}
