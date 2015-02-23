package com.temportalist.scanner.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * @author TheTemportalist
 */
public enum EnumDecomposerSide {

	/*
		permutations:
			blank - default side
			INPUT & OUTPUT - empty
			INPUT - blue
			OUTPUT ALL - orange
			OUTPUT Thaumcraft - purple
			OUTPUT essentia - green
			OUTPUT vis - yellow
			OUTPUT items - red
	 */

	NONE("default"),
	IO("io"),
	INPUT_ITEM("blue"),
	OUTPUT("orange"),
	OUTPUT_ITEM("red"),
	OUTPUT_THAUM("purple"),
	OUTPUT_VIS("yellow"),
	OUTPUT_ESSENTIA("green");

	private final String name;
	@SideOnly(Side.CLIENT)
	private IIcon icons[] = new IIcon[4];

	private EnumDecomposerSide(String name) {
		this.name = name;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcon(IIconRegister reg, String base) {
		for (int i = 0; i < 3; i++) {
			this.icons[i] = reg.registerIcon(base + "/side" + i + "/colours/" + this.name);
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side) {
		return this.icons[side > 1 ? 2 : side];
	}

	public EnumDecomposerSide next() {
		int i = this.ordinal() + 1;
		if (i >= EnumDecomposerSide.values().length)
			i = 0;
		return EnumDecomposerSide.values()[i];
	}

	public EnumDecomposerSide last() {
		int i = this.ordinal() - 1;
		if (i < 0)
			i = EnumDecomposerSide.values().length - 1;
		return EnumDecomposerSide.values()[i];
	}

}
