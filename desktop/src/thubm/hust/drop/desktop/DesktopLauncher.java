package thubm.hust.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import thubm.hust.drop.GameDrop;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Game Drop";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new GameDrop(), config);
	}
}
