package com.sbe.tdd.dto;

/**
 * Demo 实体类对象
 */
public class DemoDTO {
    private Long id;
    private String content;

    public DemoDTO() {
    }

    public DemoDTO(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
