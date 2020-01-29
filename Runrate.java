import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total number of overs : ");
        Integer over=Integer.parseInt(br.readLine());
        System.out.println("Enter Target Runs :");
        Integer target=Integer.parseInt(br.readLine());
        System.out.println("Enter overs bowled : ");
        Integer over_bowled=Integer.parseInt(br.readLine());
        System.out.println("Enter Runs scored : ");
        Integer score=Integer.parseInt(br.readLine());
        float run_rate=(score.floatValue()/over_bowled.floatValue());
        System.out.println("Current Run Rate : "+run_rate);
        float t=(target-score);
        float req_rate=t/(over-over_bowled);
        System.out.println("Run Rate required after "+over_bowled+" overs : "+req_rate);
        
    }
}
