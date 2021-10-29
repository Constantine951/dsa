package Scenarios;

public class CommonInThreeArrays {
        void findCommon(int ar1[], int ar2[], int ar3[])
        {
            int i = 0, j = 0, k = 0;
            int n1 = ar1.length;
            int n2 = ar2.length;
            int n3 = ar3.length;
            int prev1, prev2, prev3;
            prev1 = prev2 = prev3 = Integer.MIN_VALUE;

            while (i < n1 && j < n2 && k < n3)
            {
                while (i < n1 && ar1[i] == prev1)
                    i++;

                while (j < n2 && ar2[j] == prev2)
                    j++;
                while (k < n3 && ar3[k] == prev3)
                    k++;

                if (i < n1 && j < n2 && k < n3)
                {
                    if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
                    {
                        System.out.print(ar1[i] + " ");
                        prev1 = ar1[i];
                        prev2 = ar2[j];
                        prev3 = ar3[k];
                        i++;
                        j++;
                        k++;
                    }
                    else if (ar1[i] < ar2[j])
                    {
                        prev1 = ar1[i];
                        i++;
                    }
                    else if (ar2[j] < ar3[k])
                    {
                        prev2 = ar2[j];
                        j++;
                    }
                    else
                    {
                        prev3 = ar3[k];
                        k++;
                    }
                }
            }
        }
        public static void main(String args[])
        {
            CommonInThreeArrays ob = new CommonInThreeArrays();

            int ar1[] = { 1, 5, 10, 20, 40, 80, 80 };
            int ar2[] = { 6, 7, 20, 80, 80, 100 };
            int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };
            System.out.print("Common elements are ");
            ob.findCommon(ar1, ar2, ar3);
        }
    }

