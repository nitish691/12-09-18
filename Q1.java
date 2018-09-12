import java.io.*;

class Q1
{
	public static void main(String args[])
	{
		File f1 = new File("F:/Chitkara/ACADVIEW/12-09-18/abc.txt");
		File f2 = new File("F:/Chitkara/ACADVIEW/12-09-18/xyz.txt");
		
		try
		{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			int i;
			
			i = fin.read();
			while(i != -1)
			{
				fout.write((char)i);
				i = fin.read();
			}
			fout.close();
			fin.close();
			
			System.out.println("The contents of xyz.txt are :");
			fin = new FileInputStream(f2);
			i = fin.read();
			while(i != -1)
			{
				System.out.print((char)i);
				i = fin.read();
			}
			fin.close();
			}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println();
	}
}