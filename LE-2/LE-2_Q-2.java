class Mother{
    int x;
    void show(){
        System.out.println("Hello World");
    }
}
class child extends Mother {
    void show(){
         System.out.println("Hello JUET");
    }
}
class Main {
 public static void main (String args[]){
 Mother m= new Mother ( );
 m.show( );
 child ch=new child ( ); 
 ch.show ( );
 }
}
