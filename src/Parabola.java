public class Parabola {
    private float k;
    private float h;
    private float a;
    private float x;
    private float y;
    private float resultado;


    public Parabola(float k, float h, float a, float x, float y) {
        this.k = k;
        this.h = h;
        this.a = a;
        this.x = x;
        this.y = y;
    }
    public float getK() {
        return k;
    }
//comentario 1
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
       return (this.k=k);
    }
    private float calculo_eje_horizontal(){
         this.h = (((this.y*this.y) - (2*this.y*this.k) + (this.k*this.k) - (4*this.a*this.x)) / (-4*this.a));
        return this.h;
    }

    public void imprimirDatos(){
        System.out.println(this.k);
        System.out.println(this.h);
        System.out.println(this.a);
        System.out.println(this.x);
        System.out.println(this.y);
    }
}


