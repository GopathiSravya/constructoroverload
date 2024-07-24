public class Constructor {
    int id;
    String name;

    @Override
    public String toString() {
        return "Constructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Constructor(){
        System.out.println("default constructor");
    }
    Constructor(int id,String name){
        id=555;
        name="raves";
    }

    public static void main(String[] args) {
        Constructor c=new Constructor();
        System.out.println("default constructor");
        System.out.println("student id"+c.id+"\nStudent Name:"+c.name);
        System.out.println("\nparametrtxed values");
        Constructor c1=new Constructor(2,"sravya");
        System.out.println("constructor ID"+c.id+"\n constructorname"+c.name);
        System.out.println(c1);
    }
}