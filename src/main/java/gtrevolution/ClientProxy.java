package gtrevolution;

import gtrevolution.block.MetaBlocks;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;


@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    public void preInit() {
        super.preInit();
        new GRTextures();
    }

    public void postInit()
    {

    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        MetaBlocks.registerItemModels();
    }
}
