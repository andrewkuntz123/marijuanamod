package net.andrewk.marijuana.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ModFoodComponents {
    public static final FoodComponent BASE_STONED = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 160, 1), 0.3F)
            .build();

    public static final FoodComponent SMOOGLY_STONED = new FoodComponent.Builder().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 1), 0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 1), 0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 160, 1), 0.3F)
            .build();
}

