package fr.ninedocteur.tutomod.item;

import fr.ninedocteur.tutomod.TutoCreativeTab;
import fr.ninedocteur.tutomod.TutoMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TutoItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutoMod.MOD_ID);

    public static final RegistryObject<Item> TUTO_ITEM = ITEMS.register("tuto_item", () -> new Item(new Item.Properties().tab(TutoCreativeTab.TutoTab)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
