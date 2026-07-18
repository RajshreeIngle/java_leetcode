class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String [] str = s.split(" ");
        char [] c = pattern.toCharArray();

        System.out.println(str.length);
        System.out.println(c.length);

        if(c.length != str.length){
            return false;
        }
        // System.out.println(str.);
        System.out.println(c);
        Map<Character, String> map = new HashMap<>();
        int end= c.length;
        for(int start =0; start<end; start ++){
            System.out.println("here");
            if(map.containsKey(c[start])){
                System.out.println(map.get(c[start]));
                System.out.println(str[start]);

                if(!map.get(c[start]).equals(str[start])){
                    return false;
                }
            }
            else if(map.containsValue(str[start])){
                for (Map.Entry<Character, String> entry : map.entrySet()) {
                    if (Objects.equals(entry.getValue(), str[start])) {
                        Character key = entry.getKey();
                        if(key != c[start]){
                            return false;
                        }
                        // break;
                    }
                }


            }
            else{
                System.out.println("putting in map");
                System.out.println(c[start] + " " + str[start]);
                map.put(c[start], str[start]);
            }
        }

        return true;
        
    }
}