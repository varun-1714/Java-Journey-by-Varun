public class loop {
    public static void main(String a[]){
        int i =1;
        while(i <= 4){
            System.out.println("Hi"+i);
            {
                int j =1;
                while(j<3){
                    System.out.println("hello" + j);
                j++;    
                }
            }
        i++;
        }
        System.out.println("Bye");
    }
}
