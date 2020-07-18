package com.papafumprdink.magicmod.items;

import com.papafumprdink.magicmod.Main;
import com.papafumprdink.magicmod.init.ModItems;
import com.papafumprdink.magicmod.utilities.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void RegisterModels()
    {
        Main.proxy.RegisterItemRenderer(this, 0, "inventory");
    }
}
