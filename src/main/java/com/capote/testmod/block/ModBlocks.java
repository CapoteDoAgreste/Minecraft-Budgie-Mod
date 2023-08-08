package com.capote.testmod.block;

import com.capote.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block GAMERBUDGIE_BLOCK = registerBlock("gamerbudgie_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GAMERBUDGIE_RAW_BLOCK = registerBlock("gamerbudgie_raw_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block GAMERBUDGIE_ORE_BLOCK = registerBlock("gamerbudgie_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f), UniformIntProvider.create(2,5)));
    public static final Block DEEPSLATE_GAMERBUDGIE_ORE_BLOCK = registerBlock("deepslate_gamerbudgie_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(4f), UniformIntProvider.create(2,5)));
    public static final Block NETHER_GAMERBUDGIE_ORE_BLOCK = registerBlock("nether_gamerbudgie_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(1.5f), UniformIntProvider.create(2,5)));
    public static final Block END_STONE_GAMERBUDGIE_ORE_BLOCK = registerBlock("end_stone_gamerbudgie_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(4f), UniformIntProvider.create(4,7)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block){
            return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        TestMod.LOGGER.info("Registering ModBlocks for"+ TestMod.MOD_ID);
    }
}
