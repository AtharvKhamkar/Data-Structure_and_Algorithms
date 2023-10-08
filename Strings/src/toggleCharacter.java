public class toggleCharacter {
    public static void main(String[] args) {
        String str = "AbCd";
        toggle(str);


    }

    public static void toggle(String str){
        for (int i = 0; i < str.length(); i++) {
            boolean toggle = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 97){
                toggle = false;
            }
            if(toggle == true){
                asci += 32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }

        }
        System.out.println(str);

    }
}
