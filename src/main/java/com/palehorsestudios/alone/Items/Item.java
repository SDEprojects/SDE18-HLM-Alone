package com.palehorsestudios.alone.Items;

import javax.xml.bind.annotation.*;
import java.util.Objects;
import java.util.Set;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    private String type;
    private String description;
    private Set<Craft> craft;

    /**
     * Set as package private to only be usable in ItemFactory
     * @param type
     * @param description
     */
    Item(String type, String description, Set<Craft> craft) {
        this.type = type;
        this.description = description;
        this.craft = craft;
    }

    /**
     * Set as package private to only be usable in ItemFactory
     */
    Item() {
        // do nothing
    }

    /**
     * Set as package private to only be usable in ItemFactory
     *
     * Copies the contents from the given item into a new instance.
     * @param item
     */
    Item(Item item) {
        this(item.getType(), item.getDescription(), item.getCraft());
    }


    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Set<Craft> getCraft() {
        return craft;
    }

    public boolean isCraftable() {
        return (craft != null) && craft.size() > 0;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", craft=" + craft +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        boolean type = Objects.equals(getType(), item.getType());
        boolean description = Objects.equals(getDescription(), item.getDescription());
        boolean craft = Objects.equals(getCraft(), item.getCraft());
        return type && description && craft;
//        return Objects.equals(getType(), item.getType()) &&
//                Objects.equals(getDescription(), item.getDescription()) &&
//                Objects.equals(getCraft(), item.getCraft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getDescription(), getCraft());
    }
}