package com.company;

public class BasicBanFactory extends BanFactory{
        public Ban createBan(){
            return new BasicBan();
        }
}
