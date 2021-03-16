
package Week2HW224;
import java.util.Scanner;


public class HW224 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter a second number: ");
            int num2 = input.nextInt();
            System.out.print("Please enter a third number: ");
            int num3 = input.nextInt();
            System.out.print("Please enter a fourth number: ");
            int num4 = input.nextInt();
            System.out.print("Please enter a fifth number: ");
            int num5 = input.nextInt();
            
            if (num1 > num2){
                if(num1 > num3){
                    if (num1 > num4){
                        if (num1 > num5){
                            System.out.println(num1 + " is largest");
                        }
                    }
                }
            }
            if (num2 > num3){
                if(num2 > num4){
                    if (num2 > num5){
                        if (num2 > num1){
                            System.out.println(num2 + " is largest");
                        }
                    }
                }
            }
            if (num3 > num4){
                if(num3 > num5){
                    if (num3 > num1){
                        if (num3 > num2){
                            System.out.println(num3 + " is largest");
                        }
                    }
                }
            }
            if (num4 > num5){
                if(num4 > num1){
                    if (num4 > num2){
                        if (num4 > num3){
                            System.out.println(num4 + " is largest");
                        }
                    }
                }
            }
            if (num5 > num1){
                if(num5 > num2){
                    if (num5 > num3){
                        if (num5 > num4){
                            System.out.println(num5 + " is largest");
                        }
                    }
                }
            }
            if (num1 < num2){
                if(num1 < num3){
                    if (num1 < num4){
                        if (num1 < num5){
                            System.out.println(num1 + " is smallest");
                        }
                    }
                }
            }
            if (num2 < num3){
                if(num2 < num4){
                    if (num2 < num5){
                        if (num2 < num1){
                            System.out.println(num2 + " is smallest");
                        }
                    }
                }
            }
            if (num3 < num4){
                if(num3 < num5){
                    if (num3 < num1){
                        if (num3 < num2){
                            System.out.println(num3 + " is smallest");
                        }
                    }
                }
            }
            if (num4 < num5){
                if(num4 < num1){
                    if (num4 < num2){
                        if (num4 < num3){
                            System.out.println(num4 + " is smallest");
                        }
                    }
                }
            }
            if (num5 < num1){
                if(num5 < num2){
                    if (num5 < num3){
                        if (num5 < num4){
                            System.out.println(num5 + " is smallest");
                        }
                    }
                }
            }
    }
    
}
