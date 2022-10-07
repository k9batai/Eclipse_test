public class Main{
	public static void main(String[ ] args){
		 String str1 = "hello";
	        //そのまま表示してみる
	        System.out.println(str1);
	        //文字列を大文字に変換する機能
	        String str2 = str1.toUpperCase( );
	        System.out.println(str2);
	        //文字列の中の'l'の文字をすべて'x'に変換する機能
	        String str3 = str1.replace('l', 'x');
	        System.out.println(str3);
	        //文字列の長さを調べる機能
	        int size = str1.length( );
	        System.out.println("文字列の長さは" + size + "です");
    }
}   