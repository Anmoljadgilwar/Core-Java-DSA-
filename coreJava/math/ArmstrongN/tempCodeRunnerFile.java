        int rem = n % 10;  //find the remainder (153%10 = 3) last digit 3
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }