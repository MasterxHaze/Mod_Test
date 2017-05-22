package redCable;


import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TheModid.MODID, name = "Mod Tutorial", version = "1.11.2", acceptedMinecraftVersions = "[1.11.2]")
public class TheModid
{
    public static final String MODID = "tutorial";
    
    @Instance(TheModid.MODID)
    public static TheModid instance;
    
    @SidedProxy(clientSide = "fr.minecraftforgefrance.tutorial.TutorialClient", serverSide = "fr.minecraftforgefrance.tutorial.TutorialServer")
    public static Game_Common proxy;
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }
}