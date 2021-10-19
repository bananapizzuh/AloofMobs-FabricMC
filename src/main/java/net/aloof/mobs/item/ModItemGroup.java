package net.aloof.mobs.item;

import net.aloof.mobs.Main;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ALOOFMOBS = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "aloofmobs"), () -> new ItemStack(ModItems.RUBY));
}
