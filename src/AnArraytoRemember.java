import java.util.Scanner;

public class AnArraytoRemember {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the last 10 presidents: ");
        String[] presidents = new String[10];
        for(int i = 0; i < 10; i++){
            presidents[i] = scanner.next();
        }
        System.out.println("Now that you are done type history. I will repeat it to you, starting with the most recent: ");
        if(scanner.next().equalsIgnoreCase("history")){
            for(int i = presidents.length-1; i >= 0; i--){
                System.out.println(presidents[i]);
            }
        }
    }
}
