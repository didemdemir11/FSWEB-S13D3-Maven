package org.example;
public class Wall{
    Double width;
    Double height;
    public Wall (Double width, Double height){
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public void setWidth(Double width) {
        this.width = (width < 0) ? 0 : width;
    }
    public Double getArea(){
        return width*height;
    }
}
