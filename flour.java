import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flour {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter Big Count:");
        int bigCount = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Small Count:");
        int smallCount = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Goal:");
        int goal = Integer.parseInt(stdin.readLine());
        System.out.println(canPack(bigCount,smallCount,goal));

    }
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
        int n,a;
        bigCount =bigCount*5;
        if (bigCount <0)
        {
            return false;
        }
        else if (bigCount +smallCount >goal && smallCount>goal && bigCount<goal)
        {
            return true;
        }
        else
            return true;
    }
}
