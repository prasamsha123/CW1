package QuestionA;

public class Paranthesis {
	public static void main(String[] args) {
        String data = "{()}{}";
        Paranthesis a=new Paranthesis();
        System.out.print("{()}{} output is: \n"+a.isBalanced(data));
    }

 

    boolean isBalanced(String data) {

 

        String openparanthesis="[{(";
        String closedparanthesis="]})";
        int size= data.length();

 

        Stack stk=new Stack(size);

 

        for(int i=0; i<size;i++) { 
            char paranthesis = data.charAt(i);
            if(openparanthesis.indexOf(paranthesis)!=-1) 
            {
                stk.push(paranthesis);
            }
            else
            {
                int index=closedparanthesis.indexOf(paranthesis);
                char opening=openparanthesis.charAt(index);
                if(stk.pop()!=opening) {
                    return false;
                }
            }
        }
 
        if(stk.peak()==-1) {
            return true;
        }
        else{return false;}

 


    }

 

}
