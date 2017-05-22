package redCable;

import java.io.File;

public class Game_Client extends Game_Common
{
    @Override
    public void preInit(File configFile)
    {
        super.preInit(configFile);
        Game_Item.registerItemsModels();
    }

    @Override
    public void init()
    {
        super.init();
    }
}