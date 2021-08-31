/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_sharing;

/**
 *
 * @author mac
 */
public class Recursive {
    private int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else
            return x * power(x, y-1 );
    }
    public static void main(String args[])
    {
        Recursive recursive = new Recursive();
        System.out.println(recursive.power(2, 3));
    }
}
