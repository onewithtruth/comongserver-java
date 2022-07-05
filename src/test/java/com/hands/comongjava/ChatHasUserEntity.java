package com.hands.comongjava;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chat_has_user", schema = "comongDB", catalog = "")
@IdClass(ChatHasUserEntityPK.class)
public class ChatHasUserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "chat_id")
    private int chatId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatHasUserEntity that = (ChatHasUserEntity) o;
        return chatId == that.chatId && userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatId, userId);
    }
}
