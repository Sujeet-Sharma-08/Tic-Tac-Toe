package com.ty;

abstract class Player {
    protected String name;
    protected char mark;

    public Player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    public abstract void makeMove(Board board);
    public String getName() { return name; }
    public char getMark() { return mark; }
}
