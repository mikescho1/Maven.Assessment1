package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer count = 0;
        for(Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1) {
                ints[count++] = ints[i];
            }
        }for(int i = count; i < ints.length; i++)   {
                ints[i] = 0;
            }
        Integer[] ints2 = new Integer[ints.length - count];
        for(int i = 0; i < ints2.length; i++)   {
            int j = i + count;
            ints2[i] = ints[ints.length -j - 1];
        }

        /*Integer [] ints2 = new Integer[ints.length - count];
        for(Integer i = 0; i < ints.length - count; i++) {
            if (ints[i] % 2 == 1) {
                ints2[i] = ints[i];
            }   if (ints[i] % 2 == 0) {
                int j = i + 1;
                ints2[i] = ints[j];*/




        return ints2;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer count = 0;
        for(Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                ints[count++] = ints[i];
            }
        }for(int i = count; i < ints.length; i++)   {
            ints[i] = 0;
        }
        Integer[] ints2 = new Integer[ints.length - count];
        for(int i = 0; i < ints2.length; i++)   {
            int j = i + count;
            ints2[i] = ints[ints.length -j - 1];
        }


        return ints2;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer count = 0;
        for(Integer i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                ints[count++] = ints[i];
            }
        }for(int i = count; i < ints.length; i++)   {
            ints[i] = 0;
        }
        Integer[] ints2 = new Integer[ints.length - count];
        for(int i = 0; i < ints2.length; i++)   {
            int j = i + count;
            ints2[i] = ints[ints.length -j - 1];
        }


        return ints2;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer count = 0;
        for(Integer i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                ints[count++] = ints[i];
            }
        }for(int i = count; i < ints.length; i++)   {
            ints[i] = 0;
        }
        Integer[] ints2 = new Integer[ints.length - count];
        for(int i = 0; i < ints2.length; i++)   {
            int j = i + count;
            ints2[i] = ints[ints.length -j - 1];
        }


        return ints2;
    }
}
