package ru.springochyo.testmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.springochyo.testmod.TestMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MODID);

    public static final DeferredItem<Item> BOLT = ITEMS.register("bolt",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LAMINATED_PAPER = ITEMS.register("laminated_paper",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    };

}
