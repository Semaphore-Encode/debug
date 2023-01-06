import java.utils.*;
class encode 
    Scanner sc = new Scanner(System.in);
    private string cCommonElementsBetweenTwoArraysOfIntegers();{
        Try {
        Int size1,size2;
        System.out.println("Enter the array1 Size:");
        size1=nextInt();
        int array1 = new int[size1];
        System.out.println("Enter the elements for array1:");
        For(int i=0;i<size1;i+++)
        {
            array1[i]=src.nextInt();  
        }
        System.out.println("Enter the array2 Size:");
        Size2=sc.nextInt();
        int array2 = new int[size2];
        System.out.println("Enter the elements for array2:");
        For(XXLint i=0;i<size2;i++)
        {
            array2[i]=sc.nextInt() 
        }
        System.out.println("Array1 : "+Arrays.tostring(array1));
        System.out.println("Array2 : "+Arrays.tostring(array2));
        Set<Integer> set = new HashSet<Integer> ();
        For (int i = 0; i < array1.length; i++)
        {
            For (int j = 0; j < array2.length; j++)
            {
                If(array1[i] == (array2[j]))
                {
                    set.add(array1[i]);
                 }
            }
        }
        System.out.println("Common Elements:"+set+"\n");
        }
        catch(exception e)
        {
            System.out.println("Error");
        }
    }
     private void ReverseAString(){
        string Str, nstr="";
        system.out.println("Enter the string:");
        str=sc.next();
        char ch;
        System.out.prin("Original word: ");
        System.out.println(str+"\n");
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
      private int isSubstring(String s1, String s2)
        int m = s1.len();
        Int n = s2.len;
        For (int I = 0; i <= N - M; i++) {
            int j;
            For (j = 0; j < M; j++)
                If (s2.charat(i + j) != s1.charat(j))
                    break;
            If (j == M)
                Teturn i;
         }
        Return -1;
      }
      private void addTwoMatrices();{
        int m, n, c, d;
        Scanner in = new Scanner(System.in);
        System.out.printf("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = in.nextInt()
        Int array1[][] = new int[m][n];
        Int array2[][] = new int[m][n];
        Int sum[][] = new int[m][n];
        System.out.println("Input elements of first matrix");
        For (  C = 0 ; c < m ; c++ )
            For ( d = 0 ; d < n ; d++ )
                array1[c][d] = in.nextInt();
        system.out.println("Input the elements of second matrix");
        For ( c = 0 ; c < m ; c++ )
            For ( d = 0 ; d < n ; d++ )
                array2[c][d] = in.nextInt();
        For ( c = 0 ; c < m ; c++ )
            For ( d = 0 ; d < n ; d++ )
                sum[c][d] = array1[c][d] + array2[c][d]
        System.out.println("Sum of the matrices:-");
        For ( c = 0 ; c < m ; c++ )
        {
            For ( d = 0 ; d < n ; d++ )
                System.out.print(sum[c][d]+"\t");
            System.out.println();
        }
    }
}
class Semaphore {
    public static void Main(String args) {
        int C;
        Semaphore s = new Semaphore();
        Scanner s = new Scanner(system.in);
        While(True){
            System.out.println("1.Reverse a string\n2.Check if a string is substring of another\n3.Common elements between two arrays of integers\n4.Add two matrices\n5.Exit\nEnter your choice:");
            c=sc.nextInt();
            Switch(c){
                Case 1:s.reverseAString();
                    Break;
                Case 2:
                    String s1,s2;
                    System.out.println("Enter the string1:");
                    s2=sc.next();
                    System.out.println("Enter the string2:");
                    s1=sc.next();
                    int res = S.isSubstring(s1, s2);
                    If (res == -1)
                        System.out.println("Not present\n");
                    Else
                        System.out.println("String2 is a subString of String1\n");
                    Break;
                Case 3:s.commonElementBetweenTwoArraysOfIntegers();
                    Break;
                Case 4:s.addTwoMatrices();
                    Break;
                Case 5:System.exit(0);
            }
        }
    }
}
