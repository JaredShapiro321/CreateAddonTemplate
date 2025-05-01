package io.github.jaredshapiro321.createaddontemplate;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CreateAddonTemplate.MODID)
public class CreateAddonTemplate {
    public static final String MODID = "createaddontemplate";
    
    public CreateAddonTemplate() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
