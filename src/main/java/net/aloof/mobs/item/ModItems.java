package net.aloof.mobs.item;

import net.aloof.mobs.Main;
import net.aloof.mobs.item.armor.WendigoSkull.WendigoSkullItem;
import net.aloof.mobs.item.armor.WendigoSkull.WendigoSkullMaterial;
import net.aloof.mobs.item.armor.WendigoSkull.WendigoSkullModel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.ALOOFMOBS)));

    //spawn eggs
    public static final SpawnEggItem WENDIGO_SPAWN = registerSpawnItem("wendigo_spawn", new SpawnEggItem(Main.WENDIGO, 16777215, 14423100, new FabricItemSettings().group(ModItemGroup.ALOOFMOBS)));

    //armor
    public static final WendigoSkullItem WENDIGO_SKULL = registerWendigoSkullItem("wendigo_skull", new WendigoSkullItem(WendigoSkullMaterial.WENDIGOSKULL, EquipmentSlot.HEAD, new Item.Settings().group(ModItemGroup.ALOOFMOBS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    private static SpawnEggItem registerSpawnItem(String name, SpawnEggItem item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    private static WendigoSkullItem registerWendigoSkullItem(String name, WendigoSkullItem item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + Main.MOD_ID);
    }
}
