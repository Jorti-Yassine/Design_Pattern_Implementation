import java.util.Scanner;

public class App  {
    public static void main(String[] args) throws Exception {
        Context ctx = new Context();

        Scanner sc = new Scanner(System.in);
        while(true){
            String stategyClass = sc.nextLine();
            IStategy stategy = (IStategy) Class.forName(stategyClass).newInstance();
            ctx.setiStategy(stategy);
            ctx.appliquerStrategy();
        }
    }
}
