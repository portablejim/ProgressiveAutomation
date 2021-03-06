package com.vanhal.progressiveautomation.compat.mods;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.vanhal.progressiveautomation.ProgressiveAutomation;
import com.vanhal.progressiveautomation.compat.BaseMod;

public class MFR extends BaseMod {
	
	@Override
	public boolean shouldLoad() {
		ProgressiveAutomation.logger.info("MFR Loaded");
		return true;
	}
	
	@Override
	public boolean isSapling(ItemStack stack) {
		return (stack.getUnlocalizedName().compareToIgnoreCase("tile.mfr.rubberwood.sapling")==0);
	}
}
