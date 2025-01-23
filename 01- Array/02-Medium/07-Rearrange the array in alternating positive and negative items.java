//VARIETY -1 (NEGATIVE == POSTIVE NUMBRS)

//BRTUTEFORFCE 

public static int[] rearrangeBySign(int[] A, int n) {
    int[] pos = new int[n / 2];
    int[] neg = new int[n / 2];

  
    int posIndex = 0, negIndex = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] > 0) {
            pos[posIndex++] = A[i];
        } else {
            neg[negIndex++] = A[i];
        }
    }

    for (int i = 0; i < n / 2; i++) {
        A[2 * i] = pos[i];
        A[2 * i + 1] = neg[i];
    }

    return A;
}


//OPTMIZED SINGLE ITERATION

class Solution {
    public int[] rearrangeArray(int[] A) {
        int n=A.length;
        int[] result = new int[n];
    int posIndex = 0, negIndex = 1;

    for (int i = 0; i < n; i++) {
        if (A[i] > 0) {
            result[posIndex] = A[i]; // Place positive at even index.
            posIndex += 2;
        } else {
            result[negIndex] = A[i]; // Place negative at odd index.
            negIndex += 2;
        }
    }
    return result;
    }
}
