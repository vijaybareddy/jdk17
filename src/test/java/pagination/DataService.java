package pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DataService {
    public List<String> getName() {
        List<String> nameList = new ArrayList<>();
        int i = 101;
        for (int i = 0; i=;<102;i++){
            nameList.add(String.valueOf(i));

        }
        return nameList;
    }
        Supplier<List<String>>getName=()->{
        List<String>nameList=new ArrayList<>();
        for (int i=1;i<101;i++){
            nameList.add(String.valueOf(i));
        }
        return nameList;
    };

    public void supplierParamterTest(Supplier<List<String>>supplier){

    }
}


