package duikt.industriality.items;

import duikt.industriality.Industriality;
import duikt.industriality.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Industriality.MODID);
    public static final RegistryObject<CreativeModeTab> INDUSTRIALITY_TAB =
            CREATIVE_MODE_TABS.register("industriality_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MONEY.get()))
                    .title(Component.translatable("creativetab.industriality_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MONEY.get());
                        output.accept(ModBlocks.MONEY_BLOCK.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.STEEL_NUGGET.get());
                        output.accept(ModItems.STEEL_PLATE.get());
                        output.accept(ModItems.STEEL_ROD.get());
                        output.accept(ModItems.STEEL_SCREW.get());

                    })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
