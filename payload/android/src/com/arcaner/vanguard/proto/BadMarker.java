package com.arcaner.vanguard.proto;

public class BadMarker extends Exception {
    public BadMarker(int got, int expected) {
        super(String.format("Bad marker. Got %04X, expected %04X", got, expected));
    }
}
