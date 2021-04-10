/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.utiil;

/**
 *
 * @author Quoc Dat
 */
public class Math {
    //hàm tính n!= 1.2.3.4.5...n
    //0!=1!=1;
    //21! gia thừa sẽ vượt kiểu long
    public static long getFactorial(int n){
        if (n < 0 || n >20)
            throw new IllegalArgumentException("Invalid argument. It must be between 0 and 20.");
        
        if (n == 0 || n ==1)
            return 1;
        // chỗ này có 2 cách viết với n-1;
        //cách 1 dùng for
        //cách 2 dùng đệ quy
        return n *getFactorial(n-1);
    }
}
