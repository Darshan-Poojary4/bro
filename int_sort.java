class int_sort
{
	public static void main(String args[])
	{
		String sub[]={"java","se","ds"};
		int i,j;
		String temp=null;
		int len = sub.length;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if((sub[j].compareTo(sub[i]))>0)
				{
					temp=sub[i];
					sub[i]=sub[j];
					sub[j]=temp;
				}
			}
		}
		for(i=0;i<len;i++)
		{
			System.out.println(sub[i]);
		}
	}
}