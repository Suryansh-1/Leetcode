import java.util.StringTokenizer;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(int i=0;i<sentences.length;i++)
        {
            StringTokenizer st=new StringTokenizer(sentences[i]);
            
            if(st.countTokens()>m)
                m=st.countTokens();
        }
         return m; 
    }
  
}