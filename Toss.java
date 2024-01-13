
package Cricket;
import java.util.*;
public class Toss
{
    static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 1 for Heads And 2 For Tails");
        int t=ob.nextInt();
        int n1234=(int)(Math.random()*2);
        if(t==n1234)
        {
            System.out.println("You Have Won The Toss. Aaj Lagta Hai BHgwaan Tumhare Saath Hai");
            System.out.println("Choose 1 for Batting and 2 for Bowling");
            int start=ob.nextInt();
            if(start==1)
            {
                int s=0;
                System.out.println("Its Batting Time");
                int b;
                for(int i=0;i<1000;i++)
                {
                    do
                    {
                        b=ob.nextInt();
                        if(b>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int bo=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+b);
                    System.out.println("Computer's No= "+bo);
                    System.out.println();

                    if(b!=bo)
                    {
                        s=s+b;
                    }
                    else if(b==bo)
                    {
                        break;
                    }
                }
                System.out.println("You Are Out");
                System.out.println("Total Score= "+s);
                System.out.println("");
                System.out.println("");
                System.out.println("Its Bowling Time");
                int s1=0;
                int bo1;
                for(int i=0;i<1000;i++)
                {
                    do
                    {
                        bo1=ob.nextInt();
                        if(bo1>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int b1=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+bo1);
                    System.out.println("Computer's No= "+b1);
                    System.out.println();

                    if(bo1!=b1)
                    {
                        s1=s1+b1;
                        if(s1>s)
                        {
                            System.out.println("Total Score= "+s1);
                            System.out.println("Computer wins");

                            break;
                        }
                    }
                    else if(b1==bo1)
                    {
                        System.out.println("Computer is Out");
                        System.out.println("Total Score= "+s1);
                        break;
                    }

                }

                System.out.println("");
                System.out.println("");
                if(s>s1)
                {
                    System.out.println("You win. You have made your Mom and Dad proud");
                }
                else if(s<s1)
                {
                    System.out.println("Tumse Na ho paye ga");
                }
                else 
                {
                    System.out.println("Its a tie");
                }
            }
            else if(start== 2)
            {
                int s2=0;
                int s3=0;

                System.out.println("Its Bowling Time");
                int bo2;
                for(int i=0;i<1000;i++)
                {
                    do
                    {
                        bo2=ob.nextInt();
                        if(bo2>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int b2=(int)(Math.random()*10.49);
                    System.out.println("Computer's No= "+b2);
                    System.out.println("Your No= "+bo2);
                    System.out.println();
                    if(b2!=bo2)
                    {
                        s2=s2+b2;
                    }
                    else 
                    {

                        break;
                    }
                }
                System.out.println("You did it.Computer is Out");
                System.out.println("Computer's Score= "+s2);
                System.out.println("");
                System.out.println("Now its Batting Time.Tumhe mera Ashirvaad Hai.VijayiBhava");
                int b3;
                for(int i=0;i<1000;i++)
                {
                    do
                    {
                        b3=ob.nextInt();
                        if(b3>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int bo3=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+b3);
                    System.out.println("Computer's No= "+bo3);
                    System.out.println();

                    if(b3!=bo3)
                    {
                        s3=s3+b3;
                        if(s3>s2)
                        {
                            System.out.println("Total Score= "+s3);
                            System.out.println("You win");

                            break;
                        }
                    }

                    else if(b3==bo3)
                    {
                        System.out.println("You are Out");
                        System.out.println("Total Score= "+s3);
                        break;
                    }

                    System.out.println("");
                    System.out.println("");

                }
            }
            else
            {
                System.out.println("Wrong Input");
            }
        }

        else
        {
            System.out.println("You Have Lost The Toss.Lagta hai Shanni ka Prakop Chalraha hai Tumhare Saar Pe");
            int n12=(int)(Math.random()*2);
            System.out.println("");
            if(n12==1)
            {
                System.out.println("Computer Chooses To Bat First");
                System.out.println("");
                int s2=0;
                int s3=0;

                System.out.println("Its Bowling Time");
                for(int i=0;i<1000;i++)
                {
                    int bo2;
                    do
                    {
                        bo2=ob.nextInt();
                        if(bo2>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int b2=(int)(Math.random()*10.49);
                    System.out.println("Computer's No= "+b2);
                    System.out.println("Your No= "+bo2);
                    System.out.println();
                    if(b2!=bo2)
                    {
                        s2=s2+b2;
                    }
                    else 
                    {

                        break;
                    }
                }
                System.out.println("You did it.Computer is Out");
                System.out.println("Computer's Score= "+s2);
                System.out.println("");
                System.out.println("Now its Batting Time.Tumhe mera Ashirvaad Hai.VijayiBhava");
                for(int i=0;i<1000;i++)
                {
                    int b3;
                    do
                    {
                        b3=ob.nextInt();
                        if(b3>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int bo3=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+b3);
                    System.out.println("Computer's No= "+bo3);
                    System.out.println();
                    if(s3<s2)
                    {

                        if(b3!=bo3)
                        {
                            s3=s3+b3;
                        }
                        else if(b3==bo3)
                        {
                            System.out.println("You Are Out");
                            System.out.println("Total Score= "+s3);
                            break;
                        }
                    }

                    else
                    {
                        System.out.println("You Win");
                        break;
                    }
                }

                System.out.println("");
                System.out.println("");
                if(s3>s2)
                {
                    System.out.println("You Did It.You Have Made Your Mom Dad Proud"); 
                }
                else if(s3<s2)
                {
                    System.out.println("Tumse Na Hopayega");

                }
                else
                {
                    System.out.println("Its A Miracle,Its a TIE");
                }

            }
            else
            {
                System.out.println("Computer Chooses To Bowling First");
                System.out.println("");
                int s=0;
                System.out.println("Its Batting Time");
                for(int i=0;i<1000;i++)
                {
                    int b;
                    do
                    {
                        b=ob.nextInt();
                        if(b>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int bo=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+b);
                    System.out.println("Computer's No= "+bo);
                    System.out.println();

                    if(b!=bo)
                    {
                        s=s+b;
                    }
                    else if(b==bo)
                    {
                        break;
                    }
                }
                System.out.println("You Are Out");
                System.out.println("Total Score= "+s);
                System.out.println("");
                System.out.println("");
                System.out.println("Its Bowling Time");
                int s1=0;
                for(int i=0;i<1000;i++)
                {
                    int bo1;
                    do
                    {
                        bo1=ob.nextInt();
                        if(bo1>10)
                        {
                            System.out.println("Ek ball mein itne runs nahi bante sirji");
                            continue;
                        }
                        break;
                    }while(true);
                    int b1=(int)(Math.random()*10.49);
                    System.out.println("Your No= "+bo1);
                    System.out.println("Computer's No= "+b1);
                    System.out.println();

                    if(bo1!=b1)
                    {
                        s1=s1+b1;
                        if(s1>s)
                        {
                            System.out.println("Total Score= "+s1);
                            System.out.println("Computer wins");

                            break;
                        }
                    }
                    else if(b1==bo1)
                    {
                        System.out.println("Computer is Out");
                        System.out.println("Total Score= "+s1);
                        break;
                    }

                }

                System.out.println("");
                System.out.println("");
                if(s>s1)
                {
                    System.out.println("You win. You have made your Mom and Dad proud");
                }
                else if(s<s1)
                {
                    System.out.println("Tumse Na ho paye ga");
                }
                else 
                {
                    System.out.println("Its a tie");
                }


            }
        }
    }
}

    