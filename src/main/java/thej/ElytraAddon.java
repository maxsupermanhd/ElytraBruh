package thej;

import thej.elytrabot.ElytraBotThreaded;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class ElytraAddon extends MeteorAddon {
	public static final Logger LOG = LoggerFactory.getLogger(ElytraAddon.class);

	@Override
	public void onInitialize() {
		LOG.info("Injecting ElytraBot");

		// Required when using @EventHandler
		MeteorClient.EVENT_BUS.registerLambdaFactory("meteordevelopment.addons.textures", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

		// Modules
		Modules.get().add(new ElytraBotThreaded());
	}
}
