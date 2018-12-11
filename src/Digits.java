import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<>();
        String nums = String.valueOf(num);
        for(int i=0;i<nums.length();i++)
        {
            String temp = nums.substring(i,i+1);
            digitList.add(i, Integer.parseInt(temp));
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i=0;i<digitList.size()-1;i++)
        {
            if(digitList.get(i)>=digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getDigitList()
    {
        return this.digitList;
    }
}
