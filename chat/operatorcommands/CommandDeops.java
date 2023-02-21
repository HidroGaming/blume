package blume_system.chat.operatorcommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import blume_system.chat.ChatMessages;
import blume_system.config.DisconnectMessages;

public class CommandDeops implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
            Player p = (Player) sender;
            
            if (p.isOp()) {
            	p.setOp(false);
            	DisconnectMessages.kickOnOp();
            } else {
            	ChatMessages.notFound(p);
            }
    	}
        
        return true;
	}
}
