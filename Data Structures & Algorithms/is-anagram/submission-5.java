class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
        return false;
        }
        
        String[] miArray1 = new String[s.length()];
        String[] miArray2 = new String[t.length()];

        for (int i = 0 ; i < miArray1.length ;i++){
            miArray1[i] = s.substring(i,i+1) ;
        }
        for (int j = 0 ; j < miArray2.length ;j++){
            miArray2[j] = t.substring(j,j+1) ;
        }
        Arrays.sort(miArray1);
        Arrays.sort(miArray2);

        for (int x = 0 ; x < miArray1.length ;x++){
            if (!miArray1[x].equals(miArray2[x])){
                return false;
            } 
        }
    return true;
    }
}
