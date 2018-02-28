public class Convertor {
    public static void main(String args[]) {
        String str="";
        for (int i = 1; i < 61; i++) {
            if(i%3==0) {
                str = str + "Fizz";
            }
            if(i%5==0) {
                str = str + "Buzz";
            }
            switch (str){
                case "": str=Integer.toString(i);
                break;
                default: str=str;
                break;
            }
            System.out.println(str);
            str = "";
        }

    }
}
