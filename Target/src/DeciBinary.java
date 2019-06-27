
public class DeciBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1234;
		int i =1;
		int div = 1;
		int cnt = 0;
		
		while(no>0)
		{
			no = no /(10);
			cnt++;
		}
		while(cnt>1)
		{
			div = div*10;
			cnt--;
		}
		
		no = no%cnt;
		System.out.println(cnt);
	}

}
