package com.smug.veil.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGorgon extends ModelBase {

    public ModelRenderer lhead;
    public ModelRenderer lhead_1;
    public ModelRenderer lljaw;
    public ModelRenderer mljaw;
    public ModelRenderer rljaw;
    public ModelRenderer lujaw;
    public ModelRenderer mljaw_1;
    public ModelRenderer rujaw;
    public ModelRenderer upchest;
    public ModelRenderer lowchest;
    public ModelRenderer luleg;
    public ModelRenderer llleg;
    public ModelRenderer llegclaw;
    public ModelRenderer ruleg;
    public ModelRenderer rlleg;
    public ModelRenderer rlegclaw;
    public ModelRenderer luarm;
    public ModelRenderer llarm;
    public ModelRenderer ruarm;
    public ModelRenderer rlarm;

    public ModelGorgon() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.llleg = new ModelRenderer(this, 0, 0);
        this.llleg.setRotationPoint(2.8F, 11.0F, 0.4F);
        this.llleg.addBox(-1.0F, 0.0F, -0.4F, 2, 13, 1, 0.0F);
        this.setRotateAngle(llleg, 0.08726646259971647F, -0.5235987755982988F, 0.0F);
        this.ruarm = new ModelRenderer(this, 0, 0);
        this.ruarm.setRotationPoint(-4.0F, -13.0F, 0.6F);
        this.ruarm.addBox(-1.0F, 0.0F, 0.0F, 2, 24, 1, 0.0F);
        this.setRotateAngle(ruarm, 0.12217304763960307F, 1.0471975511965976F, 0.17453292519943295F);
        this.upchest = new ModelRenderer(this, 34, 12);
        this.upchest.setRotationPoint(0.0F, -3.3F, -0.3F);
        this.upchest.addBox(-3.6F, -11.0F, 0.0F, 7, 10, 3, 0.6F);
        this.setRotateAngle(upchest, -0.05235987755982988F, 0.0F, 0.0F);
        this.luleg = new ModelRenderer(this, 0, 0);
        this.luleg.setRotationPoint(2.0F, 2.7F, 0.7F);
        this.luleg.addBox(-1.0F, 0.0F, -0.4F, 2, 9, 2, 0.0F);
        this.setRotateAngle(luleg, -0.10471975511965977F, -0.7853981633974483F, -0.05235987755982988F);
        this.rljaw = new ModelRenderer(this, 23, 0);
        this.rljaw.setRotationPoint(-3.0F, -14.9F, 0.9F);
        this.rljaw.addBox(0.5F, -4.0F, -1.5F, 1, 4, 2, 0.6F);
        this.setRotateAngle(rljaw, 0.4363323129985824F, -0.7853981633974483F, 0.0F);
        this.lljaw = new ModelRenderer(this, 23, 0);
        this.lljaw.setRotationPoint(1.5F, -14.9F, 2.3F);
        this.lljaw.addBox(0.5F, -4.0F, -1.5F, 1, 4, 2, 0.6F);
        this.setRotateAngle(lljaw, 0.4363323129985824F, 0.7853981633974483F, 0.0F);
        this.llegclaw = new ModelRenderer(this, 12, 0);
        this.llegclaw.setRotationPoint(2.0F, 24.7F, 1.8F);
        this.llegclaw.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(llegclaw, -1.0471975511965976F, -0.5235987755982988F, 0.0F);
        this.rlleg = new ModelRenderer(this, 0, 0);
        this.rlleg.setRotationPoint(-3.2F, 11.0F, 0.4F);
        this.rlleg.addBox(-1.0F, 0.0F, -0.4F, 2, 13, 1, 0.0F);
        this.setRotateAngle(rlleg, 0.08726646259971647F, 0.5235987755982988F, 0.0F);
        this.mljaw = new ModelRenderer(this, 23, 0);
        this.mljaw.setRotationPoint(0.0F, -14.1F, 0.1F);
        this.mljaw.addBox(-1.0F, -3.7F, 0.0F, 2, 4, 2, 0.6F);
        this.setRotateAngle(mljaw, 0.23561944901923448F, 0.0F, 0.0F);
        this.rlegclaw = new ModelRenderer(this, 12, 0);
        this.rlegclaw.setRotationPoint(-2.4F, 24.7F, 1.8F);
        this.rlegclaw.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rlegclaw, -1.0471975511965976F, 0.5235987755982988F, 0.0F);
        this.rujaw = new ModelRenderer(this, 32, 0);
        this.rujaw.setRotationPoint(-1.6F, -22.3F, 1.5F);
        this.rujaw.addBox(-0.5F, -4.0F, -1.5F, 1, 5, 3, 0.6F);
        this.setRotateAngle(rujaw, -2.96705972839036F, 2.792526803190927F, 0.0F);
        this.lhead_1 = new ModelRenderer(this, 44, 1);
        this.lhead_1.setRotationPoint(0.0F, -15.5F, 1.9F);
        this.lhead_1.addBox(-1.9F, 0.0F, -1.0F, 4, 3, 2, 0.6F);
        this.setRotateAngle(lhead_1, 2.8797932657906435F, 0.0F, 0.0F);
        this.luarm = new ModelRenderer(this, 0, 0);
        this.luarm.setRotationPoint(4.0F, -13.0F, 0.6F);
        this.luarm.addBox(-0.5F, 0.0F, 0.0F, 2, 24, 1, 0.0F);
        this.setRotateAngle(luarm, 0.12217304763960307F, -1.0471975511965976F, -0.17453292519943295F);
        this.lujaw = new ModelRenderer(this, 32, 0);
        this.lujaw.setRotationPoint(1.5F, -22.3F, 1.5F);
        this.lujaw.addBox(-0.5F, -4.0F, -1.5F, 1, 5, 3, 0.6F);
        this.setRotateAngle(lujaw, -2.96705972839036F, -2.792526803190927F, 0.0F);
        this.ruleg = new ModelRenderer(this, 0, 0);
        this.ruleg.setRotationPoint(-2.0F, 2.7F, 0.7F);
        this.ruleg.addBox(-1.0F, 0.0F, -0.4F, 2, 9, 2, 0.0F);
        this.setRotateAngle(ruleg, -0.10471975511965977F, 0.7853981633974483F, 0.10471975511965977F);
        this.mljaw_1 = new ModelRenderer(this, 32, 0);
        this.mljaw_1.setRotationPoint(-0.5F, -24.1F, 0.3F);
        this.mljaw_1.addBox(-0.5F, 0.6F, 0.0F, 2, 5, 3, 0.6F);
        this.setRotateAngle(mljaw_1, -0.23561944901923448F, 0.0F, 0.0F);
        this.lowchest = new ModelRenderer(this, 34, 12);
        this.lowchest.setRotationPoint(0.0F, 3.1F, 0.5F);
        this.lowchest.addBox(-3.6F, -6.5F, 0.0F, 7, 6, 2, 0.6F);
        this.setRotateAngle(lowchest, 0.10471975511965977F, 0.0F, 0.0F);
        this.rlarm = new ModelRenderer(this, 12, 6);
        this.rlarm.setRotationPoint(-5.6F, 10.8F, 2.0F);
        this.rlarm.addBox(-1.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(rlarm, 0.5235987755982988F, 1.0471975511965976F, 0.17453292519943295F);
        this.lhead = new ModelRenderer(this, 44, 0);
        this.lhead.setRotationPoint(0.0F, -19.0F, 3.3F);
        this.lhead.addBox(-1.9F, 0.0F, -1.0F, 4, 4, 2, 0.6F);
        this.setRotateAngle(lhead, 3.3161255787892263F, 0.0F, 0.0F);
        this.llarm = new ModelRenderer(this, 12, 6);
        this.llarm.setRotationPoint(6.0F, 10.8F, 2.6F);
        this.llarm.addBox(-1.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
        this.setRotateAngle(llarm, 0.5235987755982988F, -1.0471975511965976F, -0.17453292519943295F);

        // --- 2. DEFINE HIERARCHY using addChild() ---

        // Torso & Limbs
        this.upchest.addChild(this.lowchest);
        this.upchest.addChild(this.ruarm);
        this.upchest.addChild(this.luarm);
        this.upchest.addChild(this.lhead);

        // Head/Neck Structure
        // Assuming lhead is the neck/base, and the rest are snake/jaw parts
        this.lhead.addChild(this.lhead_1);
        this.lhead.addChild(this.mljaw_1); // Upper center jaw/snout part
        this.lhead_1.addChild(this.rujaw); // Upper right jaw/snout part
        this.lhead_1.addChild(this.lujaw); // Upper left jaw/snout part

        this.lhead.addChild(this.mljaw); // Lower center jaw/snout part
        this.lhead.addChild(this.rljaw); // Lower right jaw/snout part
        this.lhead.addChild(this.lljaw); // Lower left jaw/snout part

        // Arm Links
        this.ruarm.addChild(this.rlarm);
        this.luarm.addChild(this.llarm);

        // Leg Links (Attached to lowchest for pelvic/lower torso movement)
        this.lowchest.addChild(this.ruleg);
        this.lowchest.addChild(this.luleg);

        // Lower Leg Links (Upper Leg -> Lower Leg -> Claw)
        this.ruleg.addChild(this.rlleg);
        this.rlleg.addChild(this.rlegclaw);

        this.luleg.addChild(this.llleg);
        this.llleg.addChild(this.llegclaw);

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.llleg.render(f5);
        this.ruarm.render(f5);
        this.upchest.render(f5);
        this.luleg.render(f5);
        this.rljaw.render(f5);
        this.lljaw.render(f5);
        this.llegclaw.render(f5);
        this.rlleg.render(f5);
        this.mljaw.render(f5);
        this.rlegclaw.render(f5);
        this.rujaw.render(f5);
        this.lhead_1.render(f5);
        this.luarm.render(f5);
        this.lujaw.render(f5);
        this.ruleg.render(f5);
        this.mljaw_1.render(f5);
        this.lowchest.render(f5);
        this.rlarm.render(f5);
        this.lhead.render(f5);
        this.llarm.render(f5);
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
