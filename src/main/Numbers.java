package ucu.edu.ua;


public static class Numbers {
    public static void main(String[] args) {
        new Three();
        }
    }


class One {
    public One() {
        System.out.print(1);
    }
}

class Two extends One {
    public Two() {
        System.out.print(2);
    }
}

class Three extends Two {
    public Three() {
        System.out.print(3);
    }
}

