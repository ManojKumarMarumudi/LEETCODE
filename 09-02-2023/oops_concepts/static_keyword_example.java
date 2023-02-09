class Family{
    static int total=4;
    String head;
    String wifeName;
    String children;
    Family(String head,String wifeName,String children){
        this.head=head;
        this.wifeName=wifeName;
        this.children=children;
    }
    public static void display(Family f1){
        System.out.println(total+" "+f1.head+" "+f1.wifeName+" "+f1.children);
    }
    public static void main(String args[]){
        Family f1= new Family("ravi","anitha","manoj,raji");
        Family.display(f1);
    }
}



//output:
//4 ravi anitha manoj,raji
