//constructor
 class Overloadconst{
    int id;
    String name;
    Overloadconst(int i,String n)
    {
    id = i;
    name = n;
    System.out.println(id+name);
    }

    public static void main(String[] args) {
        Overloadconst m1 = new Overloadconst(2 ," kavita");

    }
}
