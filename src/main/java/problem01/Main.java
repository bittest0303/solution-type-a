package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String s_num;
		char[] s_arr = null;
		
		s_num = Integer.toString(number);
		s_arr = s_num.toCharArray();
		
		for ( int i=0; i<s_num.length(); i++ ) {
			if ( s_arr[i]=='0' ) {
				return 0;
			}
			else if ( (int)s_arr[i]%3 == 0 ) {
				return 1;
			}
		}
		/*0-> false*/
		return 0;
	}
}