void main() {
    int temperature;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the temperature in Celcius: ");
    temperature = Integer.parseInt(input.nextLine());
    if (temperature < 0) {
        System.out.println("freezing");
    }
    if (temperature >= 0 && temperature < 30) {
        System.out.println("normal temperature");
    }
    if (temperature >= 30) {
        System.out.println("way too hot");
    }

    int delay;
    System.out.println("Please enter the delay in seconds: ");
    delay = Integer.parseInt(input.nextLine());
    while (delay < 0) {
        System.out.println("Please enter the delay in seconds: ");
        delay = input.nextInt();
    }
    int speedOfSound = 300;
    System.out.println("The thunder was " + speedOfSound * delay + " meters away");

    int age;
    System.out.println("Please enter your age: ");
    age = Integer.parseInt(input.nextLine());
    while (age<1||age>20) {
        System.out.println("Please enter your age: ");
        age = Integer.parseInt(input.nextLine());
    }
    System.out.println("*".repeat(age)+"\n"+"|".repeat(age)+"\n"+"-".repeat(age));
}