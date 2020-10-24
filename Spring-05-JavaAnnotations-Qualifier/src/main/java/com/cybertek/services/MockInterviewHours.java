package com.cybertek.services;

import com.cybertek.interfaces.Extrasessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements Extrasessions {

    @Override
    public int getHours() {
        return 9;
    }
}
