package com.drullkus.decomposerModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Decomposer - Drullkus
 * Created using Tabula 4.1.1
 */
public class Decomposer extends ModelBase {
    public ModelRenderer Device3;
    public ModelRenderer Device1;
    public ModelRenderer Device2;
    public ModelRenderer Device4;
    public ModelRenderer Block1;
    public ModelRenderer Block2;
    public ModelRenderer Frame1;
    public ModelRenderer Frame2;
    public ModelRenderer Frame3;
    public ModelRenderer Frame4;
    public ModelRenderer Frame1_1;
    public ModelRenderer Frame2_1;
    public ModelRenderer Frame3_1;
    public ModelRenderer Frame4_1;
    public ModelRenderer Frame1_2;
    public ModelRenderer Frame2_2;
    public ModelRenderer Frame3_2;
    public ModelRenderer Frame4_2;
    public ModelRenderer Frame1_3;
    public ModelRenderer Frame2_3;
    public ModelRenderer Frame3_3;
    public ModelRenderer Frame4_3;
    public ModelRenderer Frame5;
    public ModelRenderer Frame6;
    public ModelRenderer Arm1;
    public ModelRenderer Arm2;
    public ModelRenderer Arm3;
    public ModelRenderer Arm1_1;
    public ModelRenderer Arm2_1;
    public ModelRenderer Arm3_1;

    public Decomposer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Frame2 = new ModelRenderer(this, 1, 0);
        this.Frame2.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame2.addBox(-7.0F, -2.5F, -8.0F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame2, 0.0F, 1.5707963267948966F, 0.0F);
        this.Frame3 = new ModelRenderer(this, 0, 0);
        this.Frame3.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame3.addBox(-8.0F, -2.5F, -8.0F, 16, 1, 1, 0.0F);
        this.setRotateAngle(Frame3, 0.0F, 3.141592653589793F, 0.0F);
        this.Frame4_3 = new ModelRenderer(this, 0, 1);
        this.Frame4_3.setRotationPoint(-7.49F, 18.0F, -8.0F);
        this.Frame4_3.addBox(-0.5F, -14.0F, 0.0F, 1, 14, 1, 0.0F);
        this.setRotateAngle(Frame4_3, -1.1693705988362009F, 0.0F, 0.0F);
        this.Frame5 = new ModelRenderer(this, 0, 0);
        this.Frame5.setRotationPoint(0.0F, 13.09F, 5.48F);
        this.Frame5.addBox(-7.0F, -0.5F, -0.5F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame5, 1.186823891356144F, 3.141592653589793F, 0.0F);
        this.Device1 = new ModelRenderer(this, 29, 0);
        this.Device1.setRotationPoint(0.0F, 11.32F, 0.0F);
        this.Device1.addBox(-2.5F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
        this.Frame1 = new ModelRenderer(this, 0, 0);
        this.Frame1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame1.addBox(-8.0F, -2.5F, -8.0F, 16, 1, 1, 0.0F);
        this.Arm2_1 = new ModelRenderer(this, 0, 0);
        this.Arm2_1.setRotationPoint(-7.15F, 14.0F, -7.15F);
        this.Arm2_1.addBox(-2.5F, 0.0F, 0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Arm2_1, 0.2792526803190927F, 0.0F, 0.2792526803190927F);
        this.Block1 = new ModelRenderer(this, 0, 22);
        this.Block1.setRotationPoint(0.0F, 18.5F, 0.0F);
        this.Block1.addBox(-7.5F, 0.0F, -7.5F, 15, 5, 15, 0.3F);
        this.Frame4_1 = new ModelRenderer(this, 1, 0);
        this.Frame4_1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame4_1.addBox(-7.0F, 2.5F, -8.0F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame4_1, 0.0F, -1.5707963267948966F, 0.0F);
        this.Arm3 = new ModelRenderer(this, 0, 0);
        this.Arm3.setRotationPoint(5.0F, 10.0F, -5.0F);
        this.Arm3.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.2F);
        this.setRotateAngle(Arm3, 0.6108652381980153F, 0.0F, 0.6108652381980153F);
        this.Frame1_1 = new ModelRenderer(this, 0, 0);
        this.Frame1_1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame1_1.addBox(-8.0F, 2.5F, -8.0F, 16, 1, 1, 0.0F);
        this.Frame4_2 = new ModelRenderer(this, 0, 2);
        this.Frame4_2.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame4_2.addBox(7.0F, -1.5F, 7.0F, 1, 4, 1, 0.0F);
        this.Frame6 = new ModelRenderer(this, 0, 0);
        this.Frame6.setRotationPoint(0.0F, 18.0F, -8.0F);
        this.Frame6.addBox(-7.0F, 0.0F, -1.0F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame6, -0.3839724354387525F, 3.141592653589793F, 0.0F);
        this.Device2 = new ModelRenderer(this, 0, 22);
        this.Device2.setRotationPoint(0.0F, 10.25F, 0.0F);
        this.Device2.addBox(-3.0F, 0.0F, -3.0F, 6, 2, 6, 0.0F);
        this.Block2 = new ModelRenderer(this, 0, 2);
        this.Block2.setRotationPoint(0.0F, 18.0F, -7.5F);
        this.Block2.addBox(-7.5F, 0.0F, 0.0F, 15, 6, 14, 0.05F);
        this.setRotateAngle(Block2, 0.3839724354387525F, 0.0F, 0.0F);
        this.Frame1_3 = new ModelRenderer(this, 0, 2);
        this.Frame1_3.setRotationPoint(7.49F, 18.0F, 8.0F);
        this.Frame1_3.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Frame1_3, 0.3839724354387525F, 0.0F, 0.0F);
        this.Arm2 = new ModelRenderer(this, 0, 0);
        this.Arm2.setRotationPoint(7.15F, 14.0F, -7.15F);
        this.Arm2.addBox(-2.5F, 0.0F, 0.5F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Arm2, 0.2792526803190927F, 0.0F, 0.2792526803190927F);
        this.Arm1 = new ModelRenderer(this, 0, 0);
        this.Arm1.setRotationPoint(7.0F, 14.0F, -7.0F);
        this.Arm1.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Arm1, 0.17453292519943295F, 0.0F, 0.17453292519943295F);
        this.Arm3_1 = new ModelRenderer(this, 0, 0);
        this.Arm3_1.setRotationPoint(-5.0F, 10.0F, -5.0F);
        this.Arm3_1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1, 0.2F);
        this.setRotateAngle(Arm3_1, 0.6108652381980153F, 0.0F, 0.6108652381980153F);
        this.Frame3_3 = new ModelRenderer(this, 0, 1);
        this.Frame3_3.setRotationPoint(7.49F, 18.0F, -8.0F);
        this.Frame3_3.addBox(-0.5F, -14.0F, 0.0F, 1, 14, 1, 0.0F);
        this.setRotateAngle(Frame3_3, -1.1693705988362009F, 0.0F, 0.0F);
        this.Device4 = new ModelRenderer(this, 0, 30);
        this.Device4.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.Device4.addBox(-2.5F, 0.0F, -2.5F, 5, 1, 5, -0.1F);
        this.Frame4 = new ModelRenderer(this, 1, 0);
        this.Frame4.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame4.addBox(-7.0F, -2.5F, -8.0F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame4, 0.0F, -1.5707963267948966F, 0.0F);
        this.Device3 = new ModelRenderer(this, 0, 30);
        this.Device3.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.Device3.addBox(-2.5F, 0.0F, -2.5F, 5, 1, 5, 0.0F);
        this.Frame2_3 = new ModelRenderer(this, 0, 2);
        this.Frame2_3.setRotationPoint(-7.49F, 18.0F, 8.0F);
        this.Frame2_3.addBox(-0.5F, -6.0F, -1.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(Frame2_3, 0.3839724354387525F, 0.0F, 0.0F);
        this.Frame2_2 = new ModelRenderer(this, 0, 2);
        this.Frame2_2.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame2_2.addBox(7.0F, -1.5F, 7.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frame2_2, 0.0F, 3.141592653589793F, 0.0F);
        this.Frame1_2 = new ModelRenderer(this, 0, 2);
        this.Frame1_2.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame1_2.addBox(7.0F, -1.5F, 7.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frame1_2, 0.0F, 1.5707963267948966F, 0.0F);
        this.Frame3_2 = new ModelRenderer(this, 0, 2);
        this.Frame3_2.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame3_2.addBox(7.0F, -1.5F, 7.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(Frame3_2, 0.0F, -1.5707963267948966F, 0.0F);
        this.Arm1_1 = new ModelRenderer(this, 0, 0);
        this.Arm1_1.setRotationPoint(-7.0F, 14.0F, -7.0F);
        this.Arm1_1.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Arm1_1, 0.17453292519943295F, 0.0F, 0.17453292519943295F);
        this.Frame2_1 = new ModelRenderer(this, 1, 0);
        this.Frame2_1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame2_1.addBox(-7.0F, 2.5F, -8.0F, 14, 1, 1, 0.0F);
        this.setRotateAngle(Frame2_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.Frame3_1 = new ModelRenderer(this, 0, 0);
        this.Frame3_1.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Frame3_1.addBox(-8.0F, 2.5F, -8.0F, 16, 1, 1, 0.0F);
        this.setRotateAngle(Frame3_1, 0.0F, 3.141592653589793F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Frame2.render(f5);
        this.Frame3.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Frame4_3.offsetX, this.Frame4_3.offsetY, this.Frame4_3.offsetZ);
        GL11.glTranslatef(this.Frame4_3.rotationPointX * f5, this.Frame4_3.rotationPointY * f5, this.Frame4_3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.95D, 1.0D);
        GL11.glTranslatef(-this.Frame4_3.offsetX, -this.Frame4_3.offsetY, -this.Frame4_3.offsetZ);
        GL11.glTranslatef(-this.Frame4_3.rotationPointX * f5, -this.Frame4_3.rotationPointY * f5, -this.Frame4_3.rotationPointZ * f5);
        this.Frame4_3.render(f5);
        GL11.glPopMatrix();
        this.Frame5.render(f5);
        this.Device1.render(f5);
        this.Frame1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Arm2_1.offsetX, this.Arm2_1.offsetY, this.Arm2_1.offsetZ);
        GL11.glTranslatef(this.Arm2_1.rotationPointX * f5, this.Arm2_1.rotationPointY * f5, this.Arm2_1.rotationPointZ * f5);
        GL11.glScaled(-1.0D, -1.0D, 1.0D);
        GL11.glTranslatef(-this.Arm2_1.offsetX, -this.Arm2_1.offsetY, -this.Arm2_1.offsetZ);
        GL11.glTranslatef(-this.Arm2_1.rotationPointX * f5, -this.Arm2_1.rotationPointY * f5, -this.Arm2_1.rotationPointZ * f5);
        this.Arm2_1.render(f5);
        GL11.glPopMatrix();
        this.Block1.render(f5);
        this.Frame4_1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Arm3.offsetX, this.Arm3.offsetY, this.Arm3.offsetZ);
        GL11.glTranslatef(this.Arm3.rotationPointX * f5, this.Arm3.rotationPointY * f5, this.Arm3.rotationPointZ * f5);
        GL11.glScaled(1.0D, -1.0D, 1.0D);
        GL11.glTranslatef(-this.Arm3.offsetX, -this.Arm3.offsetY, -this.Arm3.offsetZ);
        GL11.glTranslatef(-this.Arm3.rotationPointX * f5, -this.Arm3.rotationPointY * f5, -this.Arm3.rotationPointZ * f5);
        this.Arm3.render(f5);
        GL11.glPopMatrix();
        this.Frame1_1.render(f5);
        this.Frame4_2.render(f5);
        this.Frame6.render(f5);
        this.Device2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Block2.offsetX, this.Block2.offsetY, this.Block2.offsetZ);
        GL11.glTranslatef(this.Block2.rotationPointX * f5, this.Block2.rotationPointY * f5, this.Block2.rotationPointZ * f5);
        GL11.glScaled(1.03D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Block2.offsetX, -this.Block2.offsetY, -this.Block2.offsetZ);
        GL11.glTranslatef(-this.Block2.rotationPointX * f5, -this.Block2.rotationPointY * f5, -this.Block2.rotationPointZ * f5);
        this.Block2.render(f5);
        GL11.glPopMatrix();
        this.Frame1_3.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Arm2.offsetX, this.Arm2.offsetY, this.Arm2.offsetZ);
        GL11.glTranslatef(this.Arm2.rotationPointX * f5, this.Arm2.rotationPointY * f5, this.Arm2.rotationPointZ * f5);
        GL11.glScaled(1.0D, -1.0D, 1.0D);
        GL11.glTranslatef(-this.Arm2.offsetX, -this.Arm2.offsetY, -this.Arm2.offsetZ);
        GL11.glTranslatef(-this.Arm2.rotationPointX * f5, -this.Arm2.rotationPointY * f5, -this.Arm2.rotationPointZ * f5);
        this.Arm2.render(f5);
        GL11.glPopMatrix();
        this.Arm1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Arm3_1.offsetX, this.Arm3_1.offsetY, this.Arm3_1.offsetZ);
        GL11.glTranslatef(this.Arm3_1.rotationPointX * f5, this.Arm3_1.rotationPointY * f5, this.Arm3_1.rotationPointZ * f5);
        GL11.glScaled(-1.0D, -1.0D, 1.0D);
        GL11.glTranslatef(-this.Arm3_1.offsetX, -this.Arm3_1.offsetY, -this.Arm3_1.offsetZ);
        GL11.glTranslatef(-this.Arm3_1.rotationPointX * f5, -this.Arm3_1.rotationPointY * f5, -this.Arm3_1.rotationPointZ * f5);
        this.Arm3_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Frame3_3.offsetX, this.Frame3_3.offsetY, this.Frame3_3.offsetZ);
        GL11.glTranslatef(this.Frame3_3.rotationPointX * f5, this.Frame3_3.rotationPointY * f5, this.Frame3_3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.95D, 1.0D);
        GL11.glTranslatef(-this.Frame3_3.offsetX, -this.Frame3_3.offsetY, -this.Frame3_3.offsetZ);
        GL11.glTranslatef(-this.Frame3_3.rotationPointX * f5, -this.Frame3_3.rotationPointY * f5, -this.Frame3_3.rotationPointZ * f5);
        this.Frame3_3.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Device4.offsetX, this.Device4.offsetY, this.Device4.offsetZ);
        GL11.glTranslatef(this.Device4.rotationPointX * f5, this.Device4.rotationPointY * f5, this.Device4.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 0.9D);
        GL11.glTranslatef(-this.Device4.offsetX, -this.Device4.offsetY, -this.Device4.offsetZ);
        GL11.glTranslatef(-this.Device4.rotationPointX * f5, -this.Device4.rotationPointY * f5, -this.Device4.rotationPointZ * f5);
        this.Device4.render(f5);
        GL11.glPopMatrix();
        this.Frame4.render(f5);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        this.Device3.render(f5);
        GL11.glDisable(GL11.GL_BLEND);
        this.Frame2_3.render(f5);
        this.Frame2_2.render(f5);
        this.Frame1_2.render(f5);
        this.Frame3_2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Arm1_1.offsetX, this.Arm1_1.offsetY, this.Arm1_1.offsetZ);
        GL11.glTranslatef(this.Arm1_1.rotationPointX * f5, this.Arm1_1.rotationPointY * f5, this.Arm1_1.rotationPointZ * f5);
        GL11.glScaled(-1.0D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Arm1_1.offsetX, -this.Arm1_1.offsetY, -this.Arm1_1.offsetZ);
        GL11.glTranslatef(-this.Arm1_1.rotationPointX * f5, -this.Arm1_1.rotationPointY * f5, -this.Arm1_1.rotationPointZ * f5);
        this.Arm1_1.render(f5);
        GL11.glPopMatrix();
        this.Frame2_1.render(f5);
        this.Frame3_1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
