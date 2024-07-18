package lab85;

class Point2D{
    private int x=0;
    private int y=0;

public int getX(){return x;}
public int getY(){return y;}

public void setX(int x){this.x=x;}
public void setY(int y){this.y=y;}

public Point2D(int x,int y){
    setX(x);
    setY(y);
}
public Point2D(){
    this(7,9);
}

    @Override
    public String toString(){
    return "X= "+x+"   Y= "+y;
}
}

class Point3D extends Point2D{
    private int z=0;

public int getZ(){return z;}
public void setZ(int z){this.z=z;}

public Point3D(int x,int y,int z){
    super.setX(x);
    super.setY(y);
    setZ(z);
}
public Point3D(){
    this(4,5,17);
}
    @Override
    public String toString(){
    return "X= "+getX()+"   Y= "+getY()+"   Z= "+z;
}
}

public class Lab85 {


    public static void main(String[] args) {
        Point2D P2D1=new Point2D();
        Point2D P2D2=new Point2D(8,14);
        
        Point3D P3D1=new Point3D();
        Point3D P3D2=new Point3D(3,25,1907);
        
        System.out.println(P2D1);
        System.out.println(P2D2);
        System.out.println(P3D1);
        System.out.println(P3D2);
    }
    
}
