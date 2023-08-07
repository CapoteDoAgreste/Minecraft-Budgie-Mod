package com.capote.testmod.item;

import com.capote.testmod.TestMod;
import com.capote.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModelItemGroups {
    //Create a tab on inventory to group budgies items
    public static final ItemGroup BUDGIE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID,"gamerbudgie"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gamerbudgie"))
            .icon(()-> new ItemStack(ModItems.GAMERBUDGIE)).entries((displayContext, entries) -> {
                //inserting budgie items
                entries.add(ModItems.GAMERBUDGIE);
                entries.add(ModItems.GAMERBUDGIE_RAW);
                entries.add(ModBlocks.GAMERBUDGIE_BLOCK);
                entries.add(ModBlocks.GAMERBUDGIE_RAW_BLOCK);


            }).build());
    public static void registerItemsGroups(){
        TestMod.LOGGER.info("Registering Item Groups for "+ TestMod.MOD_ID);
    }
}
