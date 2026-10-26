package net.kitteam.kittest.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kitteam.kittest.KitTestGun;
import net.kitteam.kittest.block.ModBlocks;
import net.kitteam.kittest.item.custom.SpannerItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup KIT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KitTestGun.MOD_ID, "kit_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CLIP))
                    .displayName(Text.translatable("itemgroup.kittestgun.kit_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CLIP);
                        entries.add(ModItems.BULLET);
                        entries.add(ModBlocks.SOOT_BLOCK);
                        entries.add(ModBlocks.SOOT_PLANKS_BLOCK);
                        entries.add(ModItems.SPANNER);
                    }).build());

    public static final ItemGroup KITW = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KitTestGun.MOD_ID, "kit_in_work"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SOOT_BLOCK))
                    .displayName(Text.translatable("itemgroup.kittestgun.kit_in_work"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SOOT_BLOCK);
                        entries.add(ModBlocks.GIGATV);
                    }).build());

    public static void registerItemGroups() {
        KitTestGun.LOGGER.info("Registering ItemGroups for KitTest for " + KitTestGun.MOD_ID);
    }
}
