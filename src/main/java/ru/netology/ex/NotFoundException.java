package ru.netology.ex;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String s) {
        super(s);
    }

}