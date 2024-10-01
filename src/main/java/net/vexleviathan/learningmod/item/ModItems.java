package net.vexleviathan.learningmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vexleviathan.learningmod.LearningMod;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> MYTHIC_ESSENCE = ITEMS.register("mythic_essence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_BACK = ITEMS.register("blank_back",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_HEAD = ITEMS.register("blank_head",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_BELT = ITEMS.register("blank_belt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_BOOTS = ITEMS.register("blank_boots",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_CHARM = ITEMS.register("blank_charm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_GLOVE = ITEMS.register("blank_glove",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_MASK = ITEMS.register("blank_mask",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_RING = ITEMS.register("blank_ring",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_NECKLACE = ITEMS.register("blank_necklace",
            () -> new Item(new Item.Properties()));


}
