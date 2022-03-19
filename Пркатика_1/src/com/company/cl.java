package com.company;

import java.util.function.Predicate;

public class cl implements Predicate{
    @Override
    public boolean test(Object o) {
        if (o.toString().length()==4 || o.toString().length()==6) {
            String str= o.toString();
            int k=0,i=0;
            for (i=0;i<o.toString().length();i++)
            {
                if (str.charAt(i)>='0' && str.charAt(i)<='9')
                    k++;
            }
            if (k==i) return true;
        }
        return false;
    }
}
