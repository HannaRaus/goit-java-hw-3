class ATM {    
    public int countBanknotes(int sum) {
        int counter = 0;
        int sumLeft = sum;

        counter = sumLeft / 500;

        sumLeft %= 500;

        counter += sumLeft / 200;
        sumLeft %= 200;

        counter += sumLeft / 100;
        sumLeft %= 100;

        counter += sumLeft / 50;
        sumLeft %= 50;

        counter += sumLeft / 20;
        sumLeft %= 20;

        counter += sumLeft / 10;
        sumLeft %= 10;

        counter += sumLeft / 5;
        sumLeft %= 5;

        counter += sumLeft / 2;
        sumLeft %= 2;

        counter += sumLeft;
       
        return counter;
    }
}
