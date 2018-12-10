
public class CheckParantheses {
    public static void checkParantheses(String st){
        int counter = 0;
        char[] ch = st.toCharArray();
        for (int i = 0; i < st.length(); i++){
            if (ch[i] == '(') counter++;
            if (ch[i] == ')') counter--;
            if (counter <0) {
                System.out.println("Fked up expression");
                break;
            }
        }
        if (counter == 0) System.out.println("All good!");
        if (counter >0) System.out.println("You have "+counter + " brackets unclosed");

    }
}
