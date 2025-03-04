public class realobject{
    public static void main (String args[])
    {

        MyProgram pro = new MyProgram();
        pro.multi();
    }
}

class MyProgram
{
    int n1 = 44;
    int n2 = 46;
    public void multi()
    {
        int re = n1 * n2;
        System.out.println("this is multiplication of given two nums"+" "+ re);
    }
}