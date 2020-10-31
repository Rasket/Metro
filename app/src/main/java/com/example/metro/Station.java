package com.example.metro;

public class Station {
    private int x, y, i, j;
    private  String name;
    Station(int x, int y, String name, int i, int j)
    {
        name = name;
        x = x;
        y = y;
        i = i;
        j = j;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }
}
