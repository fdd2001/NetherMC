package me.fdd2001.nethermc;

import me.confuser.barapi.BarAPI;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class NetherMC extends JavaPlugin implements Listener {
    public boolean bowRide = false;
    public boolean snowballLightning = false;
    @Override
    public void onEnable () {
        System.out.println("[FloCraft] Plugin enabled.");
        getServer().getPluginManager().registerEvents(this,this);
    }
    @Override
    public void onDisable () {
        System.out.println("[FloCraft] Plugin disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("explode")) {
            if (p.hasPermission("nmc.explode")) {
                if (args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    target.getWorld().createExplosion(target.getLocation(),60F);
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("lightning")) {
            if (p.hasPermission("nmc.lightning.normal")) {
                if (args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    target.getWorld().strikeLightning(target.getLocation());
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("lightningkill")) {
            if (p.hasPermission("nmc.lightning.kill")) {
                if (args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    target.setHealth(1D);
                    target.getWorld().strikeLightning(target.getLocation());
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("creeper")) {
            if (p.hasPermission("nmc.creeper")) {
                if (args.length == 2) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    int count = Integer.parseInt(args[1]);
                    while (count > 0) {
                        target.getWorld().spawnEntity(target.getLocation(),EntityType.CREEPER);
                        count = count - 1;
                    }
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("togglearrowride")) {
            if (sender instanceof Player) {
                if (bowRide == false) {
                    bowRide = true;
                    p.sendMessage(ChatColor.BLUE + "[BowRiding] " + ChatColor.AQUA + "Arrow riding toggled " + ChatColor.YELLOW + "on.");
                    return true;
                }
                else {
                    bowRide = false;
                    p.sendMessage(ChatColor.BLUE + "[BowRiding] " + ChatColor.AQUA + "Arrow riding toggled " + ChatColor.YELLOW + "off.");
                    return true;
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("togglesnowball")) {
            if (sender instanceof Player) {
                if (snowballLightning == false) {
                    snowballLightning = true;
                    p.sendMessage(ChatColor.BLUE + "[SnowballLightning] " + ChatColor.AQUA + "Snowball lightning toggled " + ChatColor.YELLOW + "on.");
                    return true;
                }
                else {
                    snowballLightning = false;
                    p.sendMessage(ChatColor.BLUE + "[SnowballLightning] " + ChatColor.AQUA + "Snowball lightning toggled " + ChatColor.YELLOW + "off.");
                    return true;
                }
            }
        }
        else if (cmd.getName().equalsIgnoreCase("dynamite")) {
            if (p.hasPermission("nmc.dynamite.give")) {
                ItemStack Dyn1 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn1Meta = Dyn1.getItemMeta();
                Dyn1Meta.setDisplayName("Dynamite x1");
                Dyn1.setItemMeta(Dyn1Meta);

                ItemStack Dyn2 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn2Meta = Dyn2.getItemMeta();
                Dyn2Meta.setDisplayName("Dynamite x2");
                Dyn2.setItemMeta(Dyn2Meta);

                ItemStack Dyn3 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn3Meta = Dyn3.getItemMeta();
                Dyn3Meta.setDisplayName("Dynamite x3");
                Dyn3.setItemMeta(Dyn3Meta);

                ItemStack Dyn4 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn4Meta = Dyn4.getItemMeta();
                Dyn4Meta.setDisplayName("Dynamite x4");
                Dyn4.setItemMeta(Dyn4Meta);

                ItemStack Dyn5 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn5Meta = Dyn5.getItemMeta();
                Dyn5Meta.setDisplayName("Dynamite x5");
                Dyn5.setItemMeta(Dyn5Meta);

                ItemStack Dyn6 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn6Meta = Dyn6.getItemMeta();
                Dyn6Meta.setDisplayName("Dynamite x6");
                Dyn6.setItemMeta(Dyn6Meta);

                ItemStack Dyn7 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn7Meta = Dyn7.getItemMeta();
                Dyn7Meta.setDisplayName("Dynamite x7");
                Dyn7.setItemMeta(Dyn7Meta);

                ItemStack Dyn8 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn8Meta = Dyn8.getItemMeta();
                Dyn8Meta.setDisplayName("Dynamite x8");
                Dyn8.setItemMeta(Dyn8Meta);

                ItemStack Dyn9 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn9Meta = Dyn9.getItemMeta();
                Dyn9Meta.setDisplayName("Dynamite x9");
                Dyn9.setItemMeta(Dyn9Meta);

                ItemStack Dyn10 = new ItemStack(Material.EGG,1);
                ItemMeta Dyn10Meta = Dyn10.getItemMeta();
                Dyn10Meta.setDisplayName("Dynamite x10");
                Dyn10.setItemMeta(Dyn10Meta);

                ItemStack DynxXxX = new ItemStack(Material.EGG,1);
                ItemMeta DynxXxXMeta = DynxXxX.getItemMeta();
                DynxXxXMeta.setDisplayName("Dynamite xXxX");
                DynxXxX.setItemMeta(DynxXxXMeta);

                Inventory inv = p.getInventory();
                inv.addItem(Dyn1,Dyn2,Dyn3,Dyn4,Dyn5,Dyn6,Dyn7,Dyn8,Dyn9,Dyn10,DynxXxX);
            }
        }
        return true;
    }
    @EventHandler
    @SuppressWarnings("deprecation")
    public void onSnowballHit (ProjectileHitEvent e) {
        if (snowballLightning) {
            Projectile proj = e.getEntity();
            if (proj instanceof Snowball) {
                Snowball snowball = (Snowball)proj;
                if (snowball.getShooter() instanceof Player) {
                    Player p = (Player) snowball.getShooter();
                    snowball.getWorld().strikeLightning(snowball.getLocation());
                    Location sb = snowball.getLocation();
                    World sbWorld = snowball.getWorld();
                    sbWorld.playEffect(sb,Effect.MOBSPAWNER_FLAMES,0,900);
                    sbWorld.playEffect(sb,Effect.SMOKE,0,900);
                }
            }
        }
    }
    @EventHandler
    @SuppressWarnings("deprecation")
    public void onBowShoot (EntityShootBowEvent e) {
        if (bowRide) {
            if (e.getEntity() instanceof Player) {
                Player p = (Player) e.getEntity();
                Projectile proj = (Projectile) e.getProjectile();
                proj.setPassenger(p);
            }
        }
    }
    @EventHandler
    @SuppressWarnings("deprecation")
    public void onEggThrow (ProjectileLaunchEvent e) {
        if (e.getEntityType() == EntityType.EGG) {
            Projectile proj = e.getEntity();
            Player p = (Player) proj.getShooter();
            ItemMeta im = p.getItemInHand().getItemMeta();
            if (im.hasDisplayName()) {
                if (im.getDisplayName().equalsIgnoreCase("Das Ei der Schande")) {
                    World w = p.getWorld();
                    Location loc = p.getLocation();
                    p.setHealth(5D);
                    w.strikeLightning(loc);
                    w.playEffect(loc,Effect.MOBSPAWNER_FLAMES,0,900);
                    w.playEffect(loc,Effect.SMOKE,0,900);
                    w.createExplosion(loc,3F);
                    String playerName = p.getName();
                    Bukkit.broadcastMessage(ChatColor.RED + playerName + " hat das Ei der Schande geworfen!");
                }
            }
        }
    }
    @EventHandler
    @SuppressWarnings("deprecated")
    public void onDynamiteHit (ProjectileHitEvent e) {
        if (e.getEntityType() == EntityType.EGG) {
            Projectile proj = e.getEntity();
            Player p = (Player) proj.getShooter();
            ItemMeta eggMeta = p.getItemInHand().getItemMeta();
            if (eggMeta.hasDisplayName()) {
                if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x1")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,5F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x2")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,10F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x3")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,15F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x4")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,20F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x5")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,25F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x6")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,30F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x7")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,35F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x8")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,40F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x9")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,50F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite x10")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,60F);
                }
                else if (eggMeta.getDisplayName().equalsIgnoreCase("Dynamite xXxX")) {
                    World w = p.getWorld();
                    Location loc = proj.getLocation();
                    w.createExplosion(loc,105F);
                }
            }
        }
    }
    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent e) {
        Player p = e.getPlayer();
        String pName = p.getDisplayName();
        String message = "§aWillkommen auf §6FloCraft§a, " + pName;
        BarAPI.setMessage(p,message);
    }
}
