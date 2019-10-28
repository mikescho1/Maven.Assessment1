package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

//        int flagHeight = k;
//        int jumpHeight = j;



        int jumpCounter = 0;
        int jumpedDistance = 0;


        for (int i = 0; i <= k; i++) {
            if ((i < 1) && (j <= k)) {
                jumpedDistance = j;
                jumpCounter++;
            }   else if((i < 1) && (j > k)) {
                jumpedDistance = 1;
                jumpCounter++;
            }   else if((i > 1) && (jumpedDistance + j <= k)) {
                jumpedDistance =  jumpedDistance + j;
                jumpCounter++;
            }   else if((i > 1) && (jumpedDistance + 1 <= k)) {
                jumpedDistance = jumpedDistance + 1;
                jumpCounter++;

            }
        }
        return jumpCounter;
    }



        /*while(singleUnitJump + k < l)   {
            if(jumpedDistance + l <= k)   {
                jumpCounter++;
                jumpedDistance += k;
            }   else    {
                jumpCounter++;
                jumpedDistance += singleUnitJump;
            }
        }
        return jumpCounter;*/

}
