import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st = scanner.nextLine();
        TreeMap<String, Integer> str = new TreeMap<String, Integer>();
        int last = 0;
        int first = 0;
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                first = last;
                last = i;
                String string = st.substring(first, last);
                arr.add(string.trim());
            }
        }
        System.out.println(arr);
        for(int i=0; i<arr.size(); i++){
         int  count=1;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j)) && i !=j) {
                    count++;

                }
                if(count> 1){
                    str.put(arr.get(i), count);
                }else {
                    str.put(arr.get(i), count);
                }

            }
        }

        System.out.println(str);
    }
}
