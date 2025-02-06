import java.util.*;
class EVM{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
		System.out.println();
		System.out.println("            WELCOME");
		System.out.println();
		System.out.println("Enter the Population : ");
		 int population = sc.nextInt();

		 for(int i = 1; i<=population; i++)
		 {
		 	System.out.println();
		 	System.out.println(" ***LIST OF PARTIES : ");
		 	System.out.println("1. BJP");
		 	System.out.println("2. CONGRESS");
		 	System.out.println("3. SHIV SENA");
		 	System.out.println("4. AAP");
		 	System.out.println("5. MNS");
		 	System.out.println("6. NOTA");
		 	System.out.println();
		 	System.out.println("Enter the option : ");

		 	int opt = sc.nextInt();
		 	if(opt >= 1 && opt <= 6){
		 		if(opt==1)
		 		{
		 			bjp++;
		 			System.out.println("Acche Din Aayege");
		 		}
		 		if(opt==2)
		 		{
		 			cng++;
		 			System.out.println("Bharat Todo");
		 		}
		 		if(opt==3)
		 		{
		 			ss++;
		 			System.out.println("Hum Hai Asli Sena");
		 		}
		 		if(opt==4)
		 		{
		 			aap++;
		 			System.out.println("Muje Aajad Karo");
		 		}
		 		if(opt==5)
		 		{
		 			mns++;
		 			System.out.println("Jai Hindustan");
		 		}
		 		if(opt==6)
		 		{
		 			nota++;
		 			System.out.println("You are an Educated Person");
		 		}

		 		if(!(opt>=1 && opt<=6)){
		 			i--;
		 			System.out.println("INVALID OPTION");
		 		}
		 	}
		 	if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
		 		System.out.println("BJP has won the Election by " + bjp + " votes");
		 	}
		 	if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
		 		System.out.println("CNG has won the Election by " + cng + " votes");
		 	}
		 	if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota){
		 		System.out.println("SS has won the Election by " + ss + " votes");
		 	}
		 	if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota){
		 		System.out.println("aap has won the Election by " + aap + " votes");
		 	}
		 	if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota){
		 		System.out.println("MNS has won the Election by " + mns + " votes");
		 	}
		 	if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && nota>=bjp){
		 		System.out.println("NOTA has won the Election by " + nota + " votes");
		 	}
		 }
    }
}

