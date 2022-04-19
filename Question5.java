import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numOccur = in.nextInt();
    var maxCount = 0;
    List<Integer> numList = new LinkedList<Integer>();

    // Take in input and assign it to the numList //
    for (int i = 0; i < numOccur; i++){
      int num = in.nextInt();
      numList.add(num);
    }

    int mode = numList.get(0); // intialise mode value
    
    for (int element = 0; element < numOccur; element++) {
      int count = Collections.frequency(numList,numList.get(element));
      if (maxCount < count){  
        mode = numList.get(element);
        maxCount = count;
      } 
    }
    System.out.println(mode);
  }
}
