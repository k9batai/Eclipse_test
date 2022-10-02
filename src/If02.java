class If02 {
    static String stafield = "これは静的フィールドです";
    static void Introduction(){
        System.out.println("これは静的メソッドです");
    }
    public static void main(String[] args) {
        System.out.println(If02.stafield);
        If02.Introduction();
    }
}