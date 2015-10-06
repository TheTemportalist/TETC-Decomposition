package com.temportalist.thaumicexpansion.common.block

import com.temportalist.origin.api.common.block.BlockTile
import com.temportalist.thaumicexpansion.common.TEC
import com.temportalist.thaumicexpansion.common.tile.TEAnalyzer
import net.minecraft.block.material.Material
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.util.MathHelper
import net.minecraft.world.{IBlockAccess, World}
import net.minecraftforge.common.util.ForgeDirection

/**
 *
 *
 * @author TheTemportalist
 */
class BlockAnalyzer(name: String) extends BlockTile(
	Material.rock, TEC.MODID, name, classOf[TEAnalyzer]) {

	this.setHardness(15F)
	this.setResistance(25F)

	override def getRenderType: Int = -1

	override def isOpaqueCube: Boolean = false

	/*
	override def getSubBlocks(item: Item, tab: CreativeTabs, list: util.List[_]): Unit = {
		for (stack: ItemStack <- TECBlocks.analyzerStacks)
			list.asInstanceOf[util.List[ItemStack]].add(stack)
	}
	*/

	override def isSideSolid(world: IBlockAccess, x: Int, y: Int, z: Int,
			side: ForgeDirection): Boolean = side == ForgeDirection.DOWN

	override def onBlockPlacedBy(world: World, x: Int, y: Int, z: Int, placer: EntityLivingBase,
			stack: ItemStack): Unit = {
		world.getTileEntity(x, y, z) match {
			case tile: TEAnalyzer =>
				if (tile == null || stack.getTagCompound == null) return
				tile.setTier(stack.getTagCompound.getInteger("tier"))
				val facing: Int =
					MathHelper.floor_double(placer.rotationYaw * 4.0F / 360.0F + 0.5D) & 0x3
				tile.setFacing(facing match {
					case 0 => 2
					case 1 => 5
					case 2 => 3
					case 3 => 4
					case 4 => 1
					case 5 => 0
					case _ => -1
				})
				tile.setMode(ItemStack.loadItemStackFromNBT(
					stack.getTagCompound.getCompoundTag("mode")), placer)
			case _ =>
		}
	}

	override def onBlockActivated(world: World, x: Int, y: Int, z: Int, player: EntityPlayer,
			side: Int, offsetX: Float, offsetY: Float, offsetZ: Float): Boolean = {
		if (!player.isSneaking) {
			player.openGui(TEC, 0, world, x, y, z)
			true
		}
		else false
	}

}
