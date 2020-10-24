package com.cybertek.services;

import com.cybertek.interfaces.Extrasessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements Extrasessions {
    public int getHours() {
        return 4;
    }
}
