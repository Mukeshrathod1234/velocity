package stringstudy;

public class Stringstudy {

	public static void main(String[] args) {
		String s="mukesh";
		String s1=new String("gajanan");
		
		//use of length method
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println("=============");
		//assigne the memory
		int kk = s.length();
		System.out.println(kk);
		//assigne the memory
		int kk1 = s1.length();
		System.out.println(kk1);
		System.out.println("=================");
		
		//use of ouppercase() method
		String a="chaya";
		String k=new String("mukesh");
		System.out.println("=========");
		System.out.println(a);
		System.out.println(k);
		System.out.println("=========");
		System.out.println(a.toUpperCase());
		System.out.println(k.toUpperCase());
		System.out.println("===========");
		//using assigning memory
		String b=a.toUpperCase();
		System.out.println(b);
		
		String m = k.toUpperCase();
		System.out.println(k);
		
		System.out.println("============");
		
		// use of tolovercase()method
		String j="AJAY";
		String g=new String("RATHOD");
		
		System.out.println(j);
		System.out.println(g);
		System.out.println("==========");
		System.out.println(j.toLowerCase());

		System.out.println(g.toLowerCase());
	System.out.println("===============");
	     //Assign memory
		   
	  String e = j.toLowerCase();
	  System.out.println(e);
	  
	  String t = g.toLowerCase();
	  System.out.println(t);
	  System.out.println("============");
	  
	  // use of equals()method
	  String h="velocity";
	  String h1= "velocity";
	  String h2=new String("velocity");
       String h3=new String("velocity");
       String h4 =new String("Velocity");
	  //== cheak the memory assigne
	  
	  System.out.println(h==h1);
	  System.out.println(h1==h2);
	  System.out.println(h2==h3);
	  System.out.println("===================");
	  System.out.println(h.equals(h1));
	  System.out.println(h1.equals(h2));
	  System.out.println(h2.equals(h3));
	  
	  //below falls bcos V is capital
		System.out.println(h3.equals(h4));
		
	// equlals ignor case
		
		System.out.println(h.equalsIgnoreCase(h1));
		System.out.println("===============");
		System.out.println("============");
		// contain
		String f="people";
		System.out.println(f.contains("peo"));
		System.out.println(f.contains("elp"));
		System.out.println("===============");
		
		//is empty
		String r ="people";
		String r1=" ";
		String r2="";
		String r3=null;
		
		System.out.println(r.isEmpty());
		System.out.println(r1.isEmpty());
		System.out.println(r2.isEmpty());
		System.out.println("===============");
		System.out.println("==============");
//r3 is null this turm are not exicute
		
		//char with
		
		String H="people";
		System.out.println(H.charAt(3));
		System.out.println(H.charAt(1));
		System.out.println("============");
		
		// ends with
		String y= "people";
		System.out.println(y.endsWith("e"));
		System.out.println(y.endsWith("ple"));
		System.out.println(y.endsWith("l"));
		System.out.println("============");
		
		//stsrt with
		
		String w="people";
		System.out.println(w.startsWith("p"));
		System.out.println(w.startsWith("peo"));
		System.out.println(w.startsWith("e"));
		System.out.println("============");
		
		
		//subs string
		String x="people";
		System.out.println(x.substring(1));
		System.out.println(x.substring(3));
		System.out.println("============");
		
		//concat method use
		String a1="goverment of";
		String a2="india";
		
		// usage
		System.out.println(a1.concat(a2));
		System.out.println(a1.concat("maharashtra"));
		System.out.println("=============");
		
		//index of method use
		String t1="tea";
		int index=t1.indexOf('e');
		System.out.println(index);
		int index1=t1.indexOf('a');
		System.out.println(index1);
		System.out.println("=============");
		
		String t2="india is my country which is 2nd biggest";
		System.out.println(t2.indexOf('n'));
		System.out.println(t2.indexOf('i'));
		//one printing statment remains
		
		
		
		
		
		
		
	}
}