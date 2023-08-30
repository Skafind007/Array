
package inventario_es;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;
public class Productos {
    private String nombre;
    private int cant;
    private  int precio;
     int n;

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Productos> getInv() {
        return Inv;
    }

    public void setInv(ArrayList<Productos> Inv) {
        this.Inv = Inv;
    }

    public Productos(String nombre, int cant, int precio) {
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio; 
       
    }
    ArrayList<Productos> Inv =new ArrayList<Productos>();
    public void  agregarInv(){
        System.out.println("Ingrese cantidad de productos a agregar");
        Scanner sc= new Scanner(System.in);
       n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.println("Producto numero :" +(1+i) );
             System.out.println("Digite el nombre del producto");
          this.nombre=  sc.next();
            System.out.println("Ingrese la cantidad del producto");
            this.cant=sc.nextInt();
            System.out.println("Ingrese el costo del Productos");
            this.precio=sc.nextInt();
           
             Inv.add(new Productos(this.nombre, this.cant, this.precio));
            sc.nextLine();
            
    }
    imprimir();
    }
    public void imprimir(){
       Iterator it=Inv.iterator();
        while (it.hasNext()) {
            Object produc = it.next();
            Productos pro= (Productos)produc;
          System.out.println("Producto: " + pro.getNombre() +"  Cantidad: " + pro.getCant()+"  Precio: " + pro.getPrecio());
            
        }
    }
    public void tamaño(){
        System.out.println("Tamaño del inventario : "+Inv.size());    
    }
    public void cambiar(){
      System.out.println("Ingrese la posición del producto que desea editar:");
      Scanner sc=new Scanner (System.in);
    int posicion = sc.nextInt();
    sc.nextLine();

    if (posicion >= 0 && posicion < Inv.size()) {
        Productos producto = Inv.get(posicion);

        System.out.println("Ingrese el nuevo nombre del producto:");
        producto.setNombre(sc.nextLine());

        System.out.println("Ingrese la nueva cantidad del producto:");
        producto.setCant(sc.nextInt());

        System.out.println("Ingrese el nuevo precio del producto:");
        producto.setPrecio(sc.nextInt());

        System.out.println("Producto editado exitosamente.");
    } else {
        System.out.println("Posición inválida.");
    }
    imprimir();
}
   public void eliminar(){
      
       System.out.println("Digite la posicion que desea eliminar");
       Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
       if (n >= 0 && n < Inv.size()) {
       Inv.remove(n);
   }    else{
           System.out.println("Digite posicion valida");
       }
       imprimir();
    }
   
}


