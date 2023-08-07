package com.capote.testmod.item;

import com.capote.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Create the item regristry of gamer budgie
    public static final Item GAMERBUDGIE = registerItem("gamerbudgie",new Item(new FabricItemSettings()));
    public static final Item GAMERBUDGIE_RAW = registerItem("gamerbudgie_raw",new Item(new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(GAMERBUDGIE);
        entries.add(GAMERBUDGIE_RAW);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        TestMod.LOGGER.debug("Registering Mod Items for "+TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
