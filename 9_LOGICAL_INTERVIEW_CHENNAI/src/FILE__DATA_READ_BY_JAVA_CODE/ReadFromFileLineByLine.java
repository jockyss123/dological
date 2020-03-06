package FILE__DATA_READ_BY_JAVA_CODE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadFromFileLineByLine {
	Map<String, Map> clazData = new HashMap<String, Map>();
	Map<String, String> methodData = new HashMap<String, String>();

	public void readData(String file) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("\\F:\\textreader\\DATA.txt"));
			String line = null; 
			String clz= null;
			while ((line = br.readLine()) != null) {
				clz=line.substring(0, line.lastIndexOf("."));
				if (clazData.isEmpty()) {
					clazData.put(clz, methodData);
				}
				if (clazData.containsKey(clz)) {
					String method=line.substring(line.lastIndexOf(".") + 1, line.lastIndexOf("="));
					String count=line.substring(line.lastIndexOf("=") + 1);
					methodData.put(method,count);
				} else {
					methodData.clear();
					clazData.put(clz, methodData);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void displayFormatedData() {
		Set<String> clzs = clazData.keySet();
		for (String clz : clzs) {
			System.out.println(clz);
			Map<String, String> methodz = clazData.get(clz);
			methodz.keySet().stream().sorted().forEach(mthd -> {
				System.out.println("\t" + mthd + "=" + methodz.get(mthd));
			});
		}
	}

	public List getUniqueClazList() {
		return clazData.keySet().stream().collect(Collectors.toList());
	}

	public List getUniqueMethods(String clazName) {
		return (List) clazData.get(clazName).keySet().stream().collect(Collectors.toList());
	}

	public String getMethodInvoCount(String clazName, String method) {
		return (String) clazData.get(clazName).get(method);
	}

	public static void main(String[] args) throws IOException {
		ReadFromFileLineByLine data = new ReadFromFileLineByLine();
		data.readData("data");
		data.displayFormatedData();
		System.out.println(data.getUniqueClazList());
		System.out.println(data.getUniqueMethods("com.mgmt.util.DateTimeTOkinizer"));
		System.out.println(data.getMethodInvoCount("com.mgmt.util.DateTimeTOkinizer", "isSampleLabelson"));

	}
}
