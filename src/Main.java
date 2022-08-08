public class Main {
    public static void main(String[] args) {
       //declare values
        double width, height, perimeter;
        //initialize variables
        width = 13.5;
        height = 25.3;
        perimeter=2*(width+height);

        //initialize area variable
        double area = width * height;

        //print out the values
        System.out.println( "Width:"+width + ","+"Height:"+height);
        System.out.println("Perimeter:"+perimeter);
        System.out.println("Area:"+ area);

    }
}
