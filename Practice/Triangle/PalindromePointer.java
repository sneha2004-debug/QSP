class PalindromePointer
{
    public static void main(String args[])
    {
        int n=123321;
        if(n<0) return false;
        String str=n+"";
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}