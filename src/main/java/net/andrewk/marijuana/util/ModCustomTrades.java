package net.andrewk.marijuana.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.andrewk.marijuana.item.ModItems;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.MARIJUANA, 1),
                            6, 5, 0.05f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.SMOOGLY_OG, 1),
                            2, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.MARIJUANA_SEEDS, 1),
                            2, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 16),
                            new ItemStack(Items.DIAMOND, 12),
                            new ItemStack(ModItems.SMOOGLY_JOINT, 1),
                            2, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.GRINDER, 1),
                            3, 12, 0.075f));
                });


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.LEATHER, 16),
                            new ItemStack(ModItems.GRINDER, 1),
                            1, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.MARIJUANA, 20),
                            1, 12, 0.075f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.SMOOGLY_SEEDS, 1),
                            1, 12, 0.075f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 10),
                            new ItemStack(ModItems.SMOOGLY_BONG, 1),
                            1, 12, 0.075f));
                });
    }
}
