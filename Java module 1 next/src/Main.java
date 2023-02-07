class App {
    public static void main (String[] args){
        ShapeDrawer drawer = new ShapeDrawer(new Circle());
        Shape square = new Square();
        ShapeDrawer drawer2 = new ShapeDrawer(square);
        ShapeDrawer drawer3 = new ShapeDrawer(new Triangle());
        drawer.process();
        drawer2.process();
        drawer3.process();

    }
}
