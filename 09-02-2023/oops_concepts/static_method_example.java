//the static method cannot be called directly when the instance variables are not-static they can be called only through the passing parameter of class name and object name inside a method
class Family{
    int total;
    String head;
    String wifeName;
    String children;
    Family(int total,String head,String wifeName,String children){
        this.total= total;
        this.head=head;
        this.wifeName=wifeName;
        this.children=children;
    }
    public static void display(Family f1){
        System.out.println(f1.total+" "+f1.head+" "+f1.wifeName+" "+f1.children);
    }
    public static void main(String args[]){
        Family f1= new Family(4,"ravi","anitha","manoj");
        Family.display(f1);
    }
}
