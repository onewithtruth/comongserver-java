package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chat_has_item", schema = "comongDB", catalog = "")
@IdClass(ChatHasItemEntityPK.class)
public class ChatHasItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "chat_id")
    private int chatId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private int itemId;
    @ManyToOne
    @JoinColumn(name = "chat_id", referencedColumnName = "id", nullable = false)
    private ChatEntity chatByChatId;
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private ItemEntity itemByItemId;

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatHasItemEntity that = (ChatHasItemEntity) o;
        return chatId == that.chatId && itemId == that.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, itemId);
    }

    public ChatEntity getChatByChatId() {
        return chatByChatId;
    }

    public void setChatByChatId(ChatEntity chatByChatId) {
        this.chatByChatId = chatByChatId;
    }

    public ItemEntity getItemByItemId() {
        return itemByItemId;
    }

    public void setItemByItemId(ItemEntity itemByItemId) {
        this.itemByItemId = itemByItemId;
    }
}