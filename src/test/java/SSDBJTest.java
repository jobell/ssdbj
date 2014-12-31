import java.util.ArrayList;
import java.util.Properties;

import com.lovver.ssdbj.core.SSDBDriver;
import com.lovver.ssdbj.core.impl.SSDBConnection;
import com.lovver.ssdbj.core.impl.SSDBResultSet;



public class SSDBJTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		SSDBDriver dd= new SSDBDriver();
		Properties info = new Properties();
		info.setProperty("user", "test");
		info.setProperty("password", "ddd");
		info.setProperty("loginTimeout", "300");
		info.setProperty("tcpKeepAlive", "true");
		info.setProperty("protocolName", "ssdb");
		info.setProperty("protocolVersion", "ddd");
		
		info.setProperty("SSDB_HOST", "192.168.0.226");
		info.setProperty("SSDB_PORT", "8888");
		SSDBConnection conn= dd.connect(info);
		ArrayList<byte[]> setparams=new ArrayList<byte[]>(){
			{
				add("joliny".getBytes());
				add("kkk".getBytes());
				add("�ǵķ����ط���1231sdfsfg23".getBytes());
			}
		};
		conn.execute("hset",setparams);
		
		ArrayList params=new ArrayList();
		params.add("joliny".getBytes());
		params.add("kkk".getBytes());
		SSDBResultSet rs=conn.execute("hget",params );
		System.out.println(new String(rs.getResult()));
	}

}
