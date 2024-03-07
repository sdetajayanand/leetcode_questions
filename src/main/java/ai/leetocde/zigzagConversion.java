/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
 */
package ai.leetocde;

public class zigzagConversion {

    public String convert(String s, int numRows)
    {
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            sbs[i] = new StringBuilder();
        }
        char arr[] = s.toCharArray();
        int n = arr.length;
        int index = 0;

        while(index<n)
        {
            for(int j=0;j<numRows && index<n;j++)
            {
                sbs[j].append(arr[index++]);
            }
            for(int j=numRows-2; j>0 && index<n ; j--)
            {
                sbs[j].append(arr[index++]);
            }
        }
        StringBuilder res = sbs[0];
        for(int i=1;i<numRows;i++)
        {
            res.append(sbs[i].toString());
        }
        return res.toString();
    }
}
