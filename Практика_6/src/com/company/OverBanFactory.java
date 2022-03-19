package com.company;

public class OverBanFactory extends BanFactory{
    public Ban createBan() {
        return new OverBan();
    }
}
