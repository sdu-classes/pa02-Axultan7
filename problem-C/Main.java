public class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape(){

    }
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return String.format("Shape[color=%s,filled%b]", this.color ,this.filled);
    }
}

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius , String color , boolean filled){
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter (){
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return String.format("Circle[%s,radius=%.3f]" , super.toString(),radius);
    }
}

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width , double length , String color , boolean filled){
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width + length);
    }
    @Override
    public String toString(){
        return String.format("Rectangle[%s],width=%.3f,length=%.3f" , super.toString() , this.width ,this.length);
    }

}

import java.util.Random;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
       super(side , side);
    }
    public Square(double side , String color , boolean filled){
        setWidth(side);
        setLength(side);
        setColor(color);
        setFilled(filled);
    }
    public void setSide(double side){
   super.setWidth(side);
    }
    public double getSide(){
        return getWidth();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    public String toString(){
        return String.format("Square[%s]" , super.toString());
    }
}
