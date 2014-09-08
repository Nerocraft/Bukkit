package org.bukkit.inventory.meta;

import java.util.UUID;

import org.bukkit.Material;

/**
 * Represents a skull ({@link Material#SKULL_ITEM}) that can have an owner.
 */
public interface SkullMeta extends ItemMeta {

    /**
     * Gets the owner of the skull.
     *
     * @return the owner if the skull
     */
    String getOwner();

    /**
     * Checks to see if the skull has an owner.
     *
     * @return true if the skull has an owner
     */
    boolean hasOwner();

    /**
     * Sets the owner of the skull by UUID.
     *
     * @param owner the UUID of the new owner of the skull
     * @return true if the owner was successfully set
     */
    boolean setOwner(UUID owner);

    /**
     * Sets the owner of the skull by name.
     *
     * @param owner the name of the new owner of the skull
     * @return true if the owner was successfully set
     */
    boolean setOwner(String owner);

    // Nerocraft - Implemented a way to set player head texture
    /**
     * Sets the texture of this skull, encoded by Base64.
     *
     * @param texture the raw Base64 string
     */
    void setTexture(String texture);

    SkullMeta clone();
}
