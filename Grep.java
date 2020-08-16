import java.io.*;
import java.util.regex.Pattern;


interface LambdaExpression1Interface { 
	void abstractFun(String x); 
} 

	public class Grep {
	    static int count;
		public static boolean cMethod(String regEx, String aString) {
		int count=0;
			if ( Pattern.matches(regEx, aString) ) {
				return true;
			}
			 	return false;
		}
//		int count=0;
//		while(str.length()>0) {
//			int index=str.indexOf("one");
//			if(index+3>str.length()) {
//				break;
//			}
//			str=str.substring(index+3, str.length());
//			count+=1;
//		}
//		return count;
    
		public static void main( String args[] ) {
			Grep hp=new Grep();
			//String str="one one one one one";
			//System.out.println(cMethod("(one)+.*",str));
			if(args.length>0){  
				for(int i=0;i<args.length;i++){  
					System.out.println("第"+i+"个参数为:"+args[i]);  
				}  
			}  
			if(args.length < 2){
				System.err.println("Usage: java Grep search-string file-name [outputfilename]");
				System.exit(1);
			}
			
			LambdaExpression1Interface lambdaObj= (String aStr)-> {if (aStr.equals("-q")) System.exit(1);};
			lambdaObj.abstractFun("start");
			
			
			
			LambdaExpression1Interface lambdaObj1=(String aStr1)-> {if (aStr1.equals("-l")) System.out.println(args[2]);};
			lambdaObj1.abstractFun("start");
			
				
			LambdaExpression1Interface lambdaObj2=(String aStr2)->{	if(args[0].equals("-w") && !args[1].equals("-c"))
				 {
					String FILENAME =args[2];
					BufferedReader input = null;
					try {
						input = new BufferedReader( new FileReader(FILENAME));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}       
					String line;
					try {
						while ( ( line = input.readLine() )  != null ) {	
							if(cMethod("("+args[1]+")"+".*",line) ) {
								System.out.println(line);
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			lambdaObj2.abstractFun("start");
			
			
			LambdaExpression1Interface lambdaObj3=(String aStr3)->{	if(args[0].equals("-w") && args[1].equals("-c"))
				{
					String FILENAME =args[3];  
					BufferedReader input = null;
					try {
						input = new BufferedReader( new FileReader(FILENAME));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}       
					String line;
					try {
						while ( ( line = input.readLine() )  != null ) {
							if(cMethod("("+args[2]+")*",line) ) {
								//(^one|one$)注意regular expression在java中要全字符匹配
								count+=1;
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						System.out.println("-w -c: "+count);
				}
			};
			lambdaObj3.abstractFun("start");
			
			
			LambdaExpression1Interface lambdaObj4=(String aStr4)->{	if(args[0].equals("-c"))
				 {
					String FILENAME =args[2];  
					BufferedReader input = null;
					try {
						input = new BufferedReader( new FileReader(FILENAME));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}       
					String line;
					try {
						while ( ( line = input.readLine() )  != null ) {
							if(cMethod("("+args[1]+")"+".*",line) ) {
								count+=1;
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
						System.out.println("-c: "+count);
				}
			};
			lambdaObj4.abstractFun("start");
		}
	}
	