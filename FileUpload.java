import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class FileUpload {
	List<Customer> list=new ArrayList<>();
	static String filePath;
	 
	public void readFile()
	{
		FileReader reader;
		
		try {
			reader = new FileReader(filePath);
			BufferedReader bufferReader=new BufferedReader(reader);
			String line=bufferReader.readLine();
			while(line!=null)
			{
				/*System.out.println(line);*/
				String arr[]=line.split("~",16);
				Customer c1=new Customer();
		        list.add(c1);
		        if(arr[0].isEmpty())
		        	c1.setCustomerCode(null);
		        else
				c1.setCustomerCode(arr[0]);
		        if(arr[1].isEmpty())
		        	c1.setCustomerName(null);
		        else
				c1.setCustomerName(arr[1]);
		        if(arr[2].isEmpty())
		        	c1.setCustomerAddress1(null);
		        else
				c1.setCustomerAddress1(arr[2]);
		        if(arr[3].isEmpty())
		        	c1.setCustomerAddress2(null);
		        else
				c1.setCustomerAddress2(arr[3]);
		        if(arr[4].isEmpty())
		        	c1.setCustomerPinCode(0);
		        else
				c1.setCustomerPinCode(Integer.parseInt(arr[4]));
		        if(arr[5].isEmpty())
		        	c1.setEmail(null);
		        else
				c1.setEmail(arr[5]);
		        if(arr[6].isEmpty())
		        	c1.setContactNo(0);
		        else
				c1.setContactNo(Long.parseLong(arr[6]));
		        if(arr[7].isEmpty())
		        	c1.setPrimaryContactPerson(null);
		        else
				c1.setPrimaryContactPerson(arr[7]);
		        if(arr[8].isEmpty())
		        	c1.setRecordStatus(null);
		        else
				c1.setRecordStatus(arr[8]);
		        if(arr[9].isEmpty())
		        	c1.setFlag(arr[9]);
		        else
				c1.setFlag(arr[9]);
				try{
					if(arr[10].isEmpty())
						c1.setCreateDate(null);
					else
				c1.setCreateDate(new SimpleDateFormat("dd/MMM/yyyy").parse(arr[10]));
				}
				catch(ParseException e)
				{
					e.printStackTrace();
				}
				if(arr[11].isEmpty())
					c1.setCreatedBy(null);
				else
				c1.setCreatedBy(arr[11]);
				
				try
				{
					if(arr[12].isEmpty())
						c1.setModifiedDate(null);
					else
				c1.setModifiedDate(new SimpleDateFormat("dd/MMM/yyyy").parse(arr[12]));
				}
				catch(ParseException e)
				{
					e.printStackTrace();
				}
				if(arr[13].isEmpty())
					c1.setModifiedBy(null);
				else	
				c1.setModifiedBy(arr[13]);
				try
				{
					if(arr[14].isEmpty())
						c1.setAuthorizedDate(null);
					else
				c1.setAuthorizedDate(new SimpleDateFormat("dd/MMM/yyyy").parse(arr[14]));
				}
				catch(ParseException e)
				{
					e.printStackTrace();
				}
				if(arr[15].isEmpty())
					c1.setAuthorizedBy(null);
				else
				c1.setAuthorizedBy(arr[15]);
				line=bufferReader.readLine();	
				
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void display()
	{
	  for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).toString());
		//System.out.println(list.get(i).getCustomerCode()+"\t"+list.get(i).getCustomerName()+"\t"+list.get(i).getCustomerAddress1()+"\t"+list.get(i).getCustomerAddress2()+"\t"+list.get(i).getCustomerPinCode()+"\t"+list.get(i).getEmail()+"\t"+list.get(i).getContactNo()+"\t"+list.get(i).getPrimaryContactPerson()+"\t"+list.get(i).getRecordStatus()+"\t"+list.get(i).getFlag()+"\t"+list.get(i).getCreatedBy()+"\t"+list.get(i).getCreateDate()+"\t"+list.get(i).getModifiedBy()+"\t"+list.get(i).getModifiedDate()+"\t"+list.get(i).getAuthorizedBy()+"\t"+list.get(i).getAuthorizedDate());
		}
	}
	/*public void writeDb()
	{
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
			for(int i=0;i<list.size();i++)
			{
			ps=con.prepareStatement("insert into stud0101 values(?,?,?)");
			ps.setInt(1,list.get(i).getStudentid());
			ps.setString(2,list.get(i).getStudentName());
			ps.setInt(3,list.get(i).getMarks());
			ps.executeUpdate();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		filePath=scanner.next();
		FileUpload f=new FileUpload();
		f.readFile();
		f.display();
		//f.writeDb();
		

	}

}