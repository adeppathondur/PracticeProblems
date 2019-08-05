public class NonDecreasing {

    public static boolean CheckPossibility(int[] nums)
    {
        int instances = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
            {
                instances++;
                if (instances > 1) return false;

                //Check both sides
                boolean oneSideWorks = false;

                int temp = nums[i];
                nums[i] = nums[i + 1];
                if (IsSorted(nums)) oneSideWorks = true;
                nums[i] = temp;

                if (!oneSideWorks)
                {
                    temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    if (IsSorted(nums)) oneSideWorks = true;
                    nums[i + 1] = temp;
                }

                if (!oneSideWorks) return false;
            }
        }

        return true;
    }

    private static boolean IsSorted(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int [] bb = {4,2,1};

       System.out.println( "" +CheckPossibility(bb));

    }
}
