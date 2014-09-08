package org.bukkit.entity;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.permissions.Permissible;

/**
 * Represents a human entity, such as an NPC or a player
 */
public interface HumanEntity extends LivingEntity, AnimalTamer, Permissible, InventoryHolder {

    // Nerocraft
    /**
     * Sets the name of this player.
     *
     * @param name Player name
     */
    public void setName(String name);

    /**
     * Returns the name of this player
     *
     * @return Player name
     */
    public String getName();

    /**
     * Get the player's inventory.
     *
     * @return The inventory of the player, this also contains the armor
     *     slots.
     */
    public PlayerInventory getInventory();

    /**
     * Get the player's EnderChest inventory
     *
     * @return The EnderChest of the player
     */
    public Inventory getEnderChest();

    /**
     * If the player currently has an inventory window open, this method will
     * set a property of that window, such as the state of a progress bar.
     *
     * @param prop The property.
     * @param value The value to set the property to.
     * @return True if the property was successfully set.
     */
    public boolean setWindowProperty(InventoryView.Property prop, int value);

    /**
     * Gets the inventory view the player is currently viewing. If they do not
     * have an inventory window open, it returns their internal crafting view.
     *
     * @return The inventory view.
     */
    public InventoryView getOpenInventory();

    /**
     * Opens an inventory window with the specified inventory on the top and
     * the player's inventory on the bottom.
     *
     * @param inventory The inventory to open
     * @return The newly opened inventory view
     */
    public InventoryView openInventory(Inventory inventory);

    /**
     * Opens an empty workbench inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *     location is used.
     * @param force If false, and there is no workbench block at the location,
     *     no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     *     opened.
     */
    public InventoryView openWorkbench(Location location, boolean force);

    /**
     * Opens an empty enchanting inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *     location is used.
     * @param force If false, and there is no enchanting table at the
     *     location, no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     *     opened.
     */
    public InventoryView openEnchanting(Location location, boolean force);

    /**
     * Opens an inventory window to the specified inventory view.
     *
     * @param inventory The view to open
     */
    public void openInventory(InventoryView inventory);

    /**
     * Force-closes the currently open inventory view for this player, if any.
     */
    public void closeInventory();

    /**
     * Returns the ItemStack currently in your hand, can be empty.
     *
     * @return The ItemStack of the item you are currently holding.
     */
    public ItemStack getItemInHand();

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was holding.
     *
     * @param item The ItemStack which will end up in the hand
     */
    public void setItemInHand(ItemStack item);

    /**
     * Returns the ItemStack currently on your cursor, can be empty. Will
     * always be empty if the player currently has no open window.
     *
     * @return The ItemStack of the item you are currently moving around.
     */
    public ItemStack getItemOnCursor();

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was moving. Will always be empty if the player currently has no
     * open window.
     *
     * @param item The ItemStack which will end up in the hand
     */
    public void setItemOnCursor(ItemStack item);

    // Nerocraft - Added setter and getter for infected players into Bukkit API, including documentation
    /**
     * Sets whether the player is infected based on the flag.
     *
     * @param flag
     */
    public void setInfected(boolean flag);

    /**
     * Gets whether the player is infected or not.
     *
     * @return Player's infected state
     */
    public boolean isInfected();

    // Nerocraft - Added setter and getter for explosive players into Bukkit API, including documentation
    /**
     * Sets whether the player is explosive based on the flag.
     * <p>
     * Explosive players will make a small explosion once killed by an
     * Entity which is not an infected player or zombie. The explosive
     * player also may not be infected for them to explode.
     *
     * @param flag
     */
    public void setExplosive(boolean flag);

    /**
     * Gets whether the player is explosive or not.
     *
     * @return If the player will explode on death
     */
    public boolean isExplosive();

    // Nerocraft - Added setter and getter for amount of monster kills of players into Bukkit API, including documentation
    /**
     * Sets the amount of monster kills this player has.
     *
     * @param amount The amount of monster kills
     */
    public void setMonsterKills(int amount);

    /**
     * Gets the amount of monster kills this player has.
     *
     * @return The amount of monster kills
     */
    public int getMonsterKills();

    // Nerocraft - Added setter and getter for Archery EXP into Bukkit API, including documentation
    /**
     * Sets the archery exp of this player.
     *
     * @param exp The exact experience value
     */
    public void setArcheryExp(int exp);

    /**
     * Gets the archery exp of this player.
     *
     * @return The exact experience value
     */
    public int getArcheryExp();

    // Nerocraft - Added 'getArcheryLevel()' method into Bukkit API, including documentation
    /**
     * Gets the archery level of this player.
     *
     * @return The exact archery experience level
     */
    public int getArcheryLevel();

    // Nerocraft - Added setter and getter for Energy into Bukkit API, including documentation
    /**
     * Sets this player's current Energy
     *
     * @param energy The player's Energy
     */
    public void setEnergy(float energy);

    /**
     * Gets this player's current Energy
     *
     * @return The player's Energy
     */
    public float getEnergy();

    // Nerocraft - Added setter and getter for Mana into Bukkit API, including documentation
    /**
     * Sets this player's current Mana points
     *
     * @param mana The player's Mana points
     */
    public void setMana(int mana);

    /**
     * Gets this player's current Mana points
     *
     * @return The player's Mana points
     */
    public int getMana();

    // Nerocraft - Added 'setManaCooldown()' method into Bukkit API, including documentation
    /**
     * Sets the mana cooldown of this player.
     * <p>
     * Time in ticks before mana may go up again.
     *
     * @param cooldown Cooldown time in ticks
     */
    public void setManaCooldown(int cooldown);

    // Nerocraft - Added 'getManaCooldown()' method into Bukkit API, including documentation
    /**
     * Gets the mana cooldown of this player.
     * <p>
     * Time in ticks before mana may go up again.
     *
     * @return mana cooldown
     */
    public int getManaCooldown();

    // Nerocraft - Added setter and getter for ingame state into Bukkit API, including documentation
    /**
     * Sets this player's current ingame state
     *
     * @param flag true if playing, false if else
     */
    public void setIngame(boolean flag);

    /**
     * Gets this player's current ingame state
     *
     * @return true if playing, false if else
     */
    public boolean isIngame();

    /**
     * Returns whether this player is slumbering.
     *
     * @return slumber state
     */
    public boolean isSleeping();

    /**
     * Get the sleep ticks of the player. This value may be capped.
     *
     * @return slumber ticks
     */
    public int getSleepTicks();

    /**
     * Gets this human's current {@link GameMode}
     *
     * @return Current game mode
     */
    public GameMode getGameMode();

    /**
     * Sets this human's current {@link GameMode}
     *
     * @param mode New game mode
     */
    public void setGameMode(GameMode mode);

    /**
     * Check if the player is currently blocking (ie with a sword).
     *
     * @return Whether they are blocking.
     */
    public boolean isBlocking();

    /**
     * Get the total amount of experience required for the player to level
     *
     * @return Experience required to level up
     */
    public int getExpToLevel();
}
