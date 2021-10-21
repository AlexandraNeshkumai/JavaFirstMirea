package ru.mirea.task7;
public class Square extends Rectangle {
    public Square(){
        width = 1;
        length = 1;
        this.color = "blue";
        this.filled = false;
    }
    public Square(double side) {
        width = side;
        length = side;
        this.color = "blue";
        this.filled = false;
    }
    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString(){
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}