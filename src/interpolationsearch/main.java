
package interpolationsearch;

/**
 *
 * @author asim
 */
public class main {
    
    public static void main(String[] args) 
    {
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        
        InterpolationSearch search=new InterpolationSearch();
        
        System.out.println(search.interpolationSearch(array, 12));
    }
}
