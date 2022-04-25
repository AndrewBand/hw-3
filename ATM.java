public class ATM {
    public int countBanknotes(int sum){
        int count = 0;

        int count500 = sum/500;
        int count200 = (sum- 500*count500)/200;
        int count100 = (sum- 500*count500 - 200*count200)/100;
        int count50  = (sum- 500*count500 - 200*count200 - 100*count100)/50;
        int count20 = (sum- 500*count500 - 200*count200 - 100*count100 - 50*count50)/20;
        int count10 = (sum- 500*count500 - 200*count200 - 100*count100 - 50*count50 -20*count20)/10;
        int count5 = (sum- 500*count500 - 200*count200 - 100*count100 - 50*count50 -20*count20 - 10*count10)/5;
        int count2 = (sum- 500*count500 - 200*count200 - 100*count100 - 50*count50 -20*count20 - 10*count10 - 5*count5)/2;
        int count1 = (sum- 500*count500 - 200*count200 - 100*count100 - 50*count50 -20*count20 - 10*count10 - 5*count5 - 2*count2);

        return count=count500+count200+count100+count50+count20+count10+count5+count2+count1;
    }
    public static void main (String[] args){
        ATM atm = new ATM();
        System.out.println("atm.countBanknotes(578) = " + atm.countBanknotes(578));
    }
}
