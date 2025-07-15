package Shape;
class rectangle extends shape{
    private int width;
    private int height;

    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }


}
