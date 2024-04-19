package collectionlistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CollectionTest {
    public static void main(String[] args) {
        ReasturuntDemo reasturuntDemo=new ReasturuntDemo();
        reasturuntDemo.Name="vijay";
        reasturuntDemo.id="687877";
        reasturuntDemo.area="hyd";

        ReasturuntDemo reasturuntDemo1=new ReasturuntDemo();
        reasturuntDemo1.Name="vijayr";
        reasturuntDemo1.id="23455";
        reasturuntDemo1.area="mell";

        ReasturuntDemo reasturuntDemo2=new ReasturuntDemo();
        reasturuntDemo2.Name="vijayre";
        reasturuntDemo2.id="45678";
        reasturuntDemo2.area="kodad";

        List<ReasturuntDemo>reasturuntDemoList=new ArrayList<>();
        reasturuntDemoList.add(reasturuntDemo);
        reasturuntDemoList.add(reasturuntDemo1);
        reasturuntDemoList.add(reasturuntDemo2);

        for (int i=0;i<reasturuntDemoList.size();i++) {
            ReasturuntDemo forlooprest = reasturuntDemoList.get(i);
            System.out.println(forlooprest);



        }
        Predicate<ReasturuntDemo> testing = (reasturunt) -> reasturunt.Name.equals("vijayr");
        BiPredicate<ReasturuntDemo, Boolean> testing2 =
                ((reasturunt, aBoolean) -> reasturunt.Name.equals("vijayr") && aBoolean);

            Iterator<ReasturuntDemo>iterator=reasturuntDemoList.iterator();
            for (;iterator.hasNext();){
                ReasturuntDemo forloopresta=iterator.next();
                if (testing2.test(forloopresta,testing.test(reasturuntDemo))){
                    System.out.println(forloopresta);

                }
            }
            reasturuntDemoList.forEach(forloopresta ->{

                    System.out.println("Consumer"+forloopresta);

            });

        }
    }

