public class Main{
    interface add
    {
        int add(int a, int b);
    }
    public static void main (String[] args)
    {
        add a = (int x, int y) -> 
        {
            int total = 0;
            for(int i = x; i <= y; i++)
            {
                total += i;
            }
            return total;
        };
        System.out.println(a.add(1, 4));
    }
}