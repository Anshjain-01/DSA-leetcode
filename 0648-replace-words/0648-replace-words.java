class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String arr[]=sentence.split(" ");
        dictionary.sort((a, b) -> a.length() - b.length());
        HashSet<String> set =new HashSet<>();
        for(int i=0;i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            int k=0;
            while(k<temp.length()){
                if(set.contains(temp.substring(0,k+1))){
                   arr[i]=temp.substring(0,k+1);
                   break;
                }
                k++;
            }
        }
        return String.join(" ",arr);
     }
}