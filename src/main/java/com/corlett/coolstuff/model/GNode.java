package com.corlett.coolstuff.model;

import java.util.List;

public class GNode {

    Integer content;
    List<GNode> verticies;

    public void setContent(Integer content) {
        this.content = content;
    }

    public void setVerticies(List<GNode> verticies) {
        this.verticies = verticies;
    }

    public GNode(Integer content, List<GNode> verticies) {
        this.content = content;
        this.verticies = verticies;
    }

    public Integer getContent() {
        return content;
    }

    public List<GNode> getVerticies() {
        return verticies;
    }
}
