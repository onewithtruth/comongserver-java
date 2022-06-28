package com.hands.comongjava.web.dto;

import java.util.HashMap;
import java.util.Map;

public class TestBuilderPatternDto {
    private Long id;
    private String name;
    private String email;

    public TestBuilderPatternDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String email;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

    }


    public TestBuilderPatternDto build() {
        if (id == null || name == null || email == null) {
            throw new IllegalStateException("cannot create Object");
        }
        return new TestBuilderPatternDto(id, name, email);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
