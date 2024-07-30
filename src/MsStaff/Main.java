	package MsStaff;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage("§8===================");
		c.sendMessage("§7Nome:");
		c.sendMessage("§7Criador:§ayurirp4");
		c.sendMessage("§7Stats: §aAtivo");
		c.sendMessage("§7Versão: 1.0");
		c.sendMessage("§8===================");
		
	}

	
	@Override
	public void onDisable() {
   ConsoleCommandSender c = Bukkit.getConsoleSender();
   c.sendMessage("§8===================");
	c.sendMessage("§7Nome:");
	c.sendMessage("§7Criador:§cyurirp4");
	c.sendMessage("§7Stats: §cDesativado");
	c.sendMessage("§7Versão: §c1.0");
	c.sendMessage("§8===================");
	}
	
	
   @Override
public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	   Player p = (Player) sender;
	   if (command.getName().equalsIgnoreCase("staffs")) {
	   Inventory inv = Bukkit.createInventory(null, 9, "Staff");
	   ItemStack itemm = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
	   SkullMeta master2meta = (SkullMeta)itemm.getItemMeta();
	   master2meta.setOwner("yKeesleenPX_"); //Nick da cabeça com "?" MHF_question
	   master2meta.setDisplayName("§7[§6Master§7] §6§lyKeesleenPX_");
	   itemm.setItemMeta(master2meta);
	   ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
	   SkullMeta meta = (SkullMeta)item.getItemMeta();
	   meta.setOwner("yGamerPXS"); //Nick da cabeça com "?" MHF_question
	   meta.setDisplayName("§7[§6Master§7] §6§lyGamerPXS");
	   item.setItemMeta(meta);
	   ItemStack master1 = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
	   SkullMeta mastermeta = (SkullMeta)item.getItemMeta();
	  mastermeta.setOwner("yFeliipePX_");
	   mastermeta.setDisplayName("§7[§6Master§7] §6§lyFeliipePX_");
	   master1.setItemMeta(mastermeta);
	   ItemStack vago = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
	   SkullMeta vagometa = (SkullMeta)vago.getItemMeta();
	  vagometa.setOwner("MHF_question");
	   vagometa.setDisplayName("§8Vago");
	   vago.setItemMeta(vagometa);
	   
	   inv.setItem(0, master1);
	   inv.setItem(1, item);
	   inv.setItem(2, itemm);
	   inv.setItem(3, vago);
	   inv.setItem(4, vago);
	   inv.setItem(5, vago);
	   inv.setItem(6, vago);
	   inv.setItem(7, vago);
	   inv.setItem(8, vago);

	   p.openInventory(inv);
	   }
	return false;
}
	
   @EventHandler
	public void click(InventoryClickEvent e) {
		 if (e.getInventory().getTitle().equals("Staff"))
		    e.setCancelled(true);
   }
}
