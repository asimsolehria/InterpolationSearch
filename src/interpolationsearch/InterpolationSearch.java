
package interpolationsearch;

/**
 *
 * @author asim
 */
public class InterpolationSearch {

public int interpolationSearch(int arr[] ,int x) 
    { 
        int start = 0, end = (arr.length - 1); 
       
 
        while (start <= end && x >= arr[start] && x <= arr[end]) 
        {         
  
            if (start == end) 
            { 
                if (arr[start] == x) return start; 
                return -1; 
            }
              
            int pos = start + (((end-start) / 
                  (arr[end]-arr[start]))*(x - arr[start]));

            if (arr[pos] == x) 
                return pos;

            if (arr[pos] < x) 
                start = pos + 1; 
       
            else
                end = pos - 1; 
        } 
        return -1; 
    } 
    
}
