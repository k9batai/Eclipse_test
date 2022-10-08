public class VariablePractice {
	public static void main(String[] args) {
        int MotherLanguage_Score;
        int English_Score;
        int Mathematics_Score;
        MyScore tanaka = new MyScore();
        tanaka.setMotherLanguage_Score(80);
        System.out.println("田中さんの国語の成績を登録しました");
        MotherLanguage_Score = tanaka.getMotherLanguage_Score();
        System.out.println("田中さんの国語の成績は" + MotherLanguage_Score + "点です" );
        System.out.println();
        tanaka.setEnglish_Score(100);
        System.out.println("田中さんの英語の成績を登録しました");
        English_Score = tanaka.getEnglish_Score();
        System.out.println("田中さんの英語の成績は" + English_Score + "点です" );
        System.out.println();
        tanaka.setMathematics_Score(60);
        System.out.println("田中さんの数学の成績を登録しました");
        Mathematics_Score = tanaka.getMathematics_Score();
        System.out.println("田中さんの数学の成績は" + Mathematics_Score + "点です" );
    }
}

	class MyScore{
    private int MotherLanguage_Score;  //国語のテストの点数
    private int English_Score;         //英語のテストの点数
    private int Mathematics_Score;     //数学のテストの点数
    public void setMotherLanguage_Score(int mother_s){
        MotherLanguage_Score = mother_s;
    }
    public void setEnglish_Score(int en_s){
        English_Score =  en_s;
    }
    public void setMathematics_Score(int math_s){
        Mathematics_Score = math_s;
    }
    public int getEnglish_Score(){
        return English_Score;
    }
    public int getMotherLanguage_Score(){
        return MotherLanguage_Score;
    }
    public int getMathematics_Score(){
        return Mathematics_Score;
    }
}

