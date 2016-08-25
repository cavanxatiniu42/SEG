
public class Integer {
    private int number;

    public Integer(int number){
        this.number = number;
    }
    public Integer add(int number){
        this.number = this.number + number;
        return new Integer(this.number);
    }
    public Integer sub (int number){
        this.number = this.number - number;
        return new Integer(this.number);
    }
    public Integer mul (int number){
        this.number = this.number * number;
        return new Integer(this.number);
    }
    public double div (int number){
        this.number = this.number/number;
        return this.number;
    }
    public Integer isEven (int number){
        if (number%2 == 0){
            return new Integer(number);
        }
        else return null;
    }
    public Integer isOdd (int number){
        if (number%2 ==1){
            return new Integer(number);
        }
        else return null;
    }
    public Integer isPrime (int number){
        if (number >= 0){
            for (int i = 2; i < number/2 ; i++) {
                if (number%i == 0){
                    return null;
                }
            }

        }
        return new Integer(number);
    }
    public int getValue (int number){
        return number;
    }
    public Integer createInt (String str){
        str = str.replaceAll("[^0-9]",",");
        String[] item = str.split(",");
        int[] number = new int[item.length];
        for (int i = 0; i <item.length ; i++) {
            number[i] = java.lang.Integer.parseInt(item[i]);
            return new Integer(number[i]);
        }
        return null;
    }
    public Integer lower(double number){
        int newNumber = (int)number;
        double newNumber2 = (double)newNumber;
        double sub = number -newNumber2;
        if (sub < 0.5){
            number = number-sub;
            return new Integer((int)number);
        }
        return null;
    }
    public Integer upper (double number){
        int newNumber = (int)number;
        double newNumber2 = (double)newNumber;
        double sub = number - newNumber2;
        if (sub >0.5){
            number = number + (1-sub);
            return new Integer((int)number);
        }
        return null;
    }
}
