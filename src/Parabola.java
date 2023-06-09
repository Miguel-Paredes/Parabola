public class Figuras3D {
    //para las figuras cubo=ado × lado × lado. piramide= (area*base*h)/3, esfera = 4/3 π r³ y cilindro=π r² h
    private float k;
    private float h;
    private float a;
    private float x;
    private float y;

    public Figuras3D(float k, float h, float a, float x, float y) {
        this.k = k;
        this.h = h;
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float parabola(float h, float k, float a, float b){
       // return (this.-this.k);
    }

    public void imprimirDatos(){
        System.out.println(this.k);
        System.out.println(this.h);
        System.out.println(this.a);
        System.out.println(this.x);
        System.out.println(this.y);
    }
}


