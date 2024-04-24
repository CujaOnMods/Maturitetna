package net.mcreator.mddo.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mddo.MddoMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BedbajeProcedure {
	@SubscribeEvent
	public static void onPlayerInBed(PlayerSleepInBedEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.isSleeping()) {
			MddoMod.queueServerWork(101, () -> {
				if (world instanceof ServerLevel _level)
					_level.setDayTime(0);
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getX()), (entity.getY() + 1), (entity.getZ()));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 1), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
				}
			});
		}
	}
}
