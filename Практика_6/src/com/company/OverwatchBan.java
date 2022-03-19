package com.company;

public class OverwatchBan {
    class LuxCarFactory extends BanFactory{
        public Ban createBan(){
            return new OverBan();
        }
    }
}
