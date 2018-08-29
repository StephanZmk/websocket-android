package de.adesso;

public class Beamer {
    String clientId;
    RoadPosVector pos;
    int width;
    int height;
    String color;
    float scale;
    float rotation;
    float zoom;

    public Beamer(String clientId, RoadPosVector pos, int width, int height, String color, float scale, float rotation, float zoom) {
        this.clientId = clientId;
        this.pos = pos;
        this.width = width;
        this.height = height;
        this.color = color;
        this.scale = scale;
        this.rotation = rotation;
        this.zoom = zoom;
    }

    public String getClientId() {
        return clientId;
    }

    public RoadPosVector getPos() {
        return pos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public float getScale() {
        return scale;
    }

    public float getRotation() {
        return rotation;
    }

    public float getZoom() {
        return zoom;
    }
}
