public class Start {

    public static void main(String[] args) {
        //System.out.println( matchResult(1, 1, 2, 1));

        String[] plans = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
        System.out.println(createDailyPlan(plans));

    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
        //Write code below this line
        int finalResult;
        finalResult = (result1 == bet1 && result2 == bet2) ? 2 : (((result1 - result2 == 0) && (bet1 - bet2 == 0))
        || (((result1 > result2) && (bet1 > bet2)) || ((result1 < result2) && (bet1 < bet2)))) ? 1 : 0;
        return finalResult;
        //Write code above this line
    }

    public static String createDailyPlan(String[] plans) {
        //Write code below this line
        String result;
        StringBuilder strBuild = new StringBuilder("\"My plans:" + "\n");
        for(int i = 0; i < plans.length; i++){
            strBuild.append(i + 1 +".) " + plans[i] + ";" + "\n");
        }

        int index = strBuild.lastIndexOf("\n");
        strBuild.deleteCharAt(index);
        strBuild.append("\"");

        //strBuild.replace(strBuild.length(), strBuild.length(),"\"");
        return result = strBuild.toString();
        //Write code above this line
    }
}
