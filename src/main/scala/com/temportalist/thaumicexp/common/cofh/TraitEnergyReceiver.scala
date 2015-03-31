package com.temportalist.thaumicexp.common.cofh

import cofh.api.energy.{EnergyStorage, IEnergyReceiver}
import net.minecraft.tileentity.TileEntity
import net.minecraftforge.common.util.ForgeDirection

/**
 *
 *
 * @author TheTemportalist
 */
//@Optional.Interface(modid = "CoFHLib", iface = "TraitEnergyReceiver", striprefs = false)
trait TraitEnergyReceiver extends TileEntity with IEnergyReceiver {
	
	def storage: EnergyStorage = new EnergyStorage(this.getMaxEnergy())

	def getMaxEnergy(): Int
	
	override def receiveEnergy(direction: ForgeDirection, amount: Int, doOp: Boolean): Int = {
		val amt: Int = this.storage.receiveEnergy(amount, doOp)
		this.markDirty()
		amt
	}

	override def getEnergyStored(direction: ForgeDirection): Int = this.storage.getEnergyStored

	override def getMaxEnergyStored(direction: ForgeDirection): Int = this.storage.getMaxEnergyStored

	override def canConnectEnergy(direction: ForgeDirection): Boolean = true

}
