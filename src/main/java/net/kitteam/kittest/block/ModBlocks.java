package net.kitteam.kittest.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kitteam.kittest.KitTestGun;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MiningToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    // БЛОКИ
    public static final Block SOOT_BLOCK = registerBlock("soot_block",
            new Block(AbstractBlock.Settings.create().strength(0.3F)
                    .requiresTool().sounds(BlockSoundGroup.FUNGUS)));
    public static final Block GIGATV = registerBlock("gigatv",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,5),AbstractBlock.Settings.create().strength(2.0F)
                    .requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block SOOT_PLANKS_BLOCK = registerBlock("soot_planks_block",
            new Block (AbstractBlock.Settings.create().strength(0.1F).sounds(BlockSoundGroup.WOOD)));




    // МЕТОДЫ РЕГИСТРАЦИИ
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(KitTestGun.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(KitTestGun.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        KitTestGun.LOGGER.info("Registering Mod Blocks for " + KitTestGun.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.SOOT_BLOCK);
        });
    }
}
