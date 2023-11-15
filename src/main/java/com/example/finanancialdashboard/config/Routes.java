package com.example.finanancialdashboard.config;

public enum Routes {
    ABOUT("about"),
    HOME("home"),
    DASHBOARD("dashboard"),
    CONTACT("contact");

    public final String label;
    Routes(String label) {
        this.label = label;
    }
}
