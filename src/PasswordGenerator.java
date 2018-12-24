public class PasswordGenerator {

    private char[] symbols={'%', '*', ')','?', '@', '#', '$', '~','_','-'};

    public String generate(int length){

        int var;
        StringBuilder builder = new StringBuilder();

        for (int i=0; i<length; i++){
            var = (int)(Math.random()*100)%4;
            switch (var){
                case 0:
                    builder.append(symbols[(int)(Math.random()*1000)%10]);
                    break;
                case 1:
                    builder.append((char)(((int)(Math.random()*1000)%26)+65));
                    break;
                case 2:
                    builder.append((char)(((int)(Math.random()*1000)%26)+97));
                    break;
                case 3:
                    builder.append((int)(Math.random()*10));
                    break;
            }
        }
        System.out.println("Your password is:  ");
        return builder.toString();
    }
}
