import java.util.Scanner;
class bmi{
    double weight;
        double height;
        double h2;
        double b;
        int age;

        bmi(double weight,double height,int age){
            this.weight=weight;
            this.height=height;
            this.age=age;

        }
        public void bmi_measure(){
            h2=height*height;
            b=weight/h2;
           // System.out.println("Your Body Mass Index(BMI) is: "+b);
        }
        public void display(){
            System.out.println("Age: "+age);
            System.out.println("Weight(in kg): "+weight);
            System.out.println("Height(in meters): "+height);
            System.out.println("Body Mass Index(BMI): "+b);
           
        }
        public void teens(){
            if(b<=5){
                System.out.println("BMI Category: Underweight");
                System.out.println("------------------------------------------------");
            }
            if(b>5 && b<=85){
                System.out.println("BMI Category: Healthy weight");
                System.out.println("------------------------------------------------");
            }
            if(b>85 && b<=95){
                System.out.println("BMI Category: At risk of overweight");
                System.out.println("------------------------------------------------");
            }
            if(b>95){
                System.out.println("BMI Category: Overweight");
                System.out.println("------------------------------------------------");
            }
        }
        public void adults(){
            if(b<=16){
                System.out.println("BMI Category: Severe Thinness");
                System.out.println("------------------------------------------------");
            }
            if(b>16 && b<=17){
                System.out.println("BMI Category: Moderate Thinness");
                System.out.println("------------------------------------------------");
            }
            if(b>17 && b<=18.5){
                System.out.println("BMI Category: Mild Thinness");
                System.out.println("------------------------------------------------");
            }
            if(b>18.5 && b<=25){
                System.out.println("BMI Category: Normal");
                System.out.println("------------------------------------------------");
            }
            if(b>25 && b<=30){
                System.out.println("BMI Category: Overweight");
                System.out.println("------------------------------------------------");
            }
            if(b>30 && b<=35){
                System.out.println("BMI Category: Obese Class 1");
                System.out.println("------------------------------------------------");
            }
            if(b>35 && b<=40){
                System.out.println("BMI Category: Obese Class 2");
                System.out.println("------------------------------------------------");
            }
            if(b>40){
                System.out.println("BMI Category: Obese Class 3");
                System.out.println("------------------------------------------------");
            }
        }
        
        
}
public class BMI_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name;
        int age;
        double weight;
        double height;
        int choice;
        System.out.println("BMI is measurment of the person's leanness or corpulence based on their height and weight.");
        System.out.println("BMI is intended to quntify the tissue mass.");
        System.out.println("Enter name ");
        name =sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Select your gender");
        System.out.println("1.Male");
        System.out.println("2.Female");
        System.out.println("3.Other");
        choice=sc.nextInt();
        System.out.println("Enter weight(in kg)");
        weight=sc.nextDouble();
        System.out.println("Enter height(in meters)");
        height=sc.nextDouble();
        bmi b=new bmi(weight, height,age);
        b.bmi_measure();
        System.out.println("------------------------------------------------");
        System.out.println("Name: "+name);
        switch(choice){
            case 1: {
                System.out.println("Gender: Male");
                if( age<=20){
                    b.display();
                    b.teens();
                }
                if(age>20){
                    b.display();
                    b.adults();
                }
               // b.display();
                break;
            }
            case 2: {
                System.out.println("Gender: Female");
                if( age<=20){
                    b.display();
                    b.teens();
                }
                if(age>20){
                    b.display();
                    b.adults();
                }
               // b.display();
                break;
            }
            case 3: {
                System.out.println("Gender: Other");
                if( age<=20){
                    b.display();
                    b.teens();
                }
                if(age>20){
                    b.display();
                    b.adults();
                }
                //b.display();
                break;
            }
            default : {
                System.out.println("Invalid input");
                break;
            }
        }
       // b.display();

        
    }
}