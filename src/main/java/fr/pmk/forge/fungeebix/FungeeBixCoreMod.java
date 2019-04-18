package fr.pmk.forge.fungeebix;

import java.util.Map;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import org.apache.logging.log4j.Level;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import fr.pmk.commons.fungeebix.FungeeBixCommonsMixins;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class FungeeBixCoreMod implements IFMLLoadingPlugin{

	@SuppressWarnings("deprecation")
	public FungeeBixCoreMod() {
		
		FMLLog.log(Level.INFO, "FungeeBix core loading");
		
		FungeeBixCommonsMixins.init();
		Mixins.addConfiguration("mixins.fungeebix.forge.json");
		
		FMLLog.log(Level.INFO, "FungeeBix core loaded");
		
	}
	
	@Override
	public String[] getASMTransformerClass() {
		// TODO Auto-generated method stub
		return new String[0];
	}

	@Override
	public String getModContainerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAccessTransformerClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
