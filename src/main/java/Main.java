import Exceptions.Checked;
import Exceptions.Unchecked;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String ,Double> map1 = new HashMap<>();
        map1.put("AVSDRE",100.00);
        map1.put("AVSD3223E",40.00);
        map1.put("AV232323SDRE",-1000.00);
        try {
            map1.put(null, 1000.00);
            throw new Checked();
        }
        catch (Checked e) {
            System.out.println(e);

        }
        try{
            map1.put("HJSHDHFDUF", -1000.00);
            throw new Unchecked();
        } catch (Unchecked e) {
            System.out.println(e);
        }

        Set<String> chaves = map1.keySet();
        for (String chave : chaves)
        {
            if(chave != null){
                System.out.println(chave + map1.get(chave));

            }
        }
    }
}
