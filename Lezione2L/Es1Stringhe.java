package Lezione2L;
class Es1Stringhe {
    public static String longest(String[] s)
    {
        assert s!=null:"Array Null";
        int pos=0;
        for(int i=0;i<s.length;i++)
        {
            //assert (s[i]!=null) : "Errore stringa null";
            if(s[i].length()>s[pos].length())
                pos=i;

        }
        return s[pos];
    }
    public static String concatAll(String[] s)
    {
        String finale="";
        assert s.length>=0: "Errore nella lunghezza vettore di stringhe";
        for(int i=0;i<s.length;i++)
        {
            finale=finale.concat(s[i]);
        }
        return finale;
    }
    public static String trimONE(String s)
    {
        int i=0;
        int pos1=-1;
        int pos2=-1;
        while(i<s.length() && pos1==-1)
        {
            if(s.charAt(i)!=' ')
                pos1=i;
            i++;    
        }
        i=s.length()-1;
        while(i>0 && pos2==-1)
        {
            if(s.charAt(i)!=' ')
                pos2=i;
            i--;
        }
        //assert pos1!=-1 && -1!=pos2: "Errore";
        return s.substring(pos1, pos2+1);
    }
    public static void main(String[] args) {
        String a[]={"Agnese puzza", " si  "};
        System.out.println(trimONE(a[1]));
    }
    
}


    

