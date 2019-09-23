package com.smk.model.mcap;

import java.io.Serializable;

public class BiMchntMsgTypeMapTb extends BiMchntMsgTypeMapTbKey implements Serializable {
    private String state;

    private static final long serialVersionUID = 1L;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}