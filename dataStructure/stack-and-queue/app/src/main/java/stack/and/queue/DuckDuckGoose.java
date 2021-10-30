package stack.and.queue;

import java.util.List;

public class DuckDuckGoose {

    public String duckDuckGoosed(List<String> strList, int removedIndex) {
        System.out.println("n = " + removedIndex);
        System.out.println(strList);
        System.out.println("---------------------");

        int strCount = strList.size(); //number of element still in array
        int currentIndex = 0;
        while (strCount > 1) {
            for (int counter = 0; counter < removedIndex; counter++) {
                if ((strList.get(currentIndex).equals("_"))) {
                    counter--;
                }
                else if (!(strList.get(currentIndex).equals("_")) && ((counter == removedIndex - 1))) {
                    strList.set(currentIndex, "_");
                    strCount--;
                }
                currentIndex++;
                if (currentIndex == strList.size()) {
                    currentIndex = 0;
                }
            }
            System.out.println(strList);
        }
        for (String str : strList) {
            String result=null;
            if (!str.equals("_")) {
                result= "last element left in the list --> " + str;
                System.out.println(result);
            }
        }
        return "";
    }

}
