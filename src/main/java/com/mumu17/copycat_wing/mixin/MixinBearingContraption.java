package com.mumu17.copycat_wing.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.simibubi.create.content.contraptions.bearing.BearingContraption;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(BearingContraption.class)
public class MixinBearingContraption {
    @ModifyArg(method = "addBlock", at = @At(value = "INVOKE", target = "Lcom/simibubi/create/AllTags$AllBlockTags;matches(Lnet/minecraft/world/level/block/state/BlockState;)Z"), index = 0)
    private BlockState modifyBlockState(BlockState blockState, @Local(argsOnly = true) Pair<StructureTemplate.StructureBlockInfo, BlockEntity> capture) {
        return ((StructureTemplate.StructureBlockInfo)capture.getKey()).state();
    }
}
