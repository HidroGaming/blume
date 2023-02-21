package blume_system.config;

import org.bukkit.entity.Player;

import blume_system.general.Main;
import blume_system.settings.Config;

public class UntilNextLvl {
	public static int getUntilNextLvl(Player p) { //put name in and get needed points
		String currentPlayerRank = Main.getPluginInstance().getConfig().getString("players.uuid-" + p.getUniqueId().toString() + ".status");
		String currentPlayerLevel = Main.getPluginInstance().getConfig().getString("players.uuid-" + p.getUniqueId().toString() + ".level_global");
		
		int lvl[] = {Config.r2_points, Config.r3_points, Config.r4_points, Config.r5_points, Config.r6_points, Config.r7_points};
		String rank[] = {Config.rank1, Config.rank2, Config.rank3, Config.rank4, Config.rank5, Config.rank6, Config.rank7};
		
		int pointsLeft = 0;
		
		if (currentPlayerRank.equals(rank[0])) {
			pointsLeft = lvl[0] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[1])) {
			pointsLeft = lvl[1] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[2])) {
			pointsLeft = lvl[2] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[3])) {
			pointsLeft = lvl[3] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[4])) {
			pointsLeft = lvl[4] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[5])) {
			pointsLeft = lvl[5] - Integer.parseInt(currentPlayerLevel);
		} else if (currentPlayerRank.equals(rank[6])) { //if player got max level
			pointsLeft = 987654321;
		}
		
		return pointsLeft;
	}
}
