package net.mcreator.mddo.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.mddo.network.MddoModVariables;
import net.mcreator.mddo.MddoMod;

public class SleepProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double timeOfNight = 0;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay()) && true) {
			entity.setInvisible(true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 100, 100));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 1));
			MddoMod.queueServerWork(20, () -> {
				MddoModVariables.MapVariables.get(world).days = world.dayTime();
				MddoModVariables.MapVariables.get(world).syncData(world);
				while (MddoModVariables.MapVariables.get(world).days > 24000) {
					MddoModVariables.MapVariables.get(world).days = MddoModVariables.MapVariables.get(world).days - 24000;
					MddoModVariables.MapVariables.get(world).syncData(world);
					if (MddoModVariables.MapVariables.get(world).days < 0) {
						MddoModVariables.MapVariables.get(world).days = 0;
						MddoModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((MddoModVariables.MapVariables.get(world).days + "")), false);
				MddoModVariables.MapVariables.get(world).days = 24000 - MddoModVariables.MapVariables.get(world).days;
				MddoModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(("time add " + MddoModVariables.MapVariables.get(world).days) + "t"));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((("time add " + MddoModVariables.MapVariables.get(world).days) + "t")), false);
				entity.setInvisible(false);
			});
		}
	}
}
