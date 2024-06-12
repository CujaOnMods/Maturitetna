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

import net.mcreator.mddo.network.EpicraftModVariables;
import net.mcreator.mddo.EpicraftMod;

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
			EpicraftMod.queueServerWork(20, () -> {
				EpicraftModVariables.MapVariables.get(world).days = world.dayTime();
				EpicraftModVariables.MapVariables.get(world).syncData(world);
				while (EpicraftModVariables.MapVariables.get(world).days > 24000) {
					EpicraftModVariables.MapVariables.get(world).days = EpicraftModVariables.MapVariables.get(world).days - 24000;
					EpicraftModVariables.MapVariables.get(world).syncData(world);
					if (EpicraftModVariables.MapVariables.get(world).days < 0) {
						EpicraftModVariables.MapVariables.get(world).days = 0;
						EpicraftModVariables.MapVariables.get(world).syncData(world);
					}
				}
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((EpicraftModVariables.MapVariables.get(world).days + "")), false);
				EpicraftModVariables.MapVariables.get(world).days = 24000 - EpicraftModVariables.MapVariables.get(world).days;
				EpicraftModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(("time add " + EpicraftModVariables.MapVariables.get(world).days) + "t"));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((("time add " + EpicraftModVariables.MapVariables.get(world).days) + "t")), false);
				entity.setInvisible(false);
			});
		}
	}
}
