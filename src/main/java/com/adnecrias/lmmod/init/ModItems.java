package com.adnecrias.lmmod.init;

import com.adnecrias.lmmod.item.ItemMapleLeaf;
import com.adnecrias.lmmod.item.Itemllmod;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final Itemllmod mapleLeaf = new ItemMapleLeaf();
	
	public static void init() {
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
