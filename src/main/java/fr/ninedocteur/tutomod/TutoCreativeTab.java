package fr.ninedocteur.tutomod;

import fr.ninedocteur.tutomod.item.TutoItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class TutoCreativeTab {
    public static final CreativeModeTab TutoTab = new CreativeModeTab("tuto_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(TutoItem.TUTO_ITEM.get());
        }
    };
}
