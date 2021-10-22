package net.aloof.mobs.item.armor.WendigoSkull;

import net.aloof.mobs.Main;
import net.aloof.mobs.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum WendigoSkullMaterial implements ArmorMaterial {

    WENDIGOSKULL(Main.MOD_ID + ":wendigoskull", 55, new int[] { 5, 0, 0, 0 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.3F, () -> { return Ingredient.ofItems(ModItems.RUBY); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 0, 0, 0};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    WendigoSkullMaterial(String name, int maxDamageFactor, int[] damageReductionArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return MAX_DAMAGE_ARRAY[slot.getEntitySlotId()] * this.maxDamageFactor;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.damageReductionArray[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
