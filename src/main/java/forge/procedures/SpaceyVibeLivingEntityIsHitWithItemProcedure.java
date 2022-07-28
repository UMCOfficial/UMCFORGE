package forge.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.particles.ParticleTypes;

public class SpaceyVibeLivingEntityIsHitWithItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
		for (int index0 = 0; index0 < (int) (200); index0++) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (entity.getBbHeight()), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (entity.getBbHeight()), z, _ent.getYRot(), _ent.getXRot());
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (entity.getBbHeight() + 0.04), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (entity.getBbHeight() + 0.04), z, _ent.getYRot(), _ent.getXRot());
					}
					world.addParticle(ParticleTypes.SMOKE, x, (entity.getBbHeight()), z, 0, 1, 0);
					world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
					world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
					world.addParticle(ParticleTypes.SMOKE, x, y, z, 0, 1, 0);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		}
	}
}
