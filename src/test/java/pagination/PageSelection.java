package pagination;
import java.util.ArrayList;
import java.util.List;
public class PageSelection {


        public static void main(String[] args) {
            int start = 1;
            int end = 101;
            int distance = 10;

            List<List<Integer>> pages = paginateNumbers(start, end, distance);

            for (int i = 0; i < pages.size(); i++) {
                System.out.println("Page " + (i + 1) + ": " + pages.get(i));
            }
        }

        public static List<List<Integer>> paginateNumbers(int start, int end, int distance) {
            List<List<Integer>> pages = new ArrayList<>();
            List<Integer> currentPage = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                currentPage.add(i);


                if (currentPage.size() == distance || i == end) {
                    pages.add(new ArrayList<>(currentPage));
                    currentPage.clear();
                }
            }

            return pages;
        }
    }

