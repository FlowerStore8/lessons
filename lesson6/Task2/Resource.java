package ru.nsu.flowerstore;

public class Resource {

    private int resource;

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return Integer.toString(resource);
    }
}
