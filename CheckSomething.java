import java.util.*;
public class CheckSomething{
private static int luhnAlgorithm(String number){
    int n = 0;
    for(int i = 0; i<number.length(); i++){
        int x = Integer.parseInt(""+number.charAt(i));
        n += (x*Math.pow(2, i%2))%10;
        if (x>=5 && i%2==1) n++;
    }
    return n%10;
}

}