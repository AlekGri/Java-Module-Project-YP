public class Format {
    public static String GetRuble(double num){
        int desayt = ((int) num % 100) / 10;
        if (desayt == 1)
        {
            return "рублей";
        }

        switch ((int)num % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

}
