package com.dailycodebuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMessages {

    @Test
    public void testNameDailyCodeBuffer()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello Daily Code Buffer!", obj.getMessage("Daily Code Buffer"));
    }

}
