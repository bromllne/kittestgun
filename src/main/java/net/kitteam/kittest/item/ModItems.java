package net.kitteam.kittest.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kitteam.kittest.KitTestGun;
import net.kitteam.kittest.item.custom.SpannerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // ПРЕДМЕТЫ
    public static final Item BULLET = registerItem("bullet", new Item(new Item.Settings()));
    public static final Item CLIP = registerItem("clip", new Item(new Item.Settings()));
    public static final Item SPANNER = registerItem("spanner", new SpannerItem(new Item.Settings().maxDamage(9)));




    // МЕТОДЫ РЕГИСТРАЦИИ
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KitTestGun.MOD_ID, name), item);
    }

    public static void registerModIems() {
        KitTestGun.LOGGER.info("Registering Mod Items for " + KitTestGun.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BULLET);
            entries.add(CLIP);
        });
    }


}
