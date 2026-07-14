class For6{
    public static void main(String args[])
    {
        int count=0;
        for(int year=2000;year<=3000;year++)
        {
            if(year%4==0 && year%100!=0 || year%400==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}